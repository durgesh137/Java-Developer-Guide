
1. What is Spring Boot Auto-configuration? How does it work internally, and how do you customize it using @ConditionalOnProperty or @AutoConfigureBefore?

2. Difference between @Component, @Service, @Repository — Are they functionally different or just semantic?

3. Explain the Bean Lifecycle — @PostConstruct, @PreDestroy, InitializingBean, DisposableBean — when to use which?

4. How does Spring Boot Actuator help in production monitoring? Explain /health, /metrics, and custom endpoints.

5. How do you build custom Spring Boot starters? Walk through the folder structure and auto-configuration setup.

Spring Security & Authentication

1. How does Spring Security Filter Chain work internally? Explain the flow from request to authentication.

2. What is the OAuth2 + JWT authentication flow? How do you implement stateless authentication in microservices?

3. How do you implement role-based access control (RBAC)? @PreAuthorize vs @Secured vs manual checking.

Microservices & Distributed Systems

1. Explain the Circuit Breaker pattern — How does Resilience4j help prevent cascading failures?

2. What is idempotency in REST APIs? How do you ensure POST/PUT requests don’t create duplicate records?

3. How do you implement distributed tracing? Sleuth + Zipkin or OpenTelemetry — trace IDs across services.

4 What is the Saga pattern? How do you handle distributed transactions without 2PC?

JPA / Hibernate / Database

1. What is the N+1 problem? How do you solve it using @EntityGraph or JOIN FETCH?

2. Difference between lazy and eager loading — When does LazyInitializationException occur?

3. Explain optimistic vs pessimistic locking — @Version annotation and use cases.

===================

5 Must-Know Core Java Topics (My Learning)
1)Java 8 features including Streams, Lambdas, Functional Interfaces, Optional and Method References
2)OOP principles such as Encapsulation, Inheritance, Abstraction and Polymorphism
3)Java Collections Framework including internal working and concurrency collections
4)Multithreading and Concurrency including synchronization, locks and ExecutorService
5)Modern Java features like Records, GC updates, var keyword, modules and sealed classes

Frequently Asked Interview Questions (Based on My Interviews)
Coding
1)Stream API problems using grouping, filtering and mapping
2)String manipulation problems
3)Array based problems such as sorting, searching and sliding window
Theory
1)Abstract class vs Interface
2)When to choose interface or abstract class
3)Method overriding vs creating new methods
4)Local and global exception handling
5)How Optional class works
6)Functional Interface, Lambda and Method Reference
7)Thread creation methods and Executor Service
8)What Record class is and where it is used
9)Recent Garbage Collector improvements including G1 and ZGC


===================
𝗖𝗼𝗿𝗲 𝗝𝗮𝘃𝗮
• Difference between HashMap, HashTable, and ConcurrentHashMap
• How does Garbage Collection work in JVM?
• Explain volatile and synchronized in multithreading
• Deep copy vs Shallow copy
• How does the Java memory model work (Heap, Stack, Metaspace)?

𝗦𝗽𝗿𝗶𝗻𝗴 & 𝗦𝗽𝗿𝗶𝗻𝗴 𝗕𝗼𝗼𝘁
• What is Dependency Injection? How does Spring handle it internally?
• Difference between @Component, @Service, and @Repository
• How does Spring Boot auto-configuration work?
• Exception handling best practices in REST APIs
• How to secure REST APIs (JWT, OAuth2)?

𝗝𝗣𝗔 / 𝗛𝗶𝗯𝗲𝗿𝗻𝗮𝘁𝗲
• Difference between Lazy and Eager loading
• What are N+1 query problems? How to solve them?
• How does Hibernate manage transactions?
• Entity lifecycle states (Transient, Persistent, Detached, Removed)

𝗦𝗤𝗟 & 𝗗𝗮𝘁𝗮𝗯𝗮𝘀𝗲
• Write a query to find the 2nd highest salary from Employee table
• Difference between INNER JOIN, LEFT JOIN, RIGHT JOIN
• What are indexes? Clustered vs Non-clustered
• How to optimize slow queries?

𝗗𝗦𝗔 / 𝗣𝗿𝗼𝗯𝗹𝗲𝗺 𝗦𝗼𝗹𝘃𝗶𝗻𝗴
• Implement LRU Cache
• Detect a cycle in a linked list
• Find longest substring without repeating characters
• Merge overlapping intervals
• Design a rate limiter

𝗦𝘆𝘀𝘁𝗲𝗺 𝗗𝗲𝘀𝗶𝗴𝗻
• Design a URL Shortener like bit.ly
• How would you scale a notification service?
• Difference between Monolith vs Microservices
• Use of API Gateway and Load Balancer
• CAP Theorem explanation with real-world examples
