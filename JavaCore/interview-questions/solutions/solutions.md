Q1- What are microservices?
Ans-
It is software architecture style where an application is composed of small independent services that communicate over well-defined APIs.
Each service handles specified piece of functionality and can be developed, deployed, and scaled independently.

Example-
E-commerce application can have separate services like
Payment service - responsible for processing payments, handling transactions
Inventory management - handle all product details, stock levels, pricing and availability
Order service - manage customer orders, order processing, order status tracking
User service - handle user registration, authentication, profile management
Notification service - send order confirmations, shipping updates via email/SMS

Q2- What are the characteristics of microservices architecture?
Ans 2- Characterisitics of microservices architecture include:
- Independently deployable services
- Single responsibility principle
- Loosely coupled, hence changes in one service do not impact others
- Decentralized data management, each service can have its own database
- Technology diversity, different services can use different tech stacks
- Fault isolation, failure in one service does not bring down the entire system
- Scalability, services can be scaled independently based on demand

Q3- What are the advantages of microservices?
Ans 3-
- independent development and deployment
- scalability
- fault isolation
- technology diversity
- easier maintenance and updates

Q4- What are the challenges of microservices?
Ans 4-
- As number of microservices increases, managing them becomes complex
- Data consistency across services can be difficult to maintain
- Network latency due to inter-service communication
- Testing and debugging can be more complicated
- Deployment and monitoring require sophisticated tools and processes
- Security management across multiple services

Q5- What is the difference between microservices and monolithic architecture?
Ans 5-
1. Everything bundled into single codebase in monolithic architecture, while microservices break down application into smaller, independent services.
2. Monolithic apps are deployed as single unit, microservices can be deployed independently.
3. Scaling monolithic apps requires scaling entire application, microservices allow scaling of individual services based on demand.
4. Monolithic apps often use single database, microservices can have decentralized data management with each service having its own database.
5. Technology stack is usually uniform in monolithic apps, while microservices allow technology diversity across services.

Q6- What is the difference between microservices and SOA?

Q7- When should you use microservices?
Ans 7-
If we need scalability, flexibility in tech stacks, independent deployments, and different parts of system evolve at different speed.
It is ideal use case for large, complex applications with multiple teams working on different components.

Q8- What is domain-driven design (DDD) in microservices?
Ans 8-
1. Under this we divide the complex application into smaller domains.
2. Each domain focusses on specific area, with its own models, language and logic.
3. This helps in better understanding of business requirements and aligns development with business goals.

Example-
E-Commerce application can be divided into domains like
- User Management Domain - handles user registration, authentication, profile management
- Product Catalog Domain - manages product details, categories, pricing
- Order Management Domain - processes customer orders, order tracking
- Payment Domain - handles payment processing, transactions
- Notification Domain - manages sending emails, SMS notifications

Q9- What is bounded context?
Ans 9-
- It ensures that each service operates within its own defined scope, so they don't overlap or cause conflicts.
- It helps keep things clear and prevents confusion between services.

Q10- How do you decompose a monolith into microservices?
Ans 10-
1. First identify the major functional areas of the monolithic application and decompose them into smaller, manageable services
2. Then segregate the codebase according to the functionalities
3. Based on service need, integrate databases
4. Further, establish communication mechanisms between the services, such as REST APIs or messaging queues
5. finally deploy each service independently.

Q11- What are common microservices design patterns?
Ans 11- 
1. Decomposition patterns
2. API Gateway
3. Circuit Breaker Pattern
4. Database per service
5. Event Sourcing
6. CQRS ( separating read and write operations for better scalability)
7. Saga Pattern ( managing distributed transactions across multiple services)



Q12- What is the Database per Service pattern?
Ans 12-
- In this pattern, each microservice has its own dedicated database.
- This ensures that services are loosely coupled and can evolve independently without affecting each other's data models.
- It allows teams to choose the most suitable database technology for their specific service requirements.
- However, it also introduces challenges related to data consistency and transactions across multiple services, which may 
require additional patterns like Saga for managing distributed transactions.


Q13- What is the Saga pattern?
Ans 13-
- It is a design pattern used to manage distributed transactions in microservices architecture.
- In a Saga, a long-running transaction is broken down into a series of smaller, independent transactions that are executed sequentially across multiple services.
- Each service performs its local transaction and then publishes an event or message to trigger the next transaction in the sequence.
- If any transaction fails, compensating transactions are executed to undo the effects of the previous transactions, ensuring data consistency across services.
- Sagas can be implemented using two main approaches: Orchestration and Choreography.

For Example-
Consider an e-commerce application where placing an order involves multiple services: Order Service, Payment Service, and Inventory Service.
1. The Order Service creates a new order and marks it as "Pending."
2. The Payment Service processes the payment for the order.
3. The Inventory Service updates the stock levels for the ordered items.
If the Payment Service fails to process the payment, a compensating transaction is triggered to cancel the order in the Order Service
and restore the stock levels in the Inventory Service.

Q14- What are the types of Saga (Orchestration vs Choreography)?
Ans 14-
1. Orchestration:
- In this approach, a central coordinator (orchestrator) manages the sequence of transactions and handles the communication between services.
- The orchestrator is responsible for calling each service in the correct order and managing compensating transactions in case of failures.
- This approach provides better control and visibility over the entire Saga process.

Example(Orchestrator Pattern)-
- An Order Service acts as the orchestrator, coordinating with Payment Service and Inventory Service to complete the order process.
- If the Payment Service fails, the Order Service triggers a compensating transaction to cancel the order and notify the Inventory Service to restore stock levels.

2. Choreography:
- In this approach, there is no central coordinator. Instead, each service is responsible for listening to events and 
triggering its own transactions based on those events.
- Services communicate with each other through events, and each service knows when to perform its actions based on the events it receives.
- This approach promotes loose coupling between services but can be harder to manage and monitor.

