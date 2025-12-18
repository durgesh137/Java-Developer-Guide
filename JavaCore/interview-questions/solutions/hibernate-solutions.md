# Hibernate - Interview Questions

[← Back to Problem Set](../problem-set.md)

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

### Q1. What is Hibernate?

### Q2. What are the advantages of Hibernate?

### Q3. What is the difference between Hibernate and JPA?

### Q4. What are the core interfaces of Hibernate?

### Q5. What is the Hibernate architecture?

### Q6. What are the different states of an object in Hibernate?

### Q7. What is SessionFactory?

### Q8. What is Session?

### Q9. What is Transaction?

### Q10. What is Query?

### Q11. What is Criteria?

### Q12. Is Hibernate thread-safe?

[↑ Back to Table of Contents](#table-of-contents)

---

## Hibernate Configuration

### Q13. What is hibernate.cfg.xml?

### Q14. What are the important properties in Hibernate configuration?

### Q15. What is hibernate.hbm2ddl.auto?

### Q16. What are the values for hibernate.hbm2ddl.auto?

### Q17. What is hibernate.show_sql?

### Q18. What is hibernate.format_sql?

### Q19. What is dialect in Hibernate?

### Q20. How do you configure connection pooling in Hibernate?

### Q21. What is C3P0 connection pool?

### Q22. How do you configure Hibernate with Spring Boot?

[↑ Back to Table of Contents](#table-of-contents)

---

## Session & SessionFactory

### Q23. What is SessionFactory?

### Q24. Is SessionFactory thread-safe?

### Q25. Is SessionFactory heavyweight?

### Q26. What is the difference between openSession() and getCurrentSession()?

### Q27. What is Session in Hibernate?

### Q28. Is Session thread-safe?

### Q29. What is the difference between Session and EntityManager?

### Q30. What is the difference between save() and persist()?

### Q31. What is the difference between get() and load()?

### Q32. What is the difference between update() and merge()?

### Q33. What is the difference between delete() and remove()?

### Q34. What is saveOrUpdate()?

### Q35. What is flush() in Hibernate?

### Q36. What is clear() in Hibernate?

### Q37. What is evict() in Hibernate?

### Q38. When should you call flush()?

[↑ Back to Table of Contents](#table-of-contents)

---

## Hibernate Mapping

### Q39. What are the different ways to map entities in Hibernate?

### Q40. What is XML mapping?

### Q41. What is annotation-based mapping?

### Q42. What is @Entity annotation?

### Q43. What is @Table annotation?

### Q44. What is @Id annotation?

### Q45. What is @GeneratedValue annotation?

### Q46. What are the ID generation strategies in Hibernate?

### Q47. What is @Column annotation?

### Q48. What is @Transient annotation?

### Q49. What is component mapping?

### Q50. What is @Embeddable and @Embedded?

### Q51. What is inheritance mapping in Hibernate?

### Q52. What are the inheritance strategies (SINGLE_TABLE, JOINED, TABLE_PER_CLASS)?

### Q53. What is @Inheritance annotation?

### Q54. What is @DiscriminatorColumn and @DiscriminatorValue?

[↑ Back to Table of Contents](#table-of-contents)

---

## HQL & Criteria

### Q55. What is HQL?

### Q56. What is the difference between HQL and SQL?

### Q57. What is the syntax of HQL?

### Q58. How do you use parameters in HQL?

### Q59. What is the difference between positional and named parameters?

### Q60. How do you perform joins in HQL?

### Q61. How do you use aggregate functions in HQL?

### Q62. What is the Criteria API?

### Q63. What is the difference between HQL and Criteria API?

### Q64. How do you create a Criteria query?

### Q65. What are Restrictions in Criteria API?

### Q66. What are Projections in Criteria API?

### Q67. What is native SQL query in Hibernate?

### Q68. When should you use native SQL vs HQL?

### Q69. What is named query in Hibernate?

### Q70. How do you implement pagination in Hibernate?

[↑ Back to Table of Contents](#table-of-contents)

---

## Caching

### Q71. What is caching in Hibernate?

### Q72. What are the levels of caching in Hibernate?

### Q73. What is first-level cache?

### Q74. Is first-level cache enabled by default?

### Q75. What is the scope of first-level cache?

### Q76. What is second-level cache?

### Q77. How do you enable second-level cache?

### Q78. What are second-level cache providers (EhCache, Infinispan, Hazelcast)?

### Q79. What is query cache?

### Q80. How do you enable query cache?

### Q81. What is the difference between second-level cache and query cache?

### Q82. What are cache concurrency strategies?

### Q83. What is @Cacheable annotation?

### Q84. What is @Cache annotation?

### Q85. How do you invalidate cache?

[↑ Back to Table of Contents](#table-of-contents)

---

## Performance Tuning

### Q86. What is lazy loading in Hibernate?

### Q87. What is eager loading in Hibernate?

### Q88. What is the N+1 SELECT problem?

### Q89. How do you solve the N+1 problem?

### Q90. What is fetch join?

### Q91. What is @BatchSize annotation?

### Q92. What is batch processing in Hibernate?

### Q93. How do you configure batch size?

### Q94. What is dirty checking in Hibernate?

### Q95. What is @DynamicUpdate annotation?

### Q96. What is @DynamicInsert annotation?

### Q97. What is @SelectBeforeUpdate annotation?

### Q98. How do you optimize bulk operations?

### Q99. What is StatelessSession?

### Q100. When should you use StatelessSession?

[↑ Back to Table of Contents](#table-of-contents)

---

## Advanced Topics

### Q101. What is optimistic locking?

### Q102. What is pessimistic locking?

### Q103. What is @Version annotation?

### Q104. What is LockMode in Hibernate?

### Q105. What are the different lock modes?

### Q106. What is cascading in Hibernate?

### Q107. What are the cascade types?

### Q108. What is orphan removal?

### Q109. What is @Fetch annotation?

### Q110. What are fetch strategies (SELECT, JOIN, SUBSELECT)?

### Q111. What are interceptors in Hibernate?

### Q112. What are listeners in Hibernate?

### Q113. What is @EntityListeners annotation?

### Q114. What are lifecycle callbacks (@PrePersist, @PostLoad, etc.)?

### Q115. How do you implement auditing in Hibernate?

### Q116. What is @CreatedDate and @LastModifiedDate?

### Q117. What is @CreatedBy and @LastModifiedBy?

### Q118. What is Hibernate Validator?

### Q119. What is the difference between Hibernate and MyBatis?

### Q120. What are the common Hibernate exceptions?

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](../problem-set.md)

