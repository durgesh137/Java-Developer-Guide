# Hibernate - Interview Questions

[← Back to Problem Set](problem-set.md)

## Table of Contents
1. [Hibernate Basics](#hibernate-basics)
2. [Hibernate Configuration](#hibernate-configuration)
3. [Session & SessionFactory](#session--sessionfactory)
4. [Hibernate Mapping](#hibernate-mapping)
5. [HQL & Criteria](#hql--criteria)
6. [Caching](#caching)
7. [Performance Tuning](#performance-tuning)
8. [Advanced Topics](#advanced-topics)

---

## Hibernate Basics

1. [What is Hibernate?](./solutions/hibernate-solutions.md#q1-what-is-hibernate)

2. [What are the advantages of Hibernate?](./solutions/hibernate-solutions.md#q2-what-are-the-advantages-of-hibernate)

3. [What is the difference between Hibernate and JPA?](./solutions/hibernate-solutions.md#q3-what-is-the-difference-between-hibernate-and-jpa)

4. [What are the core interfaces of Hibernate?](./solutions/hibernate-solutions.md#q4-what-are-the-core-interfaces-of-hibernate)

5. [What is the Hibernate architecture?](./solutions/hibernate-solutions.md#q5-what-is-the-hibernate-architecture)

6. [What are the different states of an object in Hibernate?](./solutions/hibernate-solutions.md#q6-what-are-the-different-states-of-an-object-in-hibernate)

7. [What is SessionFactory?](./solutions/hibernate-solutions.md#q7-what-is-sessionfactory)

8. [What is Session?](./solutions/hibernate-solutions.md#q8-what-is-session)

9. [What is Transaction?](./solutions/hibernate-solutions.md#q9-what-is-transaction)

10. [What is Query?](./solutions/hibernate-solutions.md#q10-what-is-query)

11. [What is Criteria?](./solutions/hibernate-solutions.md#q11-what-is-criteria)

12. [Is Hibernate thread-safe?](./solutions/hibernate-solutions.md#q12-is-hibernate-thread-safe)

[↑ Back to Table of Contents](#table-of-contents)

---

## Hibernate Configuration

13. [What is hibernate.cfg.xml?](./solutions/hibernate-solutions.md#q13-what-is-hibernatecfgxml)

14. [What are the important properties in Hibernate configuration?](./solutions/hibernate-solutions.md#q14-what-are-the-important-properties-in-hibernate-configuration)

15. [What is hibernate.hbm2ddl.auto?](./solutions/hibernate-solutions.md#q15-what-is-hibernatehbm2ddlauto)

16. [What are the values for hibernate.hbm2ddl.auto?](./solutions/hibernate-solutions.md#q16-what-are-the-values-for-hibernatehbm2ddlauto)

17. [What is hibernate.show_sql?](./solutions/hibernate-solutions.md#q17-what-is-hibernateshow_sql)

18. [What is hibernate.format_sql?](./solutions/hibernate-solutions.md#q18-what-is-hibernateformat_sql)

19. [What is dialect in Hibernate?](./solutions/hibernate-solutions.md#q19-what-is-dialect-in-hibernate)

20. [How do you configure connection pooling in Hibernate?](./solutions/hibernate-solutions.md#q20-how-do-you-configure-connection-pooling-in-hibernate)

21. [What is C3P0 connection pool?](./solutions/hibernate-solutions.md#q21-what-is-c3p0-connection-pool)

22. [How do you configure Hibernate with Spring Boot?](./solutions/hibernate-solutions.md#q22-how-do-you-configure-hibernate-with-spring-boot)

[↑ Back to Table of Contents](#table-of-contents)

---

## Session & SessionFactory

23. [What is SessionFactory?](./solutions/hibernate-solutions.md#q23-what-is-sessionfactory)

24. [Is SessionFactory thread-safe?](./solutions/hibernate-solutions.md#q24-is-sessionfactory-thread-safe)

25. [Is SessionFactory heavyweight?](./solutions/hibernate-solutions.md#q25-is-sessionfactory-heavyweight)

26. [What is the difference between openSession() and getCurrentSession()?](./solutions/hibernate-solutions.md#q26-what-is-the-difference-between-opensession-and-getcurrentsession)

27. [What is Session in Hibernate?](./solutions/hibernate-solutions.md#q27-what-is-session-in-hibernate)

28. [Is Session thread-safe?](./solutions/hibernate-solutions.md#q28-is-session-thread-safe)

29. [What is the difference between Session and EntityManager?](./solutions/hibernate-solutions.md#q29-what-is-the-difference-between-session-and-entitymanager)

30. [What is the difference between save() and persist()?](./solutions/hibernate-solutions.md#q30-what-is-the-difference-between-save-and-persist)

31. [What is the difference between get() and load()?](./solutions/hibernate-solutions.md#q31-what-is-the-difference-between-get-and-load)

32. [What is the difference between update() and merge()?](./solutions/hibernate-solutions.md#q32-what-is-the-difference-between-update-and-merge)

33. [What is the difference between delete() and remove()?](./solutions/hibernate-solutions.md#q33-what-is-the-difference-between-delete-and-remove)

34. [What is saveOrUpdate()?](./solutions/hibernate-solutions.md#q34-what-is-saveorupdate)

35. [What is flush() in Hibernate?](./solutions/hibernate-solutions.md#q35-what-is-flush-in-hibernate)

36. [What is clear() in Hibernate?](./solutions/hibernate-solutions.md#q36-what-is-clear-in-hibernate)

37. [What is evict() in Hibernate?](./solutions/hibernate-solutions.md#q37-what-is-evict-in-hibernate)

38. [When should you call flush()?](./solutions/hibernate-solutions.md#q38-when-should-you-call-flush)

[↑ Back to Table of Contents](#table-of-contents)

---

## Hibernate Mapping

39. [What are the different ways to map entities in Hibernate?](./solutions/hibernate-solutions.md#q39-what-are-the-different-ways-to-map-entities-in-hibernate)

40. [What is XML mapping?](./solutions/hibernate-solutions.md#q40-what-is-xml-mapping)

41. [What is annotation-based mapping?](./solutions/hibernate-solutions.md#q41-what-is-annotation-based-mapping)

42. [What is @Entity annotation?](./solutions/hibernate-solutions.md#q42-what-is-entity-annotation)

43. [What is @Table annotation?](./solutions/hibernate-solutions.md#q43-what-is-table-annotation)

44. [What is @Id annotation?](./solutions/hibernate-solutions.md#q44-what-is-id-annotation)

45. [What is @GeneratedValue annotation?](./solutions/hibernate-solutions.md#q45-what-is-generatedvalue-annotation)

46. [What are the ID generation strategies in Hibernate?](./solutions/hibernate-solutions.md#q46-what-are-the-id-generation-strategies-in-hibernate)

47. [What is @Column annotation?](./solutions/hibernate-solutions.md#q47-what-is-column-annotation)

48. [What is @Transient annotation?](./solutions/hibernate-solutions.md#q48-what-is-transient-annotation)

49. [What is component mapping?](./solutions/hibernate-solutions.md#q49-what-is-component-mapping)

50. [What is @Embeddable and @Embedded?](./solutions/hibernate-solutions.md#q50-what-is-embeddable-and-embedded)

51. [What is inheritance mapping in Hibernate?](./solutions/hibernate-solutions.md#q51-what-is-inheritance-mapping-in-hibernate)

52. [What are the inheritance strategies (SINGLE_TABLE, JOINED, TABLE_PER_CLASS)?](./solutions/hibernate-solutions.md#q52-what-are-the-inheritance-strategies-singletable-joined-table_per_class)

53. [What is @Inheritance annotation?](./solutions/hibernate-solutions.md#q53-what-is-inheritance-annotation)

54. [What is @DiscriminatorColumn and @DiscriminatorValue?](./solutions/hibernate-solutions.md#q54-what-is-discriminatorcolumn-and-discriminatordalue)

[↑ Back to Table of Contents](#table-of-contents)

---

## HQL & Criteria

55. [What is HQL?](./solutions/hibernate-solutions.md#q55-what-is-hql)

56. [What is the difference between HQL and SQL?](./solutions/hibernate-solutions.md#q56-what-is-the-difference-between-hql-and-sql)

57. [What is the syntax of HQL?](./solutions/hibernate-solutions.md#q57-what-is-the-syntax-of-hql)

58. [How do you use parameters in HQL?](./solutions/hibernate-solutions.md#q58-how-do-you-use-parameters-in-hql)

59. [What is the difference between positional and named parameters?](./solutions/hibernate-solutions.md#q59-what-is-the-difference-between-positional-and-named-parameters)

60. [How do you perform joins in HQL?](./solutions/hibernate-solutions.md#q60-how-do-you-perform-joins-in-hql)

61. [How do you use aggregate functions in HQL?](./solutions/hibernate-solutions.md#q61-how-do-you-use-aggregate-functions-in-hql)

62. [What is the Criteria API?](./solutions/hibernate-solutions.md#q62-what-is-the-criteria-api)

63. [What is the difference between HQL and Criteria API?](./solutions/hibernate-solutions.md#q63-what-is-the-difference-between-hql-and-criteria-api)

64. [How do you create a Criteria query?](./solutions/hibernate-solutions.md#q64-how-do-you-create-a-criteria-query)

65. [What are Restrictions in Criteria API?](./solutions/hibernate-solutions.md#q65-what-are-restrictions-in-criteria-api)

66. [What are Projections in Criteria API?](./solutions/hibernate-solutions.md#q66-what-are-projections-in-criteria-api)

67. [What is native SQL query in Hibernate?](./solutions/hibernate-solutions.md#q67-what-is-native-sql-query-in-hibernate)

68. [When should you use native SQL vs HQL?](./solutions/hibernate-solutions.md#q68-when-should-you-use-native-sql-vs-hql)

69. [What is named query in Hibernate?](./solutions/hibernate-solutions.md#q69-what-is-named-query-in-hibernate)

70. [How do you implement pagination in Hibernate?](./solutions/hibernate-solutions.md#q70-how-do-you-implement-pagination-in-hibernate)

[↑ Back to Table of Contents](#table-of-contents)

---

## Caching

71. [What is caching in Hibernate?](./solutions/hibernate-solutions.md#q71-what-is-caching-in-hibernate)

72. [What are the levels of caching in Hibernate?](./solutions/hibernate-solutions.md#q72-what-are-the-levels-of-caching-in-hibernate)

73. [What is first-level cache?](./solutions/hibernate-solutions.md#q73-what-is-first-level-cache)

74. [Is first-level cache enabled by default?](./solutions/hibernate-solutions.md#q74-is-first-level-cache-enabled-by-default)

75. [What is the scope of first-level cache?](./solutions/hibernate-solutions.md#q75-what-is-the-scope-of-first-level-cache)

76. [What is second-level cache?](./solutions/hibernate-solutions.md#q76-what-is-second-level-cache)

77. [How do you enable second-level cache?](./solutions/hibernate-solutions.md#q77-how-do-you-enable-second-level-cache)

78. [What are second-level cache providers (EhCache, Infinispan, Hazelcast)?](./solutions/hibernate-solutions.md#q78-what-are-second-level-cache-providers-ehcache-infinispan-hazelcast)

79. [What is query cache?](./solutions/hibernate-solutions.md#q79-what-is-query-cache)

80. [How do you enable query cache?](./solutions/hibernate-solutions.md#q80-how-do-you-enable-query-cache)

81. [What is the difference between second-level cache and query cache?](./solutions/hibernate-solutions.md#q81-what-is-the-difference-between-second-level-cache-and-query-cache)

82. [What are cache concurrency strategies?](./solutions/hibernate-solutions.md#q82-what-are-cache-concurrency-strategies)

83. [What is @Cacheable annotation?](./solutions/hibernate-solutions.md#q83-what-is-cacheable-annotation)

84. [What is @Cache annotation?](./solutions/hibernate-solutions.md#q84-what-is-cache-annotation)

85. [How do you invalidate cache?](./solutions/hibernate-solutions.md#q85-how-do-you-invalidate-cache)

[↑ Back to Table of Contents](#table-of-contents)

---

## Performance Tuning

86. [What is lazy loading in Hibernate?](./solutions/hibernate-solutions.md#q86-what-is-lazy-loading-in-hibernate)

87. [What is eager loading in Hibernate?](./solutions/hibernate-solutions.md#q87-what-is-eager-loading-in-hibernate)

88. [What is the N+1 SELECT problem?](./solutions/hibernate-solutions.md#q88-what-is-the-n1-select-problem)

89. [How do you solve the N+1 problem?](./solutions/hibernate-solutions.md#q89-how-do-you-solve-the-n1-problem)

90. [What is fetch join?](./solutions/hibernate-solutions.md#q90-what-is-fetch-join)

91. [What is @BatchSize annotation?](./solutions/hibernate-solutions.md#q91-what-is-batchsize-annotation)

92. [What is batch processing in Hibernate?](./solutions/hibernate-solutions.md#q92-what-is-batch-processing-in-hibernate)

93. [How do you configure batch size?](./solutions/hibernate-solutions.md#q93-how-do-you-configure-batch-size)

94. [What is dirty checking in Hibernate?](./solutions/hibernate-solutions.md#q94-what-is-dirty-checking-in-hibernate)

95. [What is @DynamicUpdate annotation?](./solutions/hibernate-solutions.md#q95-what-is-dynamicupdate-annotation)

96. [What is @DynamicInsert annotation?](./solutions/hibernate-solutions.md#q96-what-is-dynamicinsert-annotation)

97. [What is @SelectBeforeUpdate annotation?](./solutions/hibernate-solutions.md#q97-what-is-selectbeforeupdate-annotation)

98. [How do you optimize bulk operations?](./solutions/hibernate-solutions.md#q98-how-do-you-optimize-bulk-operations)

99. [What is StatelessSession?](./solutions/hibernate-solutions.md#q99-what-is-statelesssession)

100. [When should you use StatelessSession?](./solutions/hibernate-solutions.md#q100-when-should-you-use-statelesssession)

[↑ Back to Table of Contents](#table-of-contents)

---

## Advanced Topics

101. [What is optimistic locking?](./solutions/hibernate-solutions.md#q101-what-is-optimistic-locking)

102. [What is pessimistic locking?](./solutions/hibernate-solutions.md#q102-what-is-pessimistic-locking)

103. [What is @Version annotation?](./solutions/hibernate-solutions.md#q103-what-is-version-annotation)

104. [What is LockMode in Hibernate?](./solutions/hibernate-solutions.md#q104-what-is-lockmode-in-hibernate)

105. [What are the different lock modes?](./solutions/hibernate-solutions.md#q105-what-are-the-different-lock-modes)

106. [What is cascading in Hibernate?](./solutions/hibernate-solutions.md#q106-what-is-cascading-in-hibernate)

107. [What are the cascade types?](./solutions/hibernate-solutions.md#q107-what-are-the-cascade-types)

108. [What is orphan removal?](./solutions/hibernate-solutions.md#q108-what-is-orphan-removal)

109. [What is @Fetch annotation?](./solutions/hibernate-solutions.md#q109-what-is-fetch-annotation)

110. [What are fetch strategies (SELECT, JOIN, SUBSELECT)?](./solutions/hibernate-solutions.md#q110-what-are-fetch-strategies-select-join-subselect)

111. [What are interceptors in Hibernate?](./solutions/hibernate-solutions.md#q111-what-are-interceptors-in-hibernate)

112. [What are listeners in Hibernate?](./solutions/hibernate-solutions.md#q112-what-are-listeners-in-hibernate)

113. [What is @EntityListeners annotation?](./solutions/hibernate-solutions.md#q113-what-is-entitylisteners-annotation)

114. [What are lifecycle callbacks (@PrePersist, @PostLoad, etc.)?](./solutions/hibernate-solutions.md#q114-what-are-lifecycle-callbacks-prepersist-postload-etc)

115. [How do you implement auditing in Hibernate?](./solutions/hibernate-solutions.md#q115-how-do-you-implement-auditing-in-hibernate)

116. [What is @CreatedDate and @LastModifiedDate?](./solutions/hibernate-solutions.md#q116-what-is-createddate-and-lastmodifieddate)

117. [What is @CreatedBy and @LastModifiedBy?](./solutions/hibernate-solutions.md#q117-what-is-createdby-and-lastmodifiedby)

118. [What is Hibernate Validator?](./solutions/hibernate-solutions.md#q118-what-is-hibernate-validator)

119. [What is the difference between Hibernate and MyBatis?](./solutions/hibernate-solutions.md#q119-what-is-the-difference-between-hibernate-and-mybatis)

120. [What are the common Hibernate exceptions?](./solutions/hibernate-solutions.md#q120-what-are-the-common-hibernate-exceptions)

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](problem-set.md)

