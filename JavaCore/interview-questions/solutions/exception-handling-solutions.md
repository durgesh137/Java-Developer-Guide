# Exception Handling - Interview Questions

[← Back to Problem Set](../problem-set.md)

## Table of Contents
1. [Basic Concepts](#basic-concepts)
2. [Exception Hierarchy](#exception-hierarchy)
3. [Try-Catch-Finally](#try-catch-finally)
4. [Checked vs Unchecked Exceptions](#checked-vs-unchecked-exceptions)
5. [Custom Exceptions](#custom-exceptions)
6. [Best Practices](#best-practices)

---

## Basic Concepts

### Q1. What is an exception in Java?

### Q2. What is exception handling?

### Q3. What are the advantages of exception handling?

### Q4. What is the difference between Error and Exception?

### Q5. What is the base class for all exceptions?

### Q6. What happens if an exception is not handled?

### Q7. Can we have multiple catch blocks for a single try block?

### Q8. What is the purpose of the `throws` keyword?

### Q9. What is the purpose of the `throw` keyword?

### Q10. What is the difference between `throw` and `throws`?

[↑ Back to Table of Contents](#table-of-contents)

---

## Exception Hierarchy

### Q11. Explain the exception hierarchy in Java.

### Q12. What is the `Throwable` class?

### Q13. What are the direct subclasses of `Throwable`?

### Q14. Name some common exceptions in Java.

### Q15. What is `NullPointerException`? When does it occur?

### Q16. What is `ArrayIndexOutOfBoundsException`?

### Q17. What is `ClassCastException`?

### Q18. What is `IllegalArgumentException`?

### Q19. What is `NumberFormatException`?

### Q20. What is `ArithmeticException`?

[↑ Back to Table of Contents](#table-of-contents)

---

## Try-Catch-Finally

### Q21. What is the syntax of try-catch-finally?

### Q22. Is it mandatory to have a catch block with try?

### Q23. Can we have try without catch?

### Q24. Can we have multiple finally blocks?

### Q25. Will the finally block execute if there is a return statement in try or catch?

### Q26. Will the finally block execute if `System.exit()` is called?

### Q27. What is try-with-resources (Java 7)?

### Q28. What are the advantages of try-with-resources?

### Q29. What is the `AutoCloseable` interface?

### Q30. Can you have a catch block after try-with-resources?

### Q31. What happens if an exception occurs in the finally block?

### Q32. Can you catch multiple exceptions in a single catch block (Java 7)?

### Q33. What is the order of catch blocks? Does it matter?

### Q34. Can a catch block handle multiple exception types? How?

[↑ Back to Table of Contents](#table-of-contents)

---

## Checked vs Unchecked Exceptions

### Q35. What are checked exceptions?

### Q36. What are unchecked exceptions?

### Q37. What is the difference between checked and unchecked exceptions?

### Q38. When should you use checked exceptions vs unchecked exceptions?

### Q39. Name some common checked exceptions.

### Q40. Name some common unchecked exceptions.

### Q41. Can you convert a checked exception to an unchecked exception?

### Q42. What is `RuntimeException`?

### Q43. Does the compiler check unchecked exceptions?

### Q44. What is the best practice for handling checked exceptions?

[↑ Back to Table of Contents](#table-of-contents)

---

## Custom Exceptions

### Q45. How do you create a custom exception?

### Q46. Should custom exceptions extend Exception or RuntimeException?

### Q47. What are the best practices for creating custom exceptions?

### Q48. Should you include a cause in custom exceptions?

### Q49. How do you add custom error messages to exceptions?

### Q50. When should you create a custom exception vs using built-in exceptions?

[↑ Back to Table of Contents](#table-of-contents)

---

## Best Practices

### Q51. What are exception handling best practices?

### Q52. Should you catch `Exception` or specific exception types?

### Q53. Should you use exceptions for control flow?

### Q54. What is exception chaining?

### Q55. How do you preserve the stack trace when rethrowing an exception?

### Q56. What is the difference between `printStackTrace()` and logging exceptions?

### Q57. Should you catch and ignore exceptions?

### Q58. What is the "fail fast" principle?

### Q59. How do you handle exceptions in multi-threaded applications?

### Q60. What are suppressed exceptions (Java 7)?

### Q61. How do you log exceptions properly?

### Q62. Should you catch `Throwable`?

### Q63. What is the performance impact of exception handling?

### Q64. How do you handle exceptions in lambda expressions and streams?

### Q65. What is the difference between defensive programming and exception handling?

### Q66. Should constructors throw exceptions?

### Q67. How do you handle exceptions in finally blocks?

### Q68. What is the relationship between exceptions and transactions?

### Q69. How do you test exception handling in unit tests?

### Q70. What are the common anti-patterns in exception handling?

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](../problem-set.md)

