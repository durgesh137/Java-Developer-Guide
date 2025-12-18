# Exception Handling - Interview Questions

[← Back to Problem Set](problem-set.md)

## Table of Contents
1. [Basic Concepts](#basic-concepts)
2. [Exception Hierarchy](#exception-hierarchy)
3. [Try-Catch-Finally](#try-catch-finally)
4. [Checked vs Unchecked Exceptions](#checked-vs-unchecked-exceptions)
5. [Custom Exceptions](#custom-exceptions)
6. [Best Practices](#best-practices)

---

## Basic Concepts

1. [What is an exception in Java?](./solutions/exception-handling-solutions.md#q1-what-is-an-exception-in-java)

2. [What is exception handling?](./solutions/exception-handling-solutions.md#q2-what-is-exception-handling)

3. [What are the advantages of exception handling?](./solutions/exception-handling-solutions.md#q3-what-are-the-advantages-of-exception-handling)

4. [What is the difference between Error and Exception?](./solutions/exception-handling-solutions.md#q4-what-is-the-difference-between-error-and-exception)

5. [What is the base class for all exceptions?](./solutions/exception-handling-solutions.md#q5-what-is-the-base-class-for-all-exceptions)

6. [What happens if an exception is not handled?](./solutions/exception-handling-solutions.md#q6-what-happens-if-an-exception-is-not-handled)

7. [Can we have multiple catch blocks for a single try block?](./solutions/exception-handling-solutions.md#q7-can-we-have-multiple-catch-blocks-for-a-single-try-block)

8. [What is the purpose of the `throws` keyword?](./solutions/exception-handling-solutions.md#q8-what-is-the-purpose-of-the-throws-keyword)

9. [What is the purpose of the `throw` keyword?](./solutions/exception-handling-solutions.md#q9-what-is-the-purpose-of-the-throw-keyword)

10. [What is the difference between `throw` and `throws`?](./solutions/exception-handling-solutions.md#q10-what-is-the-difference-between-throw-and-throws)

[↑ Back to Table of Contents](#table-of-contents)

---

## Exception Hierarchy

11. [Explain the exception hierarchy in Java.](./solutions/exception-handling-solutions.md#q11-explain-the-exception-hierarchy-in-java)

12. [What is the `Throwable` class?](./solutions/exception-handling-solutions.md#q12-what-is-the-throwable-class)

13. [What are the direct subclasses of `Throwable`?](./solutions/exception-handling-solutions.md#q13-what-are-the-direct-subclasses-of-throwable)

14. [Name some common exceptions in Java.](./solutions/exception-handling-solutions.md#q14-name-some-common-exceptions-in-java)

15. [What is `NullPointerException`? When does it occur?](./solutions/exception-handling-solutions.md#q15-what-is-nullpointerexception-when-does-it-occur)

16. [What is `ArrayIndexOutOfBoundsException`?](./solutions/exception-handling-solutions.md#q16-what-is-arrayindexoutofboundsexception)

17. [What is `ClassCastException`?](./solutions/exception-handling-solutions.md#q17-what-is-classcastexception)

18. [What is `IllegalArgumentException`?](./solutions/exception-handling-solutions.md#q18-what-is-illegalargumentexception)

19. [What is `NumberFormatException`?](./solutions/exception-handling-solutions.md#q19-what-is-numberformatexception)

20. [What is `ArithmeticException`?](./solutions/exception-handling-solutions.md#q20-what-is-arithmeticexception)

[↑ Back to Table of Contents](#table-of-contents)

---

## Try-Catch-Finally

21. [What is the syntax of try-catch-finally?](./solutions/exception-handling-solutions.md#q21-what-is-the-syntax-of-try-catch-finally)

22. [Is it mandatory to have a catch block with try?](./solutions/exception-handling-solutions.md#q22-is-it-mandatory-to-have-a-catch-block-with-try)

23. [Can we have try without catch?](./solutions/exception-handling-solutions.md#q23-can-we-have-try-without-catch)

24. [Can we have multiple finally blocks?](./solutions/exception-handling-solutions.md#q24-can-we-have-multiple-finally-blocks)

25. [Will the finally block execute if there is a return statement in try or catch?](./solutions/exception-handling-solutions.md#q25-will-the-finally-block-execute-if-there-is-a-return-statement-in-try-or-catch)

26. [Will the finally block execute if `System.exit()` is called?](./solutions/exception-handling-solutions.md#q26-will-the-finally-block-execute-if-systemexit-is-called)

27. [What is try-with-resources (Java 7)?](./solutions/exception-handling-solutions.md#q27-what-is-try-with-resources-java-7)

28. [What are the advantages of try-with-resources?](./solutions/exception-handling-solutions.md#q28-what-are-the-advantages-of-try-with-resources)

29. [What is the `AutoCloseable` interface?](./solutions/exception-handling-solutions.md#q29-what-is-the-autocloseable-interface)

30. [Can you have a catch block after try-with-resources?](./solutions/exception-handling-solutions.md#q30-can-you-have-a-catch-block-after-try-with-resources)

31. [What happens if an exception occurs in the finally block?](./solutions/exception-handling-solutions.md#q31-what-happens-if-an-exception-occurs-in-the-finally-block)

32. [Can you catch multiple exceptions in a single catch block (Java 7)?](./solutions/exception-handling-solutions.md#q32-can-you-catch-multiple-exceptions-in-a-single-catch-block-java-7)

33. [What is the order of catch blocks? Does it matter?](./solutions/exception-handling-solutions.md#q33-what-is-the-order-of-catch-blocks-does-it-matter)

34. [Can a catch block handle multiple exception types? How?](./solutions/exception-handling-solutions.md#q34-can-a-catch-block-handle-multiple-exception-types-how)

[↑ Back to Table of Contents](#table-of-contents)

---

## Checked vs Unchecked Exceptions

35. [What are checked exceptions?](./solutions/exception-handling-solutions.md#q35-what-are-checked-exceptions)

36. [What are unchecked exceptions?](./solutions/exception-handling-solutions.md#q36-what-are-unchecked-exceptions)

37. [What is the difference between checked and unchecked exceptions?](./solutions/exception-handling-solutions.md#q37-what-is-the-difference-between-checked-and-unchecked-exceptions)

38. [When should you use checked exceptions vs unchecked exceptions?](./solutions/exception-handling-solutions.md#q38-when-should-you-use-checked-exceptions-vs-unchecked-exceptions)

39. [Name some common checked exceptions.](./solutions/exception-handling-solutions.md#q39-name-some-common-checked-exceptions)

40. [Name some common unchecked exceptions.](./solutions/exception-handling-solutions.md#q40-name-some-common-unchecked-exceptions)

41. [Can you convert a checked exception to an unchecked exception?](./solutions/exception-handling-solutions.md#q41-can-you-convert-a-checked-exception-to-an-unchecked-exception)

42. [What is `RuntimeException`?](./solutions/exception-handling-solutions.md#q42-what-is-runtimeexception)

43. [Does the compiler check unchecked exceptions?](./solutions/exception-handling-solutions.md#q43-does-the-compiler-check-unchecked-exceptions)

44. [What is the best practice for handling checked exceptions?](./solutions/exception-handling-solutions.md#q44-what-is-the-best-practice-for-handling-checked-exceptions)

[↑ Back to Table of Contents](#table-of-contents)

---

## Custom Exceptions

45. [How do you create a custom exception?](./solutions/exception-handling-solutions.md#q45-how-do-you-create-a-custom-exception)

46. [Should custom exceptions extend Exception or RuntimeException?](./solutions/exception-handling-solutions.md#q46-should-custom-exceptions-extend-exception-or-runtimeexception)

47. [What are the best practices for creating custom exceptions?](./solutions/exception-handling-solutions.md#q47-what-are-the-best-practices-for-creating-custom-exceptions)

48. [Should you include a cause in custom exceptions?](./solutions/exception-handling-solutions.md#q48-should-you-include-a-cause-in-custom-exceptions)

49. [How do you add custom error messages to exceptions?](./solutions/exception-handling-solutions.md#q49-how-do-you-add-custom-error-messages-to-exceptions)

50. [When should you create a custom exception vs using built-in exceptions?](./solutions/exception-handling-solutions.md#q50-when-should-you-create-a-custom-exception-vs-using-built-in-exceptions)

[↑ Back to Table of Contents](#table-of-contents)

---

## Best Practices

51. [What are exception handling best practices?](./solutions/exception-handling-solutions.md#q51-what-are-exception-handling-best-practices)

52. [Should you catch `Exception` or specific exception types?](./solutions/exception-handling-solutions.md#q52-should-you-catch-exception-or-specific-exception-types)

53. [Should you use exceptions for control flow?](./solutions/exception-handling-solutions.md#q53-should-you-use-exceptions-for-control-flow)

54. [What is exception chaining?](./solutions/exception-handling-solutions.md#q54-what-is-exception-chaining)

55. [How do you preserve the stack trace when rethrowing an exception?](./solutions/exception-handling-solutions.md#q55-how-do-you-preserve-the-stack-trace-when-rethrowing-an-exception)

56. [What is the difference between `printStackTrace()` and logging exceptions?](./solutions/exception-handling-solutions.md#q56-what-is-the-difference-between-printstacktrace-and-logging-exceptions)

57. [Should you catch and ignore exceptions?](./solutions/exception-handling-solutions.md#q57-should-you-catch-and-ignore-exceptions)

58. [What is the "fail fast" principle?](./solutions/exception-handling-solutions.md#q58-what-is-the-fail-fast-principle)

59. [How do you handle exceptions in multi-threaded applications?](./solutions/exception-handling-solutions.md#q59-how-do-you-handle-exceptions-in-multi-threaded-applications)

60. [What are suppressed exceptions (Java 7)?](./solutions/exception-handling-solutions.md#q60-what-are-suppressed-exceptions-java-7)

61. [How do you log exceptions properly?](./solutions/exception-handling-solutions.md#q61-how-do-you-log-exceptions-properly)

62. [Should you catch `Throwable`?](./solutions/exception-handling-solutions.md#q62-should-you-catch-throwable)

63. [What is the performance impact of exception handling?](./solutions/exception-handling-solutions.md#q63-what-is-the-performance-impact-of-exception-handling)

64. [How do you handle exceptions in lambda expressions and streams?](./solutions/exception-handling-solutions.md#q64-how-do-you-handle-exceptions-in-lambda-expressions-and-streams)

65. [What is the difference between defensive programming and exception handling?](./solutions/exception-handling-solutions.md#q65-what-is-the-difference-between-defensive-programming-and-exception-handling)

66. [Should constructors throw exceptions?](./solutions/exception-handling-solutions.md#q66-should-constructors-throw-exceptions)

67. [How do you handle exceptions in finally blocks?](./solutions/exception-handling-solutions.md#q67-how-do-you-handle-exceptions-in-finally-blocks)

68. [What is the relationship between exceptions and transactions?](./solutions/exception-handling-solutions.md#q68-what-is-the-relationship-between-exceptions-and-transactions)

69. [How do you test exception handling in unit tests?](./solutions/exception-handling-solutions.md#q69-how-do-you-test-exception-handling-in-unit-tests)

70. [What are the common anti-patterns in exception handling?](./solutions/exception-handling-solutions.md#q70-what-are-the-common-anti-patterns-in-exception-handling)

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](problem-set.md)

