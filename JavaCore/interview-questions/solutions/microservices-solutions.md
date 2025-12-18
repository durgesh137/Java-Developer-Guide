# Microservices - Interview Questions

[← Back to Problem Set](../problem-set.md)

## Table of Contents
1. [Microservices Fundamentals](#microservices-fundamentals)
2. [Design Patterns](#design-patterns)
3. [Communication](#communication)
4. [Service Discovery & Load Balancing](#service-discovery--load-balancing)
5. [API Gateway](#api-gateway)
6. [Configuration Management](#configuration-management)
7. [Resilience & Fault Tolerance](#resilience--fault-tolerance)
8. [Security](#security)
9. [Monitoring & Observability](#monitoring--observability)
10. [Deployment & DevOps](#deployment--devops)

---

## Microservices Fundamentals

### Q1. What are microservices?

### Q2. What are the characteristics of microservices architecture?

### Q3. What are the advantages of microservices?

### Q4. What are the challenges of microservices?

### Q5. What is the difference between microservices and monolithic architecture?

### Q6. What is the difference between microservices and SOA?

### Q7. When should you use microservices?

### Q8. What is domain-driven design (DDD) in microservices?

### Q9. What is bounded context?

### Q10. How do you decompose a monolith into microservices?

[↑ Back to Table of Contents](#table-of-contents)

---

## Design Patterns

### Q11. What are common microservices design patterns?

### Q12. What is the Database per Service pattern?

### Q13. What is the Saga pattern?

### Q14. What are the types of Saga (Orchestration vs Choreography)?

### Q15. What is the CQRS pattern?

### Q16. What is Event Sourcing?

### Q17. What is the Strangler Fig pattern?

### Q18. What is the Sidecar pattern?

### Q19. What is the Backend for Frontend (BFF) pattern?

### Q20. What is the Aggregator pattern?

[↑ Back to Table of Contents](#table-of-contents)

---

## Communication

### Q21. What are the types of communication in microservices?

### Q22. What is synchronous communication?

### Q23. What is asynchronous communication?

### Q24. What is REST?

### Q25. What are the principles of RESTful services?

### Q26. What is gRPC?

### Q27. What is the difference between REST and gRPC?

### Q28. What is GraphQL?

### Q29. What is message-driven communication?

### Q30. What are message brokers? Give examples.

### Q31. What is Apache Kafka?

### Q32. What is RabbitMQ?

### Q33. What is the difference between Kafka and RabbitMQ?

### Q34. What is event-driven architecture?

### Q35. What is publish-subscribe pattern?

### Q36. What is request-reply pattern?

[↑ Back to Table of Contents](#table-of-contents)

---

## Service Discovery & Load Balancing

### Q37. What is service discovery? {#q37}

### Q38. What are the types of service discovery (Client-side vs Server-side)? {#q38}

### Q39. What is Netflix Eureka? {#q39}

### Q40. What is Consul? {#q40}

### Q41. What is Zookeeper? {#q41}

### Q42. What is load balancing? {#q42}

### Q43. What are load balancing algorithms? {#q43}

### Q44. What is client-side load balancing? {#q44}

### Q45. What is server-side load balancing? {#q45}

### Q46. What is Netflix Ribbon? {#q46}

### Q47. What is Spring Cloud LoadBalancer? {#q47}

[↑ Back to Table of Contents](#table-of-contents)

---

## API Gateway

### Q48. What is an API Gateway? {#q48}

### Q49. What are the responsibilities of an API Gateway? {#q49}

### Q50. What are the benefits of using an API Gateway? {#q50}

### Q51. What is Netflix Zuul? {#q51}

### Q52. What is Spring Cloud Gateway? {#q52}

### Q53. What is the difference between Zuul and Spring Cloud Gateway? {#q53}

### Q54. What is Kong? {#q54}

### Q55. How does an API Gateway handle authentication? {#q55}

### Q56. How does an API Gateway perform rate limiting? {#q56}

### Q57. What is request routing in API Gateway? {#q57}

[↑ Back to Table of Contents](#table-of-contents)

---

## Configuration Management

### Q58. What is externalized configuration? {#q58}

### Q59. What is Spring Cloud Config? {#q59}

### Q60. How does Spring Cloud Config work? {#q60}

### Q61. What are configuration servers? {#q61}

### Q62. What is Consul for configuration management? {#q62}

### Q63. What is the difference between Spring Cloud Config and Consul? {#q63}

### Q64. How do you secure sensitive configuration data? {#q64}

### Q65. What is HashiCorp Vault? {#q65}

### Q66. How do you refresh configuration without restarting services? {#q66}

### Q67. What is @RefreshScope annotation? {#q67}

[↑ Back to Table of Contents](#table-of-contents)

---

## Resilience & Fault Tolerance

### Q68. What is fault tolerance in microservices?

### Q69. What is the Circuit Breaker pattern?

### Q70. What is Hystrix?

### Q71. What is Resilience4j?

### Q72. What is the difference between Hystrix and Resilience4j?

### Q73. What are the circuit breaker states (Closed, Open, Half-Open)?

### Q74. What is fallback in circuit breaker?

### Q75. What is bulkhead pattern?

### Q76. What is retry pattern?

### Q77. What is timeout pattern?

### Q78. What is rate limiting?

### Q79. What is cascading failure?

### Q80. How do you prevent cascading failures?

[↑ Back to Table of Contents](#table-of-contents)

---

## Security

### Q81. What are the security challenges in microservices? {#q81}

### Q82. What is OAuth 2.0? {#q82}

### Q83. What is JWT (JSON Web Token)? {#q83}

### Q84. How does JWT work? {#q84}

### Q85. What is the difference between OAuth 2.0 and JWT? {#q85}

### Q86. What is OpenID Connect? {#q86}

### Q87. What is service-to-service authentication? {#q87}

### Q88. What is mutual TLS (mTLS)? {#q88}

### Q89. What is API key authentication? {#q89}

### Q90. How do you implement security in Spring Cloud? {#q90}

### Q91. What is Spring Security OAuth? {#q91}

### Q92. What is Keycloak? {#q92}

[↑ Back to Table of Contents](#table-of-contents)

---

## Monitoring & Observability

### Q93. What is observability in microservices? {#q93}

### Q94. What are the three pillars of observability (Logs, Metrics, Traces)? {#q94}

### Q95. What is distributed tracing? {#q95}

### Q96. What is Zipkin? {#q96}

### Q97. What is Jaeger? {#q97}

### Q98. What is Sleuth? {#q98}

### Q99. What is the ELK stack (Elasticsearch, Logstash, Kibana)? {#q99}

### Q100. What is Prometheus? {#q100}

### Q101. What is Grafana? {#q101}

### Q102. What is the difference between monitoring and observability? {#q102}

### Q103. What is health check endpoint? {#q103}

### Q104. What is Spring Boot Actuator in microservices? {#q104}

### Q105. What are centralized logging and why is it important? {#q105}

[↑ Back to Table of Contents](#table-of-contents)

---

## Deployment & DevOps

### Q106. What is containerization?

### Q107. What is Docker?

### Q108. What is Docker Compose?

### Q109. What is Kubernetes?

### Q110. What are the key components of Kubernetes?

### Q111. What is a Pod in Kubernetes?

### Q112. What is a Service in Kubernetes?

### Q113. What is a Deployment in Kubernetes?

### Q114. What is Helm?

### Q115. What is CI/CD?

### Q116. What is the difference between continuous delivery and continuous deployment?

### Q117. What is blue-green deployment?

### Q118. What is canary deployment?

### Q119. What is rolling deployment?

### Q120. What is service mesh? What is Istio?

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](../problem-set.md)
