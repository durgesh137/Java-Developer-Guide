# Inheritance

**Definition:** Mechanism where a class acquires properties and behaviors from another class.

**Status:** 🚀 In Progress (2/4 examples completed)

---

## Implemented Examples

### ✅ Employee Hierarchy (Completed)
Demonstrates `super` keyword usage and parent class method invocation:
- `Employee.java` - Base class with common employee properties
- `Manager.java` - Extends Employee with team management
- `Developer.java` - Extends Employee with technical skills

**Key Learning:** 
- How to use `super` to call parent class constructors
- How to use `super` to call parent class methods
- Rules and best practices for using `super`
- Common errors and how to avoid them

📖 [View Employee Hierarchy Documentation](#employee-hierarchy-detailed-documentation)

### ✅ Vehicle Hierarchy (Completed) - Multi-Package Example
Demonstrates access modifiers across packages:
- `vehicle/base/Vehicle.java` - Base class with protected members
- `vehicle/types/Car.java` - Extends Vehicle (different package)
- `vehicle/types/Bike.java` - Extends Vehicle (different package)
- `vehicle/manager/VehicleManager.java` - Manages vehicles (separate package)

**Key Learning:** 
- Understanding `protected` modifier significance when classes are in different packages
- How access modifiers behave across package boundaries
- Difference between protected access in same package vs different package
- What subclasses can access vs what external classes can access

📖 [View Vehicle Hierarchy Documentation](vehicle/VehicleHierarchy-MultiPackageExample.md)

---

## Planned Examples

### Animal Kingdom (Single Package)
- `Animal.java` - Base class with common animal behaviors
- `Dog.java` - Extends Animal with dog-specific behaviors
- `Cat.java` - Extends Animal with cat-specific behaviors

**Key Learning:** Method overriding and polymorphic behavior

### Shape Hierarchy (Single Package)
- `Shape.java` - Abstract base class
- `Circle.java` - Concrete shape implementation
- `Rectangle.java` - Concrete shape implementation

**Key Learning:** Abstract classes and constructor chaining

---

**Key Concepts:**
- extends keyword
- super keyword
- Method overriding
- Constructor chaining
- Types of inheritance
- Access modifiers in inheritance (private, protected, public, default)

## Access Modifier Summary in Inheritance

| Modifier | Same Class | Same Package | Subclass (Different Package) | Other Classes |
|----------|-----------|--------------|------------------------------|---------------|
| private | ✅ | ❌ | ❌ | ❌ |
| default | ✅ | ✅ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ❌ |
| public | ✅ | ✅ | ✅ | ✅ |

**Why Protected Matters:** When subclasses are in different packages, only `protected` and `public` members are accessible. This example demonstrates real-world scenarios where your domain model spans multiple packages.

---

## Employee Hierarchy Detailed Documentation

### The `super` Keyword - Complete Guide

The `super` keyword is a reference variable used to refer to the immediate parent class object. It has three primary uses in inheritance.

---

### 1. **Calling Parent Class Constructors**

**Syntax:** `super(arguments);`

**Rules:**
- ✅ Must be the **first statement** in the child class constructor
- ✅ Used to initialize parent class fields
- ✅ If not explicitly called, Java automatically calls `super()` (no-arg constructor)
- ❌ Cannot be used after any other statement

**Example from Employee Hierarchy:**
```java
public class Employee {
    protected String name;
    protected int id;
    protected double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

public class Manager extends Employee {
    private String department;
    
    public Manager(String name, int id, double salary, String department) {
        super(name, id, salary);  // ✅ First statement - calls parent constructor
        this.department = department;
    }
}
```

**Common Errors:**
```java
// ❌ ERROR: Constructor call must be first statement
public Manager(String name, int id, double salary, String department) {
    this.department = department;  // This comes first
    super(name, id, salary);       // ERROR: super() must be first!
}

// ❌ ERROR: No matching constructor in parent class
public Manager(String name, int id, double salary, String department) {
    super();  // ERROR: Employee has no no-arg constructor!
    // Must call super(name, id, salary)
}
```

---

### 2. **Calling Parent Class Methods**

**Syntax:** `super.methodName(arguments);`

**When to Use:**
- ✅ When child class **overrides** a parent method but wants to call the parent's version
- ✅ To extend parent functionality (call parent method + add extra logic)
- ✅ To reuse parent implementation instead of duplicating code

**Example from Employee Hierarchy:**
```java
public class Employee {
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
}

public class Manager extends Employee {
    private String department;
    
    @Override
    public void displayInfo() {
        super.displayInfo();  // ✅ Call parent's displayInfo() first
        // Then add manager-specific info
        System.out.println("Department: " + department);
        System.out.println("Role: Manager");
    }
}
```

**Why This is Powerful:**
- Avoids code duplication (don't rewrite parent logic)
- Maintains single source of truth
- Easy to maintain (changes to parent automatically reflect in child)

**Common Patterns:**

**Pattern 1: Extend Parent Functionality**
```java
@Override
public void displayInfo() {
    super.displayInfo();           // Call parent first
    System.out.println("Extra");   // Add child-specific logic
}
```

**Pattern 2: Customize Parent Behavior**
```java
@Override
public double calculateBonus() {
    double baseBonus = super.calculateBonus();  // Get parent calculation
    return baseBonus * 1.5;  // Modify it for this subclass
}
```

---

### 3. **Accessing Parent Class Fields**

**Syntax:** `super.fieldName`

**When to Use:**
- ✅ When child class has a field with the **same name** as parent (field shadowing)
- ✅ Rarely needed if fields are properly named

**Example:**
```java
public class Employee {
    protected String name = "Employee";
}

public class Manager extends Employee {
    private String name = "Manager";  // Shadows parent's name
    
    public void printNames() {
        System.out.println(name);        // Prints "Manager" (child's field)
        System.out.println(super.name);  // Prints "Employee" (parent's field)
    }
}
```

**Best Practice:** Avoid field shadowing. Use different field names or access parent fields through methods.

---

## Rules for Using `super`

### Constructor Rules

| Rule | Description | Example |
|------|-------------|---------|
| **Must be first** | `super()` must be the first statement in constructor | `super(args);` then other code |
| **Automatic call** | If no `super()`, Java calls `super()` automatically | Parent must have no-arg constructor |
| **One call only** | Cannot call `super()` multiple times | Only one `super()` call allowed |
| **Before `this()`** | Cannot use both `super()` and `this()` in same constructor | Choose one |

### Method Rules

| Rule | Description | Example |
|------|-------------|---------|
| **Can call anytime** | `super.method()` can be anywhere in method | Not restricted to first line |
| **Overridden methods** | Mainly used when method is overridden | Access parent's implementation |
| **Can't skip levels** | Can only access immediate parent | Can't do `super.super.method()` |
| **Static context** | Cannot use `super` in static methods | `super` refers to instance |

---

## Common Errors and Solutions

### Error 1: Constructor Call Not First Statement
```java
// ❌ WRONG
public Manager(String name, int id, double salary, String dept) {
    this.department = dept;
    super(name, id, salary);  // ERROR!
}

// ✅ CORRECT
public Manager(String name, int id, double salary, String dept) {
    super(name, id, salary);  // First statement
    this.department = dept;
}
```

### Error 2: No Matching Parent Constructor
```java
// Parent class
public class Employee {
    public Employee(String name, int id) { }
    // No no-arg constructor!
}

// ❌ WRONG
public class Manager extends Employee {
    public Manager(String name) {
        // Implicit super() call fails - no no-arg constructor in Employee!
    }
}

// ✅ CORRECT
public class Manager extends Employee {
    public Manager(String name, int id) {
        super(name, id);  // Explicitly call matching constructor
    }
}
```

### Error 3: Using `super` in Static Context
```java
// ❌ WRONG
public static void staticMethod() {
    super.someMethod();  // ERROR: Cannot use super in static context
}

// ✅ CORRECT
public void instanceMethod() {
    super.someMethod();  // OK: super works in instance methods
}
```

### Error 4: Forgetting to Call `super()` When Parent Has No No-Arg Constructor
```java
// Parent
public class Employee {
    public Employee(String name) { }  // Only parameterized constructor
}

// ❌ WRONG - Compilation error
public class Manager extends Employee {
    public Manager() {
        // Implicit super() call fails!
    }
}

// ✅ CORRECT
public class Manager extends Employee {
    public Manager() {
        super("Default Name");  // Must explicitly provide arguments
    }
}
```

---

## When to Use `super` - Decision Guide

### Use `super()` in Constructor When:
✅ Parent class has fields that need initialization  
✅ Parent class has only parameterized constructors  
✅ You want to ensure parent is properly initialized  
✅ Parent constructor has important logic/validation  

### Use `super.method()` When:
✅ You override a method but want parent's behavior too  
✅ You want to extend (not replace) parent functionality  
✅ You need to reuse parent's implementation  
✅ You want to avoid code duplication  

### Don't Use `super` When:
❌ Parent has a no-arg constructor and no special initialization needed  
❌ You're completely replacing parent's method (no need for parent version)  
❌ You're not overriding any parent method  
❌ You want to hide/replace parent behavior entirely  

---

## Best Practices from Employee Example

### 1. **Always Call Parent Constructor Explicitly**
```java
// ✅ GOOD: Clear and explicit
public Manager(String name, int id, double salary, String department) {
    super(name, id, salary);
    this.department = department;
}
```

### 2. **Extend Parent Methods, Don't Duplicate**
```java
// ✅ GOOD: Reuses parent logic
@Override
public void displayInfo() {
    super.displayInfo();  // Parent handles common fields
    System.out.println("Department: " + department);  // Add child-specific
}

// ❌ BAD: Duplicates parent code
@Override
public void displayInfo() {
    System.out.println("Name: " + name);     // Duplicated from parent
    System.out.println("ID: " + id);         // Duplicated from parent
    System.out.println("Salary: " + salary); // Duplicated from parent
    System.out.println("Department: " + department);
}
```

### 3. **Use `@Override` Annotation**
```java
// ✅ GOOD: Compiler verifies you're actually overriding
@Override
public void displayInfo() {
    super.displayInfo();
    // ...
}
```

### 4. **Document Why You're Using `super`**
```java
// ✅ GOOD: Clear intent
@Override
public void displayInfo() {
    super.displayInfo();  // Display common employee info
    // Add manager-specific details
    System.out.println("Department: " + department);
}
```

---

## Summary - `super` Keyword Cheat Sheet

| Usage | Syntax | Must Be First? | Common Use Case |
|-------|--------|----------------|-----------------|
| **Call parent constructor** | `super(args);` | ✅ Yes | Initialize parent fields |
| **Call parent method** | `super.method();` | ❌ No | Extend parent functionality |
| **Access parent field** | `super.field` | ❌ No | Resolve field shadowing |

**Key Takeaway:** `super` is your bridge to parent class functionality. Use it to build upon, not replace, parent behavior.

---