Example(Choreography Pattern)-
- The Order Service publishes an "Order Created" event when a new order is placed.
- The Payment Service listens for this event, processes the payment, and publishes a "Payment Processed" event.
- The Inventory Service listens for the "Payment Processed" event and updates the stock levels accordingly.
- If the Payment Service fails, it publishes a "Payment Failed" event, which the Order Service listens to and triggers a compensating transaction to cancel the order.




Q15- What is the CQRS(Command Query Responsibility Segregation) pattern?
Ans 15-
It is used in context of database operations in microservices architecture.
- It is a design pattern that separates read and write operations for better scalability and performance.
- Here separate database is used for read and write operations
- In CQRS, we have two distinct models:
  1. Command Model: handles write operations (commands) that modify the state of the system.
  2. Query Model: handles read operations (queries) that retrieve data without modifying it.
- This separation allows us to optimize each model independently, using different data storage technologies or structures tailored to their specific needs.
- CQRS is often used in conjunction with Event Sourcing, where state changes are stored as a sequence of events.

Example-
Consider an e-commerce application where we have separate services for handling orders.
- The Order Command Service is responsible for processing new orders, updating order status, and managing inventory.
- The Order Query Service is responsible for retrieving order details, order history, and generating reports.
- This separation allows us to scale the read operations independently from the write operations, improving overall performance and responsiveness of the system.

In above example, how data consistency is maintained between command and query models?
- Data consistency is maintained using event-driven architecture.
- When a command operation modifies the state in the Command Model, it generates an event that is published to an event bus.
- The Query Model listens for these events and updates its data accordingly, ensuring eventual consistency between the two models.

When order is placed successfully then Command model will update order status and inventory in its database.
Then it will publish an "OrderPlaced" event to event bus.

Q-Here since database is different, then how will it get to know correct order count and inventory details to update things?
1. The Query Model listens for the "OrderPlaced" event from the event bus.
2. Upon receiving the event, it retrieves the necessary order details from the Command Model's database (or through a service call) 
Further updates its own read-optimized database accordingly.
3. This ensures that the Query Model has the latest information about orders and inventory, maintaining eventual consistency between the two models.

Q16- What is Event Sourcing?

Q17- What is the Strangler Fig pattern?
Ans 17-
- It is a design pattern used to incrementally migrate a monolithic application to a microservices architecture.
- The idea is to gradually replace parts of the monolith with new microservices, while still allowing the monolith to function.
- New functionality is built as microservices that "strangle" the old monolithic components.
- Over time, as more functionality is moved to microservices, the monolith is gradually phased out.
- This approach minimizes risk and allows for a smoother transition to microservices.
- It also allows teams to adopt microservices at their own pace, without the need for a complete rewrite of the existing application.

Example-
Consider a legacy e-commerce application that is built as a monolith.
1. Identify a specific functionality, such as the product catalog, that can be extracted as a microservice.
2. Develop a new Product Catalog Service as a microservice, while still allowing the monolith to handle other functionalities.
3. Update the monolith to route requests for product catalog to the new Product Catalog Service.
4. Gradually repeat this process for other functionalities, such as order management, payment processing, and user management.
5. Over time, the monolith is "strangled" by the new microservices, eventually leading to a fully microservices-based architecture.


Q18- What is the Sidecar pattern?

Q19- What is the Backend for Frontend (BFF) pattern?

Q20- What is the Aggregator pattern?

Q21- Circuit Breaker Pattern?
Ans 21-
Think of it like an electrical circuit breaker in your home - when there's too much load or a fault, it automatically cuts the power to prevent damage.

**How it works:**
The Circuit Breaker has three states:

1. **CLOSED** (Normal Operation):
   - All requests go through normally
   - Circuit breaker monitors for failures
   
2. **OPEN** (Service is Down):
   - When failures exceed a threshold (e.g., 5 failures in 10 seconds), circuit "opens"
   - All requests immediately fail without trying to call the failing service
   - This prevents wasting time on requests that will likely fail
   
3. **HALF-OPEN** (Testing Recovery):
   - After a timeout period (e.g., 30 seconds), circuit allows a few test requests
   - If test requests succeed → circuit goes back to CLOSED
   - If test requests fail → circuit goes back to OPEN

