# JPA (Java Persistence API) - Interview Questions

[← Back to Problem Set](problem-set.md)

## Table of Contents
1. [JPA Basics](#jpa-basics)
2. [Entity Management](#entity-management)
3. [Entity Relationships](#entity-relationships)
4. [JPQL & Queries](#jpql--queries)
5. [Entity Lifecycle](#entity-lifecycle)
6. [Performance & Optimization](#performance--optimization)

---

## JPA Basics

1. What is JPA?

2. What is ORM (Object-Relational Mapping)?

3. What are the benefits of using JPA?

4. What is the difference between JPA and Hibernate?

5. What are the main components of JPA?

6. What is an Entity in JPA?

7. What is EntityManager?

8. What is EntityManagerFactory?

9. What is Persistence Context?

10. What is persistence.xml?

11. What are JPA providers?

12. What is the difference between JPA and JDBC?

[↑ Back to Table of Contents](#table-of-contents)

---

## Entity Management

13. What is `@Entity` annotation?

14. What is `@Table` annotation?

15. What is `@Id` annotation?

16. What is `@GeneratedValue` annotation?

17. What are the different ID generation strategies?

18. What is `@Column` annotation?

19. What is `@Transient` annotation?

20. What is `@Temporal` annotation?

21. What is `@Enumerated` annotation?

22. What is `@Lob` annotation?

23. What is `@Embedded` and `@Embeddable`?

24. What is composite primary key?

25. What is `@IdClass` annotation?

26. What is `@EmbeddedId` annotation?

27. What is the difference between `@IdClass` and `@EmbeddedId`?

[↑ Back to Table of Contents](#table-of-contents)

---

## Entity Relationships

28. What are the types of relationships in JPA?

29. What is `@OneToOne` relationship?

30. What is `@OneToMany` relationship?

31. What is `@ManyToOne` relationship?

32. What is `@ManyToMany` relationship?

33. What is the `mappedBy` attribute?

34. What is cascading in JPA?

35. What are the cascade types?

36. What is `@JoinColumn` annotation?

37. What is `@JoinTable` annotation?

38. What is fetch type in JPA?

39. What is the difference between EAGER and LAZY fetching?

40. What is the N+1 problem?

41. How do you solve the N+1 problem?

42. What is bidirectional relationship?

43. What is unidirectional relationship?

44. When should you use bidirectional vs unidirectional relationships?

[↑ Back to Table of Contents](#table-of-contents)

---

## JPQL & Queries

45. What is JPQL?

46. What is the difference between JPQL and SQL?

47. How do you write a simple JPQL query?

48. What is `@NamedQuery` annotation?

49. What is `@NamedNativeQuery` annotation?

50. What is the difference between JPQL and native queries?

51. How do you use parameters in JPQL?

52. What is the difference between positional and named parameters?

53. What is Criteria API?

54. When should you use Criteria API vs JPQL?

55. How do you perform joins in JPQL?

56. How do you perform aggregation in JPQL?

57. How do you use pagination in JPQL?

58. What is `@Query` annotation in Spring Data JPA?

59. How do you write dynamic queries?

60. What is QueryDSL?

[↑ Back to Table of Contents](#table-of-contents)

---

## Entity Lifecycle

61. What are the entity states in JPA?

62. What is the NEW/Transient state?

63. What is the MANAGED/Persistent state?

64. What is the DETACHED state?

65. What is the REMOVED state?

66. How do you persist an entity?

67. What is the difference between `persist()` and `merge()`?

68. What is the `find()` method?

69. What is the `getReference()` method?

70. What is the difference between `find()` and `getReference()`?

71. How do you remove an entity?

72. What is the `flush()` method?

73. What is the `clear()` method?

74. What is the `detach()` method?

75. What is the `refresh()` method?

[↑ Back to Table of Contents](#table-of-contents)

---

## Performance & Optimization

76. What is caching in JPA?

77. What is first-level cache?

78. What is second-level cache?

79. How do you enable second-level cache?

80. What is query cache?

81. What is batch processing in JPA?

82. How do you configure batch size?

83. What is dirty checking?

84. How do you optimize LAZY loading?

85. What is EntityGraph?

86. What is `@EntityGraph` annotation?

87. How do you use fetch joins?

88. What is the difference between JOIN FETCH and JOIN?

89. What are DTO projections?

90. How do you handle large result sets?

91. What is optimistic locking?

92. What is pessimistic locking?

93. What is `@Version` annotation?

94. How do you handle concurrent updates?

95. What are lifecycle callbacks (`@PrePersist`, `@PostPersist`, etc.)?

96. What is `@EntityListeners` annotation?

97. How do you implement auditing in JPA?

98. What is soft delete?

99. How do you debug JPA queries?

100. What are common JPA performance issues and solutions?

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](problem-set.md)

