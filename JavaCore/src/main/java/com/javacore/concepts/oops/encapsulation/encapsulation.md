# Encapsulation

**Definition:** Bundling data and methods within a class, restricting direct access to data.

**Status:** ✅ Completed

## Implemented Examples

### 1. PasswordManager.java
Secure password hashing and verification utility demonstrating:
- Private helper methods for security logic
- Public API for hash generation and verification
- Data hiding of salt generation and hashing algorithms
- Encapsulation of cryptographic operations

### 2. UserProfile.java
Full-featured user profile model demonstrating:
- Private fields with public getters/setters
- Input validation in setters (email format, null checks)
- Defensive copies for collections (roles, preferences)
- Immutable UUID identifier
- Automatic timestamp management (createdAt, updatedAt)
- Computed property (age calculation)
- Unmodifiable views for collections
- Business logic encapsulation (addRole, putPreference)

### 3. BankAccount.java
Banking operations model demonstrating:
- Private balance field with controlled access
- Validation in deposit/withdraw methods
- Transaction history tracking
- Business rules enforcement (minimum balance, withdrawal limits)
- Read-only access to sensitive data

## Key Concepts Covered

- **Access Modifiers:** private fields, public methods
- **Data Hiding:** preventing direct field access
- **Validation:** enforcing business rules in setters
- **Defensive Copying:** protecting mutable collections
- **Immutability:** UUID identifiers, audit timestamps
- **Encapsulated Logic:** domain operations within the class

## Usage Examples

**UserProfile:**
```java
UserProfile user = new UserProfile("jdoe", "John Doe", "jdoe@example.com", "hashedPassword", LocalDate.of(1990, 1, 1));
user.addRole("USER");
user.putPreference("theme", "dark");
int age = user.getAge();
System.out.println(user.getUsername() + " is " + age + " years old");
```

**PasswordManager:**
```java
PasswordManager pm = new PasswordManager("MyPass123");
String currentPassword = pm.getPassword();
pm.setPassword("NewSecure456"); // validates before setting
```

**BankAccount:**
```java
BankAccount account = new BankAccount("ACC123", 1000.0);
account.setBalance(1500.0);
double balance = account.getBalance();
System.out.println("Account " + account.getAccountNumber() + " has balance: " + balance);
```

## Interview Questions

1. **What is encapsulation and why is it important?**
   - Encapsulation is bundling data (fields) and methods that operate on that data within a single unit (class), and restricting direct access to some of the object's components. It's important for data hiding, modularity, maintainability, and security.

2. **Explain the difference between private, protected, and public access modifiers.**
   - `private`: accessible only within the same class
   - `protected`: accessible within the same package and by subclasses
   - `public`: accessible from anywhere

3. **Why should collections be returned as unmodifiable views?**
   - To prevent external code from modifying internal state directly, maintaining encapsulation and data integrity.

4. **How does encapsulation help with maintainability?**
   - Changes to internal implementation don't affect external code. Validation logic is centralized in setters. Business rules are enforced consistently.

5. **What is defensive copying and when should it be used?**
   - Creating a copy of mutable objects when storing or returning them to prevent external modifications. Used when dealing with mutable collections or objects to maintain encapsulation.

6. **Why use getters and setters instead of public fields?**
   - Allows validation, transformation, and side effects when accessing/modifying data. Provides flexibility to change implementation without breaking client code.

7. **What are the benefits of immutable fields like UUID?**
   - Thread-safe, predictable behavior, can be safely shared, and prevent accidental modification of critical identifiers.

8. **How does UserProfile demonstrate encapsulation principles?**
   - Private fields, public controlled access, validation in setters, defensive copies for collections, computed properties, and business logic encapsulation.

## Best Practices Demonstrated

- Always use private fields unless there's a compelling reason not to
- Validate inputs in constructors and setters
- Return defensive copies or unmodifiable views of mutable collections
- Use immutable types for identifiers (UUID, final primitives)
- Encapsulate business logic within the class
- Provide meaningful method names that express intent
- Use `Objects.requireNonNull()` for mandatory fields
- Automatically track audit fields (timestamps)

## Related Concepts

- **Data Hiding:** Implementation details hidden from external access
- **Information Hiding:** Exposing only necessary interfaces
- **Single Responsibility Principle:** Each class has one reason to change
- **Open/Closed Principle:** Open for extension, closed for modification

---

*Part of JavaCore module - OOP Fundamentals*

