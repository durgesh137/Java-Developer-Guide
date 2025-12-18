# Microservices - Interview Questions

[← Back to Problem Set](problem-set.md)

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

1. [What are microservices?](./solutions/microservices-solutions.md#q1-what-are-microservices)

2. [What are the characteristics of microservices architecture?](./solutions/microservices-solutions.md#q2-what-are-the-characteristics-of-microservices-architecture)

3. [What are the advantages of microservices?](./solutions/microservices-solutions.md#q3-what-are-the-advantages-of-microservices)

4. [What are the challenges of microservices?](./solutions/microservices-solutions.md#q4-what-are-the-challenges-of-microservices)

5. [What is the difference between microservices and monolithic architecture?](./solutions/microservices-solutions.md#q5-what-is-the-difference-between-microservices-and-monolithic-architecture)

6. [What is the difference between microservices and SOA?](./solutions/microservices-solutions.md#q6-what-is-the-difference-between-microservices-and-soa)

7. [When should you use microservices?](./solutions/microservices-solutions.md#q7-when-should-you-use-microservices)

8. [What is domain-driven design (DDD) in microservices?](./solutions/microservices-solutions.md#q8-what-is-domain-driven-design-ddd-in-microservices)

9. [What is bounded context?](./solutions/microservices-solutions.md#q9-what-is-bounded-context)

10. [How do you decompose a monolith into microservices?](./solutions/microservices-solutions.md#q10-how-do-you-decompose-a-monolith-into-microservices)

[↑ Back to Table of Contents](#table-of-contents)

---

## Design Patterns

11. [What are common microservices design patterns?](./solutions/microservices-solutions.md#q11-what-are-common-microservices-design-patterns)

12. [What is the Database per Service pattern?](./solutions/microservices-solutions.md#q12-what-is-the-database-per-service-pattern)

13. [What is the Saga pattern?](./solutions/microservices-solutions.md#q13-what-is-the-saga-pattern)

14. [What are the types of Saga (Orchestration vs Choreography)?](./solutions/microservices-solutions.md#q14-what-are-the-types-of-saga-orchestration-vs-choreography)

15. [What is the CQRS pattern?](./solutions/microservices-solutions.md#q15-what-is-the-cqrs-pattern)

16. [What is Event Sourcing?](./solutions/microservices-solutions.md#q16-what-is-event-sourcing)

17. [What is the Strangler Fig pattern?](./solutions/microservices-solutions.md#q17-what-is-the-strangler-fig-pattern)

18. [What is the Sidecar pattern?](./solutions/microservices-solutions.md#q18-what-is-the-sidecar-pattern)

19. [What is the Backend for Frontend (BFF) pattern?](./solutions/microservices-solutions.md#q19-what-is-the-backend-for-frontend-bff-pattern)

20. [What is the Aggregator pattern?](./solutions/microservices-solutions.md#q20-what-is-the-aggregator-pattern)

[↑ Back to Table of Contents](#table-of-contents)

---

## Communication

21. [What are the types of communication in microservices?](./solutions/microservices-solutions.md#q21-what-are-the-types-of-communication-in-microservices)

22. [What is synchronous communication?](./solutions/microservices-solutions.md#q22-what-is-synchronous-communication)

23. [What is asynchronous communication?](./solutions/microservices-solutions.md#q23-what-is-asynchronous-communication)

24. [What is REST?](./solutions/microservices-solutions.md#q24-what-is-rest)

25. [What are the principles of RESTful services?](./solutions/microservices-solutions.md#q25-what-are-the-principles-of-restful-services)

26. [What is gRPC?](./solutions/microservices-solutions.md#q26-what-is-grpc)

27. [What is the difference between REST and gRPC?](./solutions/microservices-solutions.md#q27-what-is-the-difference-between-rest-and-grpc)

28. [What is GraphQL?](./solutions/microservices-solutions.md#q28-what-is-graphql)

29. [What is message-driven communication?](./solutions/microservices-solutions.md#q29-what-is-message-driven-communication)

30. [What are message brokers? Give examples.](./solutions/microservices-solutions.md#q30-what-are-message-brokers-give-examples)

31. [What is Apache Kafka?](./solutions/microservices-solutions.md#q31-what-is-apache-kafka)

32. [What is RabbitMQ?](./solutions/microservices-solutions.md#q32-what-is-rabbitmq)

33. [What is the difference between Kafka and RabbitMQ?](./solutions/microservices-solutions.md#q33-what-is-the-difference-between-kafka-and-rabbitmq)

34. [What is event-driven architecture?](./solutions/microservices-solutions.md#q34-what-is-event-driven-architecture)

35. [What is publish-subscribe pattern?](./solutions/microservices-solutions.md#q35-what-is-publish-subscribe-pattern)

36. [What is request-reply pattern?](./solutions/microservices-solutions.md#q36-what-is-request-reply-pattern)

[↑ Back to Table of Contents](#table-of-contents)

---

## Service Discovery & Load Balancing

37. [What is service discovery?](./solutions/microservices-solutions.md#q37-what-is-service-discovery)

38. [What are the types of service discovery (Client-side vs Server-side)?](./solutions/microservices-solutions.md#q38-what-are-the-types-of-service-discovery-client-side-vs-server-side)

39. [What is Netflix Eureka?](./solutions/microservices-solutions.md#q39-what-is-netflix-eureka)

40. [What is Consul?](./solutions/microservices-solutions.md#q40-what-is-consul)

41. [What is Zookeeper?](./solutions/microservices-solutions.md#q41-what-is-zookeeper)

42. [What is load balancing?](./solutions/microservices-solutions.md#q42-what-is-load-balancing)

43. [What are load balancing algorithms?](./solutions/microservices-solutions.md#q43-what-are-load-balancing-algorithms)

44. [What is client-side load balancing?](./solutions/microservices-solutions.md#q44-what-is-client-side-load-balancing)

45. [What is server-side load balancing?](./solutions/microservices-solutions.md#q45-what-is-server-side-load-balancing)

46. [What is Netflix Ribbon?](./solutions/microservices-solutions.md#q46-what-is-netflix-ribbon)

47. [What is Spring Cloud LoadBalancer?](./solutions/microservices-solutions.md#q47-what-is-spring-cloud-loadbalancer)

[↑ Back to Table of Contents](#table-of-contents)

---

## API Gateway

48. [What is an API Gateway?](./solutions/microservices-solutions.md#q48)

49. [What are the responsibilities of an API Gateway?](./solutions/microservices-solutions.md#q49)

50. [What are the benefits of using an API Gateway?](./solutions/microservices-solutions.md#q50)

51. [What is Netflix Zuul?](./solutions/microservices-solutions.md#q51)

52. [What is Spring Cloud Gateway?](./solutions/microservices-solutions.md#q52)

53. [What is the difference between Zuul and Spring Cloud Gateway?](./solutions/microservices-solutions.md#q53)

54. [What is Kong?](./solutions/microservices-solutions.md#q54)

55. [How does an API Gateway handle authentication?](./solutions/microservices-solutions.md#q55)

56. [How does an API Gateway perform rate limiting?](./solutions/microservices-solutions.md#q56)

57. [What is request routing in API Gateway?](./solutions/microservices-solutions.md#q57)

[↑ Back to Table of Contents](#table-of-contents)

---

## Configuration Management

58. [What is externalized configuration?](./solutions/microservices-solutions.md#q58-what-is-externalized-configuration)

59. [What is Spring Cloud Config?](./solutions/microservices-solutions.md#q59-what-is-spring-cloud-config)

60. [How does Spring Cloud Config work?](./solutions/microservices-solutions.md#q60-how-does-spring-cloud-config-work)

61. [What are configuration servers?](./solutions/microservices-solutions.md#q61-what-are-configuration-servers)

62. [What is Consul for configuration management?](./solutions/microservices-solutions.md#q62-what-is-consul-for-configuration-management)

63. [What is the difference between Spring Cloud Config and Consul?](./solutions/microservices-solutions.md#q63-what-is-the-difference-between-spring-cloud-config-and-consul)

64. [How do you secure sensitive configuration data?](./solutions/microservices-solutions.md#q64-how-do-you-secure-sensitive-configuration-data)

65. [What is HashiCorp Vault?](./solutions/microservices-solutions.md#q65-what-is-hashicorp-vault)

66. [How do you refresh configuration without restarting services?](./solutions/microservices-solutions.md#q66-how-do-you-refresh-configuration-without-restarting-services)

67. [What is @RefreshScope annotation?](./solutions/microservices-solutions.md#q67-what-is-refreshscope-annotation)

[↑ Back to Table of Contents](#table-of-contents)

---

## Resilience & Fault Tolerance

68. [What is fault tolerance in microservices?](./solutions/microservices-solutions.md#q68)

69. [What is the Circuit Breaker pattern?](./solutions/microservices-solutions.md#q69)

70. [What is Hystrix?](./solutions/microservices-solutions.md#q70)

71. [What is Resilience4j?](./solutions/microservices-solutions.md#q71)

72. [What is the difference between Hystrix and Resilience4j?](./solutions/microservices-solutions.md#q72)

73. [What are the circuit breaker states (Closed, Open, Half-Open)?](./solutions/microservices-solutions.md#q73)

74. [What is fallback in circuit breaker?](./solutions/microservices-solutions.md#q74)

75. [What is bulkhead pattern?](./solutions/microservices-solutions.md#q75)

76. [What is retry pattern?](./solutions/microservices-solutions.md#q76)

77. [What is timeout pattern?](./solutions/microservices-solutions.md#q77)

78. [What is rate limiting?](./solutions/microservices-solutions.md#q78)

79. [What is cascading failure?](./solutions/microservices-solutions.md#q79)

80. [How do you prevent cascading failures?](./solutions/microservices-solutions.md#q80)

[↑ Back to Table of Contents](#table-of-contents)

---

## Security

81. [What are the security challenges in microservices?](./solutions/microservices-solutions.md#q81-what-are-the-security-challenges-in-microservices)

82. [What is OAuth 2.0?](./solutions/microservices-solutions.md#q82-what-is-oauth-20)

83. [What is JWT (JSON Web Token)?](./solutions/microservices-solutions.md#q83-what-is-jwt-json-web-token)

84. [How does JWT work?](./solutions/microservices-solutions.md#q84-how-does-jwt-work)

85. [What is the difference between OAuth 2.0 and JWT?](./solutions/microservices-solutions.md#q85-what-is-the-difference-between-oauth-20-and-jwt)

86. [What is OpenID Connect?](./solutions/microservices-solutions.md#q86-what-is-openid-connect)

87. [What is service-to-service authentication?](./solutions/microservices-solutions.md#q87-what-is-service-to-service-authentication)

88. [What is mutual TLS (mTLS)?](./solutions/microservices-solutions.md#q88-what-is-mutual-tls-mtls)

89. [What is API key authentication?](./solutions/microservices-solutions.md#q89-what-is-api-key-authentication)

90. [How do you implement security in Spring Cloud?](./solutions/microservices-solutions.md#q90-how-do-you-implement-security-in-spring-cloud)

91. [What is Spring Security OAuth?](./solutions/microservices-solutions.md#q91-what-is-spring-security-oauth)

92. [What is Keycloak?](./solutions/microservices-solutions.md#q92-what-is-keycloak)

[↑ Back to Table of Contents](#table-of-contents)

---

## Monitoring & Observability

93. [What is observability in microservices?](./solutions/microservices-solutions.md#q93)

94. [What are the three pillars of observability (Logs, Metrics, Traces)?](./solutions/microservices-solutions.md#q94)

95. [What is distributed tracing?](./solutions/microservices-solutions.md#q95)

96. [What is Zipkin?](./solutions/microservices-solutions.md#q96)

97. [What is Jaeger?](./solutions/microservices-solutions.md#q97)

98. [What is Sleuth?](./solutions/microservices-solutions.md#q98)

99. [What is the ELK stack (Elasticsearch, Logstash, Kibana)?](./solutions/microservices-solutions.md#q99)

100. [What is Prometheus?](./solutions/microservices-solutions.md#q100)

101. [What is Grafana?](./solutions/microservices-solutions.md#q101)

102. [What is the difference between monitoring and observability?](./solutions/microservices-solutions.md#q102)

103. [What is health check endpoint?](./solutions/microservices-solutions.md#q103)

104. [What is Spring Boot Actuator in microservices?](./solutions/microservices-solutions.md#q104)

105. [What are centralized logging and why is it important?](./solutions/microservices-solutions.md#q105)

[↑ Back to Table of Contents](#table-of-contents)

---

## Deployment & DevOps

106. [What is containerization?](./solutions/microservices-solutions.md#q106-what-is-containerization)

107. [What is Docker?](./solutions/microservices-solutions.md#q107-what-is-docker)

108. [What is Docker Compose?](./solutions/microservices-solutions.md#q108-what-is-docker-compose)

109. [What is Kubernetes?](./solutions/microservices-solutions.md#q109-what-is-kubernetes)

110. [What are the key components of Kubernetes?](./solutions/microservices-solutions.md#q110-what-are-the-key-components-of-kubernetes)

111. [What is a Pod in Kubernetes?](./solutions/microservices-solutions.md#q111-what-is-a-pod-in-kubernetes)

112. [What is a Service in Kubernetes?](./solutions/microservices-solutions.md#q112-what-is-a-service-in-kubernetes)

113. [What is a Deployment in Kubernetes?](./solutions/microservices-solutions.md#q113-what-is-a-deployment-in-kubernetes)

114. [What is Helm?](./solutions/microservices-solutions.md#q114-what-is-helm)

115. [What is CI/CD?](./solutions/microservices-solutions.md#q115-what-is-cicd)

116. [What is the difference between continuous delivery and continuous deployment?](./solutions/microservices-solutions.md#q116-what-is-the-difference-between-continuous-delivery-and-continuous-deployment)

117. [What is blue-green deployment?](./solutions/microservices-solutions.md#q117-what-is-blue-green-deployment)

118. [What is canary deployment?](./solutions/microservices-solutions.md#q118-what-is-canary-deployment)

119. [What is rolling deployment?](./solutions/microservices-solutions.md#q119-what-is-rolling-deployment)

120. [What is service mesh? What is Istio?](./solutions/microservices-solutions.md#q120-what-is-service-mesh-what-is-istio)

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](problem-set.md)
