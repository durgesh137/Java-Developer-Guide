# Java 8 & 8+ Features - Interview Questions

[← Back to Problem Set](problem-set.md)

## Table of Contents
1. [Lambda Expressions](#lambda-expressions)
2. [Functional Interfaces](#functional-interfaces)
3. [Stream API](#stream-api)
4. [Optional](#optional)
5. [Default and Static Methods](#default-and-static-methods)
6. [Method References](#method-references)
7. [Date Time API](#date-time-api)
8. [Java 9+ Features](#java-9-features)

---

## Lambda Expressions

1. What is a lambda expression in Java 8?

2. What are the advantages of using lambda expressions?

3. What is the syntax of a lambda expression?

4. Can you write multiple statements in a lambda expression?

5. What are the different types of lambda expressions based on parameters?

6. Can a lambda expression throw an exception?

7. How do lambda expressions relate to anonymous inner classes?

[↑ Back to Table of Contents](#table-of-contents)

---

## Functional Interfaces

8. What is a functional interface?

9. What is the `@FunctionalInterface` annotation? Is it mandatory?

10. Can a functional interface extend another interface?

11. What are the built-in functional interfaces in Java 8?

12. Explain the `Predicate` functional interface with an example.

13. Explain the `Function` functional interface with an example.

14. Explain the `Consumer` functional interface with an example.

15. Explain the `Supplier` functional interface with an example.

16. What is the difference between `Predicate` and `Function`?

17. What are `BiPredicate`, `BiFunction`, and `BiConsumer`?

18. What is `UnaryOperator` and `BinaryOperator`?

[↑ Back to Table of Contents](#table-of-contents)

---

## Stream API

19. What is the Stream API in Java 8?

20. What is the difference between Collection and Stream?

21. What are intermediate operations in streams?

22. What are terminal operations in streams?

23. What is the difference between `map()` and `flatMap()`?

24. Explain the `filter()` operation with an example.

25. What is the difference between `findFirst()` and `findAny()`?

26. What is the purpose of the `reduce()` operation?

27. How do you convert a Stream to a List, Set, or Map?

28. What is `collect()` and what is a Collector?

29. Explain `Collectors.groupingBy()` with an example.

30. What is the difference between `Stream.of()` and `Arrays.stream()`?

31. Can you reuse a stream after it has been operated upon?

32. What is a parallel stream? How do you create one?

33. What are the advantages and disadvantages of parallel streams?

34. How does `peek()` differ from `forEach()`?

35. What is short-circuiting in streams? Give examples.

36. Explain lazy evaluation in streams.

37. How do you handle exceptions in stream operations?

38. What is the difference between `count()` and `sum()` in streams?

[↑ Back to Table of Contents](#table-of-contents)

---

## Optional

39. What is the Optional class? Why was it introduced?

40. How do you create an Optional object?

41. What is the difference between `Optional.of()`, `Optional.ofNullable()`, and `Optional.empty()`?

42. How do you retrieve a value from an Optional?

43. What is the difference between `orElse()` and `orElseGet()`?

44. What is `orElseThrow()` and when would you use it?

45. How does `ifPresent()` work?

46. What is `ifPresentOrElse()` (Java 9)?

47. Can you chain Optional operations? Give an example with `map()` and `flatMap()`.

48. What are the best practices for using Optional?

[↑ Back to Table of Contents](#table-of-contents)

---

## Default and Static Methods

49. What are default methods in interfaces?

50. Why were default methods introduced in Java 8?

51. Can you override a default method?

52. What happens if a class implements two interfaces with the same default method?

53. What are static methods in interfaces?

54. Can you call a static method from an implementing class?

[↑ Back to Table of Contents](#table-of-contents)

---

## Method References

55. What are method references in Java 8?

56. What are the different types of method references?

57. What is the syntax for a static method reference?

58. What is an instance method reference?

59. What is a constructor reference?

60. When should you use method references over lambda expressions?

[↑ Back to Table of Contents](#table-of-contents)

---

## Date Time API

61. Why was the new Date Time API introduced in Java 8?

62. What are the main classes in the Date Time API?

63. What is the difference between `LocalDate`, `LocalTime`, and `LocalDateTime`?

64. What is `ZonedDateTime`?

65. What is the `Period` class used for?

66. What is the `Duration` class used for?

67. How do you parse and format dates?

68. What is `Instant` and when would you use it?

69. How is the new Date Time API thread-safe?

[↑ Back to Table of Contents](#table-of-contents)

---

## Java 9+ Features

**Java 9 (70-80)**

70. What are the key features introduced in Java 9?

71. What is the Java Platform Module System (JPMS)?

72. What is a module descriptor (`module-info.java`)?

73. What are the benefits of the module system?

74. What are JShell and its use cases?

75. What are private methods in interfaces (Java 9)?

76. What are the enhancements to the Stream API in Java 9?

77. What is the `takeWhile()` method in streams?

78. What is the `dropWhile()` method in streams?

79. What are factory methods for collections (`List.of()`, `Set.of()`, `Map.of()`)?

80. What is the difference between `Arrays.asList()` and `List.of()`?

**Java 10-11 (81-90)**

81. What is local variable type inference (`var`) in Java 10?

82. What are the limitations of using `var`?

83. What are the new methods added to the Optional class in Java 10?

84. What are the key features of Java 11?

85. What is the `String.isBlank()` method?

86. What is the difference between `String.strip()` and `String.trim()`?

87. What is the `String.lines()` method?

88. What are the new File methods in Java 11 (`Files.readString()`, `Files.writeString()`)?

89. What is the new HTTP Client API in Java 11?

90. Can you use `var` with lambda parameters in Java 11?

**Java 12-17+ (91-100)**

91. What are switch expressions (Java 12-14)?

92. What is the `yield` keyword in switch expressions?

93. What are text blocks (Java 13-15)?

94. What are records in Java 14-16?

95. What are the benefits of using records?

96. What are sealed classes (Java 17)?

97. What is pattern matching for `instanceof` (Java 16)?

98. What are the enhancements to pattern matching in Java 17+?

99. What are virtual threads (Project Loom, Java 19+)?

100. What are the key features of Java 21 LTS?

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](problem-set.md)

