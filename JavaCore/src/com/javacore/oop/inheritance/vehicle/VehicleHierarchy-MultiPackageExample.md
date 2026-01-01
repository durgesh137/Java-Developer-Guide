# Vehicle Hierarchy - Multi-Package Example

## Purpose
Demonstrates the **significance of the `protected` modifier** when classes are organized across different packages.

## Package Structure
```
vehicle/
├── base/
│   └── Vehicle.java          (Base class with various access modifiers)
├── types/
│   ├── Car.java              (Subclass in different package)
│   └── Bike.java             (Subclass in different package)
└── manager/
    └── VehicleManager.java    (Non-subclass in different package)
```

## Key Learnings

### 1. Protected Modifier Behavior
- **Within hierarchy (subclasses):** ✅ Accessible even across packages
- **Outside hierarchy:** ❌ Not accessible, even in same project

### 2. What Car/Bike CAN Access from Vehicle
- ✅ `protected` fields: `brand`, `year`
- ✅ `protected` methods: `startEngine()`, `getVehicleInfo()`
- ✅ `public` fields: `registrationNumber`
- ✅ `public` methods: `displayInfo()`

### 3. What Car/Bike CANNOT Access
- ❌ `private` fields: `engineNumber` (use protected getter instead)
- ❌ `package-private` fields: `chassisNumber` (different package)
- ❌ `package-private` methods: `generateChassisNumber()` (different package)

### 4. What VehicleManager CAN Access
- ✅ Only `public` members: `registrationNumber`, `displayInfo()`
- ❌ Everything else is hidden from non-subclasses

## Why This Matters

### Real-World Scenario
In enterprise applications:
- **Domain models** (`vehicle.base`) define core entities
- **Specialized types** (`vehicle.types`) extend behavior
- **Service/Manager classes** (`vehicle.manager`) orchestrate operations

### Design Principle
Use `protected` when you want to:
1. Hide implementation details from external code (encapsulation)
2. Allow subclasses to customize behavior (extensibility)
3. Control which parts of your class hierarchy are "public API"

## Running the Example
```bash
# Compile all files
javac vehicle/base/Vehicle.java vehicle/types/*.java vehicle/manager/VehicleManager.java

# Run the manager
java oop.inheritance.vehicle.manager.VehicleManager
```

## Expected Output
The output will show:
- How VehicleManager has limited access (only public members)
- How Car/Bike can access protected members for customization
- The difference between what's accessible inside vs outside the hierarchy

## Exercise
Try uncommenting the error lines to see compile-time errors demonstrating access restrictions.