**Why do we need it?**
- Prevents cascading failures (one failing service doesn't bring down the entire system)
- Saves resources by not making calls to services that are already down
- Gives failing service time to recover
- Improves user experience with faster failure responses

**Example:**
Imagine an e-commerce application where the Order Service calls the Payment Service.

**Scenario 1 - Normal Operation (CLOSED):**
- Customer places an order
- Order Service calls Payment Service → Success ✅
- Payment is processed normally

**Scenario 2 - Payment Service Goes Down (OPEN):**
- Payment Service crashes or becomes unresponsive
- Order Service tries to call Payment Service → Fails 5 times in a row ❌
- Circuit Breaker "trips" and opens the circuit
- Now, for the next 30 seconds, Order Service doesn't even try to call Payment Service
- Instead, it immediately returns: "Payment service is temporarily unavailable. Please try again later."
- This prevents Order Service from hanging and waiting for timeouts

**Scenario 3 - Testing Recovery (HALF-OPEN):**
- After 30 seconds, Circuit Breaker allows 1 test request
- If Payment Service responds successfully → Circuit closes, normal operation resumes
- If it still fails → Circuit stays open for another 30 seconds

**Real-world analogy:**
It's like calling a friend who isn't picking up the phone:
- First few calls: You keep trying (CLOSED state)
- After 5 failed attempts: You stop calling and assume they're busy (OPEN state)
- After some time: You try one more call to check if they're available now (HALF-OPEN state)
- If they pick up: You resume normal calling (back to CLOSED state)

**Popular Libraries:**
- Resilience4j (modern choice)
- Netflix Hystrix (older, now in maintenance mode)


Q22- How does communication happen between microservices?
Ans 22-
1. Synchronous Communication:
- RESTful APIs (HTTP/HTTPS)
- gRPC (high-performance RPC framework)
- GraphQL (flexible query language for APIs)
- SOAP (Simple Object Access Protocol)
- WebSockets (real-time communication)
- Synchronous communication is suitable for scenarios where immediate response is required, such as user-facing applications.
- However, it can lead to tight coupling between services and increased latency.

Example-
RestTemplate to call another microservice synchronously:
```java
RestTemplate restTemplate = new RestTemplate();
String serviceUrl = "http://inventory-service/api/inventory/{productId}";
ResponseEntity<Inventory> response = restTemplate.getForEntity(serviceUrl, Inventory.class, productId);
Inventory inventory = response.getBody();
```
2. Asynchronous Communication:
- Message Brokers (RabbitMQ, Apache Kafka, ActiveMQ)
- Event-Driven Architecture (publish-subscribe model)
- Asynchronous communication is ideal for decoupling services, improving scalability, and handling high-throughput scenarios.
- It allows services to operate independently and process messages at their own pace.
- However, it introduces complexity in terms of message delivery guarantees and eventual consistency.

Choosing the right communication method depends on the specific use case, performance requirements, and system architecture.
- Often, a combination of both synchronous and asynchronous communication is used in microservices architectures to balance responsiveness and scalability.
For example-
- user authentication might use synchronous REST calls,
- while order processing could leverage asynchronous messaging for better scalability.

Example-
WebClient to call another microservice asynchronously:
```java
WebClient webClient = WebClient.create();
String serviceUrl = "http://order-service/api/orders/{orderId}";
Mono<Order> orderMono = webClient.get()
    .uri(serviceUrl, orderId)
    .retrieve()
    .bodyToMono(Order.class);
```
Q23- How do microservices handle data consistency?
Ans 23-
1. Eventual Consistency:
- In microservices, achieving strong consistency across distributed services can be challenging.
- Instead, services often adopt eventual consistency, where updates to data are propagated asynchronously.
- This means that while data may not be immediately consistent across all services, it will eventually converge to a consistent state.
- Eventual consistency is suitable for scenarios where immediate consistency is not critical, such as user profiles or product catalogs.
- However, it requires careful design to handle scenarios where stale data may be read.
- Techniques like versioning, timestamps, and conflict resolution strategies can help manage eventual consistency.

For example- 
- when a user updates their profile, the change may take some time to reflect across all services that rely on that data.
- However, the system is designed to ensure that all services will eventually see the updated profile information.
- This approach allows for greater scalability and resilience in distributed systems.

2. Distributed Transactions:
- In scenarios where strong consistency is required, microservices can implement distributed transactions using patterns like Saga.
- The Saga pattern breaks down a transaction into a series of smaller, independent transactions that are executed across multiple services.
- Each service performs its local transaction and then publishes an event to trigger the next transaction.
- If any transaction fails, compensating transactions are executed to undo the effects of the previous transactions, ensuring data consistency across services.
- Distributed transactions are suitable for scenarios like order processing, where multiple services need to coordinate to complete a transaction.
- However, they introduce complexity and require careful handling of failure scenarios.
- Techniques like idempotency, retries, and timeouts can help manage distributed transactions effectively.

For example-
- when placing an order, the Order Service, Payment Service, and Inventory Service need to coordinate to ensure that the order is processed correctly.
- If the payment fails, the Order Service can trigger compensating transactions to cancel the order and restore inventory levels.
- This approach ensures that the system maintains data consistency even in the face of failures.

Q24- What is service discovery in microservices?
Ans 24-
- Under this, microservices automatically discover and communicate with each other without hard-coded addresses.
- Service discovery typically involves two main components:
1. Service Registry: A centralized database that maintains a list of available services and their network locations (IP addresses and ports).
2. Service Discovery Client: A component within each microservice that queries the service registry to find the network location of other services 
it needs to communicate with.

3. Service discovery can be implemented using various tools and frameworks, such as:
- Netflix Eureka
- Consul
- Zookeeper
- Kubernetes Service Discovery

Service discovery is essential for maintaining the flexibility and scalability of microservices architectures, allowing services to adapt to changes in the environment without manual intervention.

Q25- What is Eureka Server in microservices?
Ans 25-
- It is a service registry that allows microservices to register themselves and discover other services.
- It is part of the Netflix OSS suite and is widely used in microservices architectures built with Spring Boot and Spring Cloud.
- Eureka Server maintains a registry of available services and their network locations (IP addresses and ports).
- Microservices register themselves with the Eureka Server upon startup, providing their metadata such as service name, instance ID, and health status.
- Other microservices can then query the Eureka Server to discover the network locations of services they need to communicate with.
- Eureka Server also supports features like load balancing, failover, and health checks to ensure high availability and reliability of services.

Q26- How does Eureka server know whether services are up or not?
Ans 26-
- Eureka Server uses a heartbeat mechanism to monitor the health of registered services.
- Each microservice periodically sends a heartbeat signal (a simple HTTP request) to the Eureka Server.
- If the Eureka Server does not receive a heartbeat from a service within a specified interval (default is 90 seconds), it marks the service as "unavailable" or "down."
- The Eureka Server also performs health checks on registered services to ensure they are functioning correctly.
- If a service fails the health check, the Eureka Server updates its status accordingly.
- This mechanism allows the Eureka Server to maintain an up-to-date registry of available services and their health status, enabling other microservices to discover and communicate with healthy services only.
- Overall, the heartbeat mechanism and health checks help ensure the reliability and availability of services in a microservices architecture using Eureka Server.



Q27- What is Api Gateway? How it works in microservices?
Ans 27-
**What is it?**
it's the single entry point where all client requests arrive and get directed to the right service.

**Key Responsibilities:**
1. **Routing** - Directs requests to the correct microservice
2. **Authentication** - Checks if the user is logged in
3. **Authorization** - Checks if the user has permission
4. **Rate Limiting** - Prevents too many requests from one user
5. **Response Aggregation** - Combines data from multiple services into one response

**Example:**
Imagine a mobile app for an e-commerce store:

**Without API Gateway (Problem):**
- Mobile app needs to call 5 different services separately:
  - User Service (get profile)
  - Product Service (get products)
  - Cart Service (get cart items)
  - Order Service (get order history)
  - Payment Service (get payment methods)
- Each call requires authentication
- 5 separate network calls = slow and complex

**With API Gateway (Solution):**
- Mobile app makes ONE call to API Gateway: `GET /api/home`
- API Gateway:
  1. Authenticates the user (once)
  2. Calls all 5 services internally
  3. Combines all responses into one
  4. Returns single response to mobile app
- Result: Faster, simpler, more secure

**Popular Tools:**
- Spring Cloud Gateway (modern, recommended)
- Netflix Zuul (older)
- Kong, AWS API Gateway

API Gateway is like a reception desk at a hotel.

Q28- Explain API Gateway pattern & how routing + filtering works.
Q29. How does Eureka/Consul work internally?
Ans 29-

Q30. How do you handle inter-service communication failures? (Retry, Circuit Breaker, Fallback)
Ans 30-
1. **Retry Mechanism**:
   - When a service call fails due to transient issues (like network glitches), the calling service can automatically retry the request a certain number of times before giving up.
   - This helps to recover from temporary failures without impacting the user experience.
   - Example: If Service A calls Service B and the call fails, Service A can retry the call up to 3 times with a delay between attempts.
2. **Circuit Breaker Pattern**:
   - As explained earlier, the Circuit Breaker pattern prevents a service from making calls to a failing service after a certain number of failures.
   - This helps to avoid overwhelming the failing service and allows it time to recover.
   - Once the service is deemed healthy again, the circuit breaker allows calls to resume.
   - Example: If Service A detects that Service B has failed 5 times in a row, it opens the circuit and stops calling Service B for a specified timeout period.
3. **Fallback Mechanism**:
   - When a service call fails, a fallback mechanism can provide an alternative response or behavior.
   - This ensures that the user experience is not severely impacted by the failure of a dependent service.
   - Example: If Service A calls Service B to get user details and Service B is down, Service A can return cached user details or a default response instead of failing completely.

Q31- Explain eventual consistency in microservices with an example.

Q32- How do you design idempotent APIs?
Ans 32-
Idempotent APIs are designed so that making the same request multiple times has the same effect as making it once.
This is important in distributed systems where network issues can lead to duplicate requests.  
**Key Principles:**
1. **Use Safe HTTP Methods**: GET, PUT, DELETE are idempotent by nature. Avoid using POST for operations that need to be idempotent.
2. **Unique Identifiers**: For operations that create resources, use unique identifiers (like UUIDs) provided by the client to prevent duplicate creations.
3. **Statelessness**: Ensure that the server does not maintain any state between requests. Each request should contain all the information needed to process it.
4. **Consistent Responses**: Ensure that repeated requests return the same response, even if the underlying data has changed.
5. **Database Constraints**: Use database constraints (like unique keys) to prevent duplicate entries.

Example-
If a user clicks save button multiple times due to any reason, how would you ensure only single record is created in the database?
Ans-
1. Client generates a unique request ID (UUID) for the save operation.
2. Server checks if a record with that request ID already exists in the database.
3. If it exists, return the existing record.
4. If it doesn't exist, create a new record with that request ID and return it.

Q33- When does this unique request ID get generated? Normally on the UI, there is not any section which says unique Id is generated, so this should be handled from
UI code only?
Ans-
1. The unique request ID is typically generated on the client side (UI) when the user initiates an action that requires idempotency, such as clicking a save button.
2. This can be done using libraries or built-in functions that generate UUIDs (Universally Unique Identifiers).
3. The generated request ID should be stored in the client-side state (e.g., in a variable or local storage) and included in the request payload sent to the server.
4. This way, even if the user clicks the save button multiple times, the same request ID is sent to the server, allowing it to recognize duplicate requests and handle them appropriately.
5. Once the operation is successful, the client can clear the stored request ID to allow for a new ID to be generated for future operations.


Q34- How to enable unique key constraint on prevent duplicate entries in the database? Say For creating user how to ensure duplicate user is not created?
Ans 34-
1. In the database schema, define a unique constraint on the column(s) that should be unique, such as email or username.
For example, in SQL:
```sql
CREATE TABLE Users (
    id INT PRIMARY KEY,
    username VARCHAR(50) UNIQUE,
    email VARCHAR(100) UNIQUE,
    password VARCHAR(100)
);
```
2. In the application code, before inserting a new user, check if a user with the same unique attribute already exists.
For example, in Java using JPA:
```java
Optional<User> existingUser = userRepository.findByUsername(newUser.getUsername());
if (existingUser.isPresent()) {
    throw new DuplicateUserException("User with this username already exists");
}
userRepository.save(newUser);
```
3. Handle exceptions that arise from unique constraint violations gracefully, providing meaningful feedback to the user.
For example, in Java:
```java
try {
    userRepository.save(newUser);
} catch (DataIntegrityViolationException e) {
    throw new DuplicateUserException("User with this username already exists");
}
```

Q35. What is an idempotent API?
Ans 35-
An idempotent API is one where making the same request multiple times has the same effect as making it once.
This means that no matter how many times a client sends the same request, the outcome remains unchanged.
Idempotent APIs are crucial in distributed systems to handle network issues that may lead to duplicate requests without causing unintended side effects.
Example-
- GET, PUT, and DELETE HTTP methods are idempotent by nature.
- For instance, a PUT request to update a user's email address will result in the same email being set, regardless of how many times the request is made.


## Database Questions
Q36. How do you optimize slow SQL queries?
Ans 36-
Optimizing slow SQL queries involves several strategies:
1. **Indexing**: Create indexes on columns that are frequently used in WHERE clauses, JOIN conditions, and ORDER BY clauses to speed up data retrieval.
2. **Query Refactoring**: Rewrite complex queries to simplify them, break them into smaller subqueries, or use JOINs instead of subqueries where appropriate.
3. **Analyze Execution Plans**: Use database tools to analyze the execution plan of slow queries to identify bottlenecks and optimize them.
4. **Avoid SELECT ***: Only select the columns you need instead of using SELECT * to reduce data transfer and processing time.

Q37. Explain different isolation levels & the problems they prevent.
Ans 37-
**What are Isolation Levels?**
Think of isolation levels like privacy settings for bank transactions - they control what one transaction can "see" while another transaction is happening.

**The Three Problems:**
1. **Dirty Read** - Reading data that hasn't been saved yet (might get rolled back)
2. **Non-Repeatable Read** - Reading the same data twice but getting different values
3. **Phantom Read** - Running the same query twice but getting different number of rows

---

**1. READ UNCOMMITTED** (Least Safe, Fastest)
- **What it allows:** Everything! All three problems can happen
- **Real Example:** 
  - Transaction A: Updates John's balance from $100 → $500 (not committed yet)
  - Transaction B: Reads John's balance and sees $500 ❌ DIRTY READ
  - Transaction A: Rolls back (cancels the update)
  - Result: Transaction B saw $500 but actual balance is still $100!

**When to use:** Rarely used - only for reports where accuracy doesn't matter much

---

**2. READ COMMITTED** (Default in most databases)
- **What it prevents:** Dirty Reads ✅
- **What it allows:** Non-Repeatable Reads, Phantom Reads
- **Real Example:**
  - Transaction A: Reads John's balance = $100
  - Transaction B: Updates John's balance to $200 and COMMITS
  - Transaction A: Reads John's balance again = $200 ❌ NON-REPEATABLE READ
  - Result: Same transaction saw different values for the same row!

**When to use:** Most common use case - good balance of safety and performance

---

**3. REPEATABLE READ** (More Safe)
- **What it prevents:** Dirty Reads ✅, Non-Repeatable Reads ✅
- **What it allows:** Phantom Reads
- **Real Example:**
  - Transaction A: Counts accounts with balance > $1000 = 5 accounts
  - Transaction B: Inserts a new account with balance $2000 and COMMITS
  - Transaction A: Counts again = 6 accounts ❌ PHANTOM READ
  - Result: New rows appeared like "phantoms"!

**When to use:** Financial applications where reading the same data must be consistent

---

**4. SERIALIZABLE** (Most Safe, Slowest)
- **What it prevents:** All problems ✅✅✅ (Dirty, Non-Repeatable, Phantom)
- **How:** Makes transactions run one at a time (like a queue)
- **Real Example:**
  - Transaction A: Starts reading accounts
  - Transaction B: Tries to update accounts → BLOCKED! Must wait
  - Transaction A: Finishes
  - Transaction B: Now can proceed
  - Result: Complete isolation, no surprises!

**When to use:** Critical operations like money transfers, inventory updates

---

**Quick Comparison Table:**

| Level | Dirty Read | Non-Repeatable | Phantom | Performance |
|-------|------------|----------------|---------|-------------|
| READ UNCOMMITTED | ❌ Possible | ❌ Possible | ❌ Possible | ⚡⚡⚡ Fastest |
| READ COMMITTED | ✅ Prevented | ❌ Possible | ❌ Possible | ⚡⚡ Fast |
| REPEATABLE READ | ✅ Prevented | ✅ Prevented | ❌ Possible | ⚡ Medium |
| SERIALIZABLE | ✅ Prevented | ✅ Prevented | ✅ Prevented | 🐌 Slow |

**Remember:** Higher isolation = More safety but Lower performance

**In Spring/JPA:**
```java
@Transactional(isolation = Isolation.READ_COMMITTED)  // Most common
@Transactional(isolation = Isolation.REPEATABLE_READ) // For consistency
@Transactional(isolation = Isolation.SERIALIZABLE)    // For critical operations
```
Q38. What is connection pooling & how HikariCP optimizes performance?
Ans 38-
Connection pooling is like having a pool of reusable database connections ready to go, 
instead of opening and closing a new connection every time your application needs to talk to the database. 
This saves a lot of time and resources, making your application faster and more efficient.
HikariCP is a popular connection pooling library known for its high performance and low latency.
Here’s how HikariCP optimizes performance:
1. **Lightweight and Fast**: HikariCP is designed to be lightweight with minimal overhead, allowing it to manage connections quickly.
2. **Efficient Connection Management**: It uses advanced algorithms to manage the pool of connections, ensuring that connections are reused effectively and that idle connections are closed after a certain period.
3. **Asynchronous Connection Acquisition**: HikariCP can acquire connections asynchronously, reducing wait times for threads that need a connection.
4. **Optimized for Multi-threading**: It is built to handle high concurrency, making it suitable for applications with many simultaneous database requests.
5. **Customizable Settings**: HikariCP allows fine-tuning of various parameters, such as maximum pool size, connection timeout, and idle timeout, to optimize performance based on application needs.
Overall, using HikariCP for connection pooling can significantly improve the performance and scalability of database interactions in your application.

Example for High Concurrency-
1. In a web application with thousands of users making simultaneous requests, 
HikariCP efficiently manages database connections to handle the load without significant delays.

Example for Customizable Settings-
1. By adjusting the maximum pool size and connection timeout settings in HikariCP,
developers can optimize the connection pool to match the specific workload and performance requirements of their application.

Q39- Say we have connection pool of 10 connections. Further we get 1000 requests simultaneously to fetch user details from database. How HikariCP will handle this scenario?
Ans-
1. HikariCP maintains a pool of 10 active database connections that can be reused for incoming requests.
2. When 1000 requests arrive simultaneously, HikariCP will allocate the available connections from the pool to the first 10 requests.
3. The remaining 990 requests will be placed in a waiting queue until a connection becomes available.
4. As each of the initial 10 requests completes and releases its connection back to the pool, HikariCP will allocate that connection to the next request in the queue.
5. This process continues until all 1000 requests have been processed, with HikariCP efficiently managing the allocation and release of connections to ensure optimal performance and resource utilization.
6. HikariCP also has configurable settings, such as connection timeout and maximum pool size, that can be adjusted to better handle high concurrency scenarios based on the specific needs of the application.

Q40- follow up of Q39, In this scenario what maximum connection pool size should be set to handle such high concurrency? Say it is Mysql database
Ans-

**The Formula (Recommended by HikariCP creator):**
```
connections = ((core_count * 2) + effective_spindle_count)
```

**For MySQL specifically:**
- Most experts recommend: **20-50 connections per application instance**
- MySQL default max_connections: **151**
- Production MySQL: typically configured for **500-1000 connections**

---

**Example Calculation for 1000 Concurrent Requests:**

**Scenario:** Application server with 8 CPU cores, MySQL database

**Step 1: Calculate optimal pool size**
```
connections = (8 cores * 2) + 1 (for HDD/SSD)
connections = 17
```

**Step 2: Consider your workload**
- If queries are **FAST** (< 50ms): Pool size = **20-30 connections**
- If queries are **SLOW** (> 200ms): Pool size = **50-100 connections**
- If queries are **MIXED**: Pool size = **30-50 connections**

**For 1000 simultaneous requests:**
```yaml
# HikariCP Configuration (application.properties)
spring.datasource.hikari.maximum-pool-size=50
spring.datasource.hikari.minimum-idle=20
spring.datasource.hikari.connection-timeout=30000
spring.datasource.hikari.idle-timeout=600000
spring.datasource.hikari.max-lifetime=1800000
spring.datasource.hikari.leak-detection-threshold=60000
```

---

**Why NOT set pool size = 1000?**

❌ **Bad Idea:**
- Database will be overwhelmed
- Context switching overhead
- Memory exhausted
- Slower performance overall

✅ **Better Approach with 50 connections:**
1. First 50 requests get connections immediately
2. Remaining 950 requests wait in queue (with 30-second timeout)
3. As connections are released, next requests are served
4. Average query time: 100ms
5. **Throughput:** 50 connections × (1000ms / 100ms) = **500 requests/second**
6. **All 1000 requests processed in ~2 seconds**

---

**Real-World Configuration Examples:**

**1. Low Traffic (< 100 req/sec):**
```properties
maximum-pool-size=10
minimum-idle=5
connection-timeout=20000
```

**2. Medium Traffic (100-500 req/sec):**
```properties
maximum-pool-size=30
minimum-idle=10
connection-timeout=30000
```

**3. High Traffic (500-2000 req/sec):**
```properties
maximum-pool-size=50
minimum-idle=20
connection-timeout=30000
idle-timeout=600000
```

**4. Very High Traffic (2000+ req/sec):**
- **Scale horizontally:** Multiple application instances
- Each instance: 30-50 connections
- Example: 5 instances × 40 connections = **200 total connections**
- **Throughput:** 200 × 10 req/sec = **2000 req/sec**

---

**MySQL Configuration for High Traffic:**
```sql
-- MySQL my.cnf settings
max_connections = 500              # Total connections MySQL can handle
max_connect_errors = 1000000       # Prevent connection blocking
wait_timeout = 28800               # 8 hours
interactive_timeout = 28800        # 8 hours
thread_cache_size = 100            # Reuse threads
```

---

**Important HikariCP Settings Explained:**

| Setting | Recommended Value | Purpose |
|---------|------------------|---------|
| **maximum-pool-size** | 20-50 | Max connections in pool |
| **minimum-idle** | 10-20 | Connections kept alive |
| **connection-timeout** | 30000 (30s) | Max wait time for connection |
| **idle-timeout** | 600000 (10min) | Remove idle connections |
| **max-lifetime** | 1800000 (30min) | Recycle connections |
| **leak-detection-threshold** | 60000 (60s) | Detect connection leaks |

---

**Key Takeaways:**

1. ✅ **More connections ≠ Better performance**
2. ✅ **Optimal pool size: 20-50 for most applications**
3. ✅ **Scale horizontally, not vertically** (more instances, not more connections)
4. ✅ **Monitor:** Use HikariCP metrics to tune pool size
5. ✅ **Fast queries = Smaller pool size needed**
6. ✅ **Slow queries = Fix queries first, then increase pool**

**Formula to remember:**
```
Pool Size = (CPU cores × 2) + 1
BUT never exceed 50-100 per instance
```

Q41. How does caching work in distributed systems?
Ans 41-
Caching involves storing frequently accessed data in a temporary storage layer (cache) reducing the need to query database in order to fetch data repeatedly.
This improves performance and reduces latency.
In distributed systems, caching can be implemented at various levels:
1. **Client-Side Caching**: Data is cached on the client side (e.g., browser cache, mobile app cache) to reduce server requests.
2. **Server-Side Caching**: Data is cached on the server side using in-memory data stores (e.g., Redis, Memcached) to speed up data retrieval for multiple clients.
3. **Distributed Caching**: A shared cache that multiple application instances can access, ensuring consistency and scalability across the system.
4. **Content Delivery Networks (CDNs)**: Caching static assets (images, videos, scripts) at edge locations closer to users to reduce load times.
Caching strategies include:
- **Cache Aside**: Application checks the cache first; if data is not found, it fetches from the database and stores it in the cache.
- **Read-Through**: Cache automatically loads data from the database on a cache miss.
- **Write-Through**: Data is written to both the cache and the database simultaneously.
- **Write-Back**: Data is written to the cache first and then asynchronously updated in the database.
Effective caching strategies can significantly enhance the performance and scalability of distributed systems by reducing database load and improving response times for users. 

For example- 
- using Redis as a distributed cache can help store user session data, 
allowing multiple application instances to access the same session information quickly without hitting the database each time.

Q42A. How do you design high-performance REST APIs?
Ans 42A-
Designing high-performance REST APIs involves several best practices:
1. **Efficient Data Modeling**: Design your data models to minimize the amount of data transferred over the network. Use appropriate data types and structures.
2. **Pagination**: Implement pagination for endpoints that return large datasets to reduce the amount of data sent in a single response.
3. **Caching**: Use caching mechanisms (e.g., HTTP caching headers, in-memory caches) to store frequently accessed data and reduce database load.
4. **Asynchronous Processing**: For long-running operations, use asynchronous processing to avoid blocking the API response.
5. **Compression**: Enable gzip or other compression techniques to reduce the size of the response payload.
6. **Optimize Database Queries**: Ensure that database queries are efficient and use indexing where appropriate to speed up data retrieval.
7. **Use Content Delivery Networks (CDNs)**: For static assets, use CDNs to deliver content faster to users based on their geographic location.
8. **Limit Payload Size**: Avoid sending unnecessary data in API responses. Use fields selection to allow clients to specify which fields they need.
9. **Rate Limiting**: Implement rate limiting to prevent abuse and ensure fair usage of the API.

## System Design Questions
Q42B. Design a URL Shortener / Payment Service / Notification Service.
Ans 42B-
Designing a URL Shortener Service:
1. **Requirements**:
   - Shorten long URLs
   - Redirect short URLs to original URLs
   - Track click statistics
   - Handle high traffic
2. **Components**:
   - API Gateway: Entry point for requests
   - URL Shortening Service: Generates short URLs and stores mappings
   - Database: Stores URL mappings and click statistics
   - Cache: Caches frequently accessed URLs for faster redirection
3. **Data Model**:
   - URL Mapping: { shortUrl, originalUrl, createdAt, clickCount }
4. **Workflow**:
   - User sends a request to shorten a URL
   - URL Shortening Service generates a unique short URL (using base62 encoding)
   - Store the mapping in the database
   - User requests the short URL
   - URL Shortening Service looks up the original URL in the cache/database
   - Redirects the user to the original URL and increments click count
   - Return click statistics on request
   - Use caching to speed up redirection for popular URLs
5. **Scalability**:
   - Use load balancers to distribute traffic
   - Implement database sharding for large datasets
   - Use a CDN for static content delivery
6. **Technologies**:
   - API Gateway: Nginx, AWS API Gateway
   - URL Shortening Service: Spring Boot, Node.js
   - Database: MySQL, MongoDB
   - Cache: Redis, Memcached
   - Message Queue: RabbitMQ, Kafka (for asynchronous processing)
   - Monitoring: Prometheus, Grafana
   - Logging: ELK Stack (Elasticsearch, Logstash, Kibana)
   - Authentication: OAuth2, JWT
   - Rate Limiting: API Gateway, custom middleware
   - Testing: Unit tests, integration tests, load testing (JMeter, Gatling)
   - CI/CD: Jenkins, GitHub Actions
7. **Security**:
   - Validate input URLs to prevent XSS attacks
   - Use HTTPS for secure communication
   - Implement authentication and authorization for API access
8. **Example API Endpoints**:
   - POST /shorten: Shorten a long URL
   - GET /{shortUrl}: Redirect to original URL
   - GET /stats/{shortUrl}: Get click statistics for a short URL
   - DELETE /{shortUrl}: Delete a short URL mapping
9. **Example Code Snippet**:
```java
@RestController
public class UrlShortenerController {
    @Autowired
    private UrlShorteningService urlShorteningService;  

    @PostMapping("/shorten")
    public ResponseEntity<String> shortenUrl(@RequestBody String originalUrl) {
        String shortUrl = urlShorteningService.shortenUrl(originalUrl);
        return ResponseEntity.ok(shortUrl);
    }
    @GetMapping("/{shortUrl}")
    public ResponseEntity<Void> redirectToOriginalUrl(@PathVariable String shortUrl) {  
        String originalUrl = urlShorteningService.getOriginalUrl(shortUrl);
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create(originalUrl)).build();
    }
}
```
10. **Monitoring and Logging**:
1. **Monitoring & Observability**: Use Prometheus/Grafana for metrics, ELK stack for logging, Jaeger for distributed tracing, and 
set up alerts for high error rates or latency spikes.
2. **Testing & Deployment**: Implement automated tests, CI/CD pipelines for safe deployments, regular load testing for scalability, 
and database backup/recovery procedures.
3. **Security & Reliability**: Conduct regular security audits, engage in capacity planning for future growth, and ensure system can handle traffic spikes.
4. **Continuous Improvement**: Review logs/metrics regularly, act on monitoring insights and user feedback, and 
foster a learning culture within the team to enhance system design and performance.


Q43. Explain load balancing strategies (Round-Robin, Least Connection, Weighted).
Ans 43-
Load balancing is the process of distributing incoming network traffic across multiple servers to ensure no single server becomes overwhelmed, 
It improves application availability and responsiveness. 
Here are three common load balancing strategies:
1. **Round-Robin**:
- Distributes incoming requests sequentially across all available servers.
- Each server gets an equal number of requests in a cyclic order.
- Simple to implement and works well when servers have similar capabilities.
Example: 
- If there are 3 servers (A, B, C), the first request goes to A, the second to B, the third to C, and the fourth back to A.

3. **Least Connection**:
- Directs incoming requests to the server with the fewest active connections.
- Ideal for scenarios where servers have varying capacities or workloads.
- Helps to ensure that no single server is overloaded while others are underutilized.
Example: 
- If Server A has 5 active connections, Server B has 2, and Server C has 3, the next request will go to Server B.

4. **Weighted Load Balancing**:
- Assigns a weight to each server based on its capacity or performance.
- Servers with higher weights receive a larger proportion of the incoming requests.
- Useful when servers have different hardware specifications or performance characteristics.
Example: 
- If Server A has a weight of 3, Server B has a weight of 1, and Server C has a weight of 2, 
- Server A will receive 3 requests for every 1 request to Server B and 2 requests to Server C.

Choosing the right load balancing strategy depends on the specific requirements of the application, server capabilities, and traffic patterns. 
In many cases, a combination of strategies may be used to achieve optimal performance and reliability.



Q44. How do you secure microservices (OAuth2, JWT, API Tokens)?
Ans 44-
Securing microservices involves implementing various authentication and authorization mechanisms to protect sensitive data and ensure that only
authorized users can access specific services. Here are some common approaches:
1. **OAuth2**:

Q45. How do you scale a microservices-based application?

Q46. What logging & monitoring stack will you choose and why?

Q47. How do you ensure high availability in microservices architecture?

Q48. What is the difference between @Component, @Service, and @Repository?
Ans 48-
In Spring Framework, @Component, @Service, and @Repository are all stereotypes used to define beans, but they have different semantic meanings and use cases:
1. **@Component**:
   - It is commonly used over utility, helper or config classes. 
   - It indicates that the classes need to be managed by Spring container
   - Example: General-purpose classes that do not fit into specific layers like service or repository.
   - Using @Component helps to make the class discoverable for component scanning and dependency injection.

2. **@Service**:
    - It is used over the service layer classes, which holds business logic, typically core functionality of the application.
    - It also allows for additional features like transaction management to be applied automatically.
    - Example: Classes that handle business rules, calculations, and workflows.
    
3. **@Repository**:
    - It is specially used for data access layer classes.
    - It indicates that the annotated class is responsible for interacting with the database or other data sources.
    - Example: Classes that perform CRUD operations, queries, and data retrieval.
    - Using @Repository provides additional benefits, such as automatic exception translation, 
    which converts database-specific exceptions into Spring's DataAccessException hierarchy.
    - This helps to maintain consistency in error handling across the application.

Q49. How does Spring manage bean lifecycle and dependency injection internally?
Ans 49-
Spring manages bean lifecycle and dependency injection through its Inversion of Control (IoC) container, which is responsible for creating, configuring, and managing the lifecycle of beans.
Here’s how it works internally:
1. **Bean Definition**: When the Spring application context is initialized, it reads the configuration metadata (XML, annotations, or Java config) to identify bean definitions.
2. **Bean Creation**: For each bean definition, Spring creates an instance of the bean using reflection. It can use constructors or factory methods based on the configuration.
3. **Dependency Injection**: Spring resolves dependencies by injecting required beans into the created bean. This can be done through constructor injection, setter injection, or field injection (using @Autowired).
4. **Bean Post-Processing**: After the bean is created and dependencies are injected, Spring applies any registered BeanPostProcessors. These processors can modify the bean instance before and after initialization.
5. **Initialization**: If the bean implements the InitializingBean interface or has an init-method defined, Spring calls the afterPropertiesSet() method or the specified init-method to perform any custom initialization logic.
6. **Bean Usage**: The bean is now ready for use within the application.
7. **Destruction**: When the application context is closed, Spring calls the destroy() method of beans that implement the DisposableBean interface or any custom destroy-method defined in the configuration to perform cleanup operations.

Overall, Spring's IoC container manages the entire lifecycle of beans, ensuring that dependencies are resolved and injected properly, 
while also providing hooks for custom initialization and destruction logic.

Q50. Explain how @Transactional works under the hood.
Ans 50-
The @Transactional annotation in Spring is used to manage transactions declaratively.
Here’s how it works under the hood:
1. **Proxy Creation**: When a class is annotated with @Transactional, Spring creates a
 proxy for that class using either JDK dynamic proxies or CGLIB proxies, depending on whether the class implements an interface.
2. **Method Interception**: When a method annotated with @Transactional is called, the proxy intercepts the method call.
3. **Transaction Management**: The proxy checks the transaction attributes defined by the @Transactional annotation (e.g., propagation, isolation, timeout).
4. **Transaction Start**: Before executing the method, the proxy starts a new transaction or joins an existing one based on the propagation settings.
5. **Method Execution**: The actual method is executed within the context of the transaction.
6. **Transaction Commit/Rollback**: After the method execution:
   - If the method completes successfully, the proxy commits the transaction.
   - If an exception occurs (specifically a runtime exception), the proxy rolls back the transaction.
7. **Cleanup**: Finally, the proxy cleans up any resources associated with the transaction.

Theoretical Example-


Q51. What is the difference between Spring MVC and Spring WebFlux?

Q52. How does Spring Boot auto-configuration work?
Ans 52-
Spring Boot auto-configuration is a powerful feature that automatically configures your Spring application based on the dependencies present in the classpath. 
Here’s how it works:
1. **Starter Dependencies**: When you include Spring Boot starter dependencies in your project (e.g., spring-boot-starter-web, spring-boot-starter-data-jpa),
Spring Boot detects these dependencies and understands what components are needed for your application.
2. **Auto-Configuration Classes**: Spring Boot contains a set of auto-configuration classes that are responsible for configuring various 
components (e.g., DataSource, JPA, MVC) based on the presence of certain classes and properties in the classpath.
3. **Conditional Configuration**: Each auto-configuration class is annotated with @Conditional annotations (e.g., @ConditionalOnClass, @ConditionalOnMissingBean) 
that determine whether the configuration should be applied based on the current application context.
4. **Application Context Initialization**: During the startup of the Spring application, 
Spring Boot scans the classpath for auto-configuration classes and applies the relevant configurations to the application context.
5. **Customization**: Developers can customize the auto-configuration by defining their own beans or properties. 
If a bean of the same type already exists in the context, Spring Boot will not override it, allowing for easy customization.
6. **Enable Auto-Configuration**: The @SpringBootApplication annotation includes @EnableAutoConfiguration, which triggers the auto-configuration process.

Example-
```java
@SpringBootApplication
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class, args);
    }
}
```




Q53. What is the internal working of ConcurrentHashMap in Java 8?
Q54 Explain how JVM handles class loading and garbage collection.
Q55. What is the difference between volatile, synchronized, and Lock?
Q56. How does the ForkJoinPool work internally?
Q57. Explain immutability and how to create a truly immutable class.
Q58. How does actuator work? How to configure it? How to enable it?
