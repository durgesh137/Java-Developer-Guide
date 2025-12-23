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

An exception is basically an event that disrupts the normal flow of your program when something goes wrong—like dividing by zero or trying to access a null object. It's Java's way of saying "hey, something unexpected happened here" so you can handle it gracefully instead of crashing.

In microservices, I've seen exceptions all the time—network timeouts when calling downstream services, database connection failures, or validation errors when processing incoming requests. For example, in one of my projects, we'd get `SocketTimeoutException` when a payment gateway took too long to respond, and we'd catch that to retry the request or return a proper error response to the client instead of letting the whole service crash.

### Q2. What is exception handling?

Exception handling is the mechanism Java provides to catch and manage errors so your application doesn't just blow up. You use try-catch blocks to intercept exceptions, handle them appropriately, and keep your application running or fail gracefully with meaningful error messages.

In Spring Boot REST APIs, I always wrap risky operations in try-catch blocks or use `@ControllerAdvice` for global exception handling. For instance, when integrating with Kafka, if message deserialization fails, we'd catch the exception, log it, send the message to a dead-letter queue, and return a 500 with proper error details rather than exposing internal stack traces to clients.

### Q3. What are the advantages of exception handling?

The main advantage is you can separate your normal business logic from error-handling code, making your code cleaner and easier to maintain. It also lets you handle errors at the appropriate level—you don't have to check return codes everywhere, and you can propagate exceptions up the call stack to where they make sense to handle.

In production microservices, this is huge. For example, in a REST controller, I don't clutter my service layer with HTTP status code logic. Instead, I throw domain-specific exceptions like `ResourceNotFoundException` or `InvalidRequestException`, and my `@ControllerAdvice` catches them and converts them to proper HTTP responses with the right status codes and error messages.

### Q4. What is the difference between Error and Exception?

Errors represent serious system-level problems that you typically can't recover from—like `OutOfMemoryError` or `StackOverflowError`. Exceptions are application-level issues that you can usually catch and handle, like bad input or network failures.

In practice, you'd never catch an `Error` in your code because if the JVM runs out of memory, there's not much you can do. But exceptions like `IOException` or `SQLException` are part of normal application flow. For instance, in one of my Kubernetes deployments, we once hit `OutOfMemoryError` due to a memory leak, and the pod just crashed and restarted—no amount of try-catch would've saved it. But a `ConnectException` when Redis is temporarily down? That we can handle with retries and circuit breakers.

### Q5. What is the base class for all exceptions?

The base class is `Throwable`. Both `Exception` and `Error` extend from `Throwable`, and everything you can throw or catch in Java inherits from it.

In most real-world code, you'd rarely reference `Throwable` directly—you'd work with `Exception` for checked exceptions or `RuntimeException` for unchecked ones. I've only seen code catch `Throwable` in very rare cases, like in framework-level code or when you absolutely need to catch everything, but it's generally a bad practice since you'd end up catching `Error`s too, which you shouldn't.

### Q6. What happens if an exception is not handled?

If an exception isn't handled, it propagates up the call stack until it reaches the JVM, which then terminates the thread and prints the stack trace to standard error. In a web application, this means the request fails, and the user gets an error response.

In Spring Boot, unhandled exceptions in a REST controller would result in a 500 Internal Server Error by default. In one of my microservices, before we implemented proper global exception handling, unhandled `NullPointerException`s would expose full stack traces to clients, which was both a security issue and terrible UX. We fixed it by adding `@ControllerAdvice` to catch all exceptions and return proper error responses with meaningful messages.

### Q7. Can we have multiple catch blocks for a single try block?

Yes, absolutely. You can chain multiple catch blocks to handle different exception types differently. The key is to order them from most specific to most general, because Java evaluates them in sequence and stops at the first match.

In real projects, I do this all the time. For example, when calling an external API, I'd catch `SocketTimeoutException` separately to implement retry logic, catch `IOException` for other network issues to log them differently, and have a final `Exception` catch block as a safety net. This way, I can handle timeouts with retries but log other I/O errors without retrying, since they might be permanent failures.

### Q8. What is the purpose of the `throws` keyword?

The `throws` keyword in a method signature tells the compiler and callers that this method might throw certain checked exceptions, so they need to handle them. It's basically declaring what can go wrong so the calling code isn't surprised.

In Spring Boot services, I use this when a method deals with I/O operations or database calls. For example, a service method that reads from S3 might declare `throws IOException`, and the controller calling it would either catch it or declare throws in its own signature. Though honestly, in Spring, I usually prefer wrapping checked exceptions in custom runtime exceptions at the service layer boundary to avoid cluttering the call stack with throws declarations.

### Q9. What is the purpose of the `throw` keyword?

The `throw` keyword is what you actually use to throw an exception object. It's how you manually trigger an exception when you detect an error condition in your code.

I use this constantly for validation logic. For instance, in a payment microservice, if the amount is negative or the account is inactive, I'd explicitly `throw new InvalidRequestException("Amount must be positive")`. Or when a requested resource isn't found in the database, I'd `throw new ResourceNotFoundException("User not found with id: " + userId)`. This way, my service layer focuses on business logic and throws meaningful exceptions that the controller layer converts to proper HTTP responses.

### Q10. What is the difference between `throw` and `throws`?

`throw` is used to actually throw an exception object in your code, while `throws` is used in a method signature to declare that the method might throw certain exception types. Think of `throw` as the action and `throws` as the declaration.

Here's how I'd explain it: when I write `if (balance < 0) throw new InsufficientFundsException()`, that's `throw`—I'm creating and throwing the exception. But when my method signature says `public void transfer() throws SQLException`, that's `throws`—I'm declaring that this method might throw a SQLException so callers know to handle it. In practice, you'd use `throw` inside method bodies and `throws` in method signatures.

[↑ Back to Table of Contents](#table-of-contents)

---

## Exception Hierarchy

### Q11. Explain the exception hierarchy in Java.

The hierarchy starts with `Throwable` at the top, which has two main branches: `Error` for system-level failures and `Exception` for application-level issues. Under `Exception`, there's `RuntimeException` for unchecked exceptions and everything else is checked exceptions that the compiler forces you to handle.

In practice, when I'm designing custom exceptions for microservices, I usually extend `RuntimeException` for business logic violations that I don't want to pollute my method signatures with. For instance, I'd create `InvalidPaymentException` extending `RuntimeException` rather than `Exception`, so I don't have to declare `throws` everywhere in my service layer. This keeps the code cleaner while still giving me proper exception handling through Spring's `@ControllerAdvice`.

### Q12. What is the `Throwable` class?

`Throwable` is the root class for all errors and exceptions in Java. It's what defines the basic contract for anything that can be thrown—it has methods like `getMessage()`, `printStackTrace()`, and `getCause()` that all exceptions inherit.

You'd rarely extend `Throwable` directly in real code. I've only seen it done in very specific framework code. In application development, you'd always extend either `Exception` for checked exceptions or `RuntimeException` for unchecked ones. For example, in my microservices, all my custom exceptions extend `RuntimeException` to avoid checked exception overhead.

### Q13. What are the direct subclasses of `Throwable`?

The two direct subclasses are `Error` and `Exception`. `Error` covers JVM-level problems like `OutOfMemoryError`, while `Exception` covers application-level issues that you can handle.

In production, you'd only ever catch and handle exceptions from the `Exception` branch. For instance, when I'm calling Kafka or Redis, I'd catch `IOException` or connection exceptions, but I'd never try to catch an `Error` like `StackOverflowError` because those indicate fundamental problems that require a JVM restart.

### Q14. Name some common exceptions in Java.

The most common ones I deal with are `NullPointerException`, `IllegalArgumentException`, `IOException`, `SQLException`, and `NumberFormatException`. In Spring Boot specifically, you'd also see `HttpClientErrorException` and `DataAccessException` variants.

In my microservices, `NullPointerException` is the most frequent—usually from not null-checking responses from other services. I've also dealt with `SocketTimeoutException` when calling slow APIs, `JsonProcessingException` when deserializing Kafka messages, and `OptimisticLockException` in JPA when handling concurrent updates. Each of these gets handled differently—NPEs get logged as bugs, timeouts trigger retries, and lock exceptions trigger conflict responses to clients.

### Q15. What is `NullPointerException`? When does it occur?

It's what you get when you try to use an object reference that's null—calling a method on it, accessing its fields, or getting its length if it's an array. It's one of the most common runtime exceptions you'll encounter.

In my experience, NPEs usually happen at service boundaries—when a downstream service returns null instead of an object, or when database queries return empty. For example, in one project, we'd call a user service and directly access `userResponse.getAddress().getCity()` without null checks, which would blow up if the address was optional. Now I always use `Optional` or explicit null checks at integration points, and I validate responses from external APIs before processing them.

### Q16. What is `ArrayIndexOutOfBoundsException`?

This happens when you try to access an array element with an index that's either negative or beyond the array's length. It's a runtime exception that indicates a logic error in your code.

I don't see this as much anymore since most modern Java code uses Lists instead of arrays. But when parsing CSV files or processing batch data, it can still happen if you assume a certain number of columns without validating. For instance, when processing payment files with variable-length records, I'd check the array length before accessing specific indices to avoid this exception.

### Q17. What is `ClassCastException`?

You get this when you try to cast an object to a type it's not actually an instance of. It's a runtime check that fails when your cast is invalid.

I've hit this in a few scenarios—most commonly when deserializing JSON to POJOs and the structure doesn't match, or when using raw types in older code without generics. For example, working with legacy code that stored objects in raw `ArrayList`, you'd have to cast on retrieval, and if someone put the wrong type in there, boom—`ClassCastException`. This is why I always use generics properly and leverage Jackson's type-safe deserialization in REST APIs.

### Q18. What is `IllegalArgumentException`?

This is what you throw when a method receives an argument that's technically the right type but has an invalid value. It's an unchecked exception you'd use for validation at the method level.

I use this all the time for input validation. For instance, if a method expects a positive amount but receives a negative one, I'd throw `IllegalArgumentException("Amount must be positive")`. Or in a microservice handling pagination, if someone passes `pageSize=0` or `pageSize=10000`, I'd throw this exception. It's better than silently accepting bad input or returning misleading results.

### Q19. What is `NumberFormatException`?

It's thrown when you try to convert a string to a number but the string isn't a valid number format. It extends `IllegalArgumentException` and is unchecked.

This comes up constantly when parsing request parameters or reading configuration. For example, in a REST API, if a client sends `/api/users/abc` where the ID should be numeric, `Integer.parseInt("abc")` would throw `NumberFormatException`. I usually catch these at the controller level and return a 400 Bad Request with a message like "Invalid user ID format". Same thing happens when reading environment variables—if someone typos a port number, you'd get this exception during startup.

### Q20. What is `ArithmeticException`?

This is thrown when you perform an invalid arithmetic operation, most commonly division by zero with integers. It's an unchecked runtime exception.

In practice, I don't see this often in modern code because most arithmetic is on floats or doubles (which return Infinity rather than throwing), or we're doing calculations on BigDecimal for financial data. But in batch processing or calculation-heavy services, if you're dividing by a computed value without checking if it's zero first, you'd hit this. For instance, calculating average response times from request counts—if there are zero requests, dividing would throw `ArithmeticException`, so I'd check for zero first or use a safe division utility.

[↑ Back to Table of Contents](#table-of-contents)

---

## Try-Catch-Finally

### Q21. What is the syntax of try-catch-finally?

The basic structure is `try { risky code } catch (ExceptionType e) { handle it } finally { always runs }`. The try block contains code that might throw exceptions, catch handles specific exception types, and finally executes cleanup code regardless of whether an exception occurred.

In my Spring Boot services, I use this constantly for resource management. For example, when processing files from S3, I'd wrap the download in try, catch `IOException` for logging and retry logic, and use finally to close the input stream. Though nowadays, I prefer try-with-resources which handles the finally part automatically for `AutoCloseable` resources.

### Q2. Is it mandatory to have a catch block with try?

No, it's not mandatory. You can have try-finally without a catch if you just want cleanup code to run but don't want to handle the exception right there. Or you can use try-with-resources which handles the cleanup automatically.

I use try-finally when I want to release resources but let the exception propagate up. For instance, when acquiring a distributed lock in Redis for critical sections, I'd use try-finally to ensure the lock is always released even if the business logic throws an exception. The exception still bubbles up to be handled by the global exception handler.

### Q23. Can we have try without catch?

Yes, you can have try without catch as long as you have a finally block or you're using try-with-resources. The exception just propagates up after the finally block executes.

In microservices, I use this pattern when managing external resources. For example, when publishing to Kafka, I'd use try-finally to ensure the producer is closed properly, but I'd let exceptions propagate to the caller who knows better how to handle publication failures—maybe retry, dead-letter, or alert.

### Q24. Can we have multiple finally blocks?

No, you can only have one finally block per try statement. If you need multiple cleanup operations, you'd put them all in that single finally block or use nested try-finally blocks.

In practice, having one finally block is cleaner. When I'm managing multiple resources like database connections and file handles, I'd either use try-with-resources which handles all of them, or manually close them in order in a single finally block, wrapping each close in its own try-catch so one failure doesn't prevent others from closing.

### Q25. Will the finally block execute if there is a return statement in try or catch?

Yes, the finally block always executes before the method returns, even if there's a return statement in try or catch. The finally code runs, and then the return value is returned.

This is crucial for resource cleanup. For instance, if I'm reading from a database connection and return early on finding the first match, the finally block still runs to close the connection. One gotcha though—if finally has its own return statement, it overwrites the return value from try or catch, which is almost never what you want and should be avoided.

### Q26. Will the finally block execute if `System.exit()` is called?

No, if you call `System.exit()`, the JVM terminates immediately and finally won't run. It's one of the few cases where finally doesn't execute.

In production code, I'd never call `System.exit()` except maybe in the main method of standalone batch jobs. In Spring Boot applications, you'd use application context shutdown hooks instead. I've seen issues where developers called `System.exit()` in exception handlers thinking it would clean up, but it just killed the JVM without running finally blocks or shutdown hooks, leaving resources in inconsistent states.

### Q27. What is try-with-resources (Java 7)?

Try-with-resources automatically closes any resource that implements `AutoCloseable` at the end of the try block, whether an exception occurs or not. You declare the resources in parentheses after try, and Java handles the cleanup.

I use this everywhere now—it's so much cleaner than manual finally blocks. For example, when reading files or database connections: `try (Connection conn = dataSource.getConnection()) { ... }` and the connection auto-closes. It also handles suppressed exceptions properly, where if both your code and the close() method throw exceptions, you get the main one with the close exception suppressed.

### Q28. What are the advantages of try-with-resources?

The main advantages are cleaner code, automatic resource management, and proper handling of suppressed exceptions. You don't need finally blocks for cleanup, and if exceptions occur both in your code and during close(), you get proper exception chaining.

In microservices where you're constantly dealing with external resources—database connections, HTTP clients, Kafka producers, Redis connections—try-with-resources eliminates boilerplate and prevents resource leaks. For instance, instead of 10 lines of try-catch-finally to close a connection, it's just one line in the try parentheses. It's also saved me from bugs where I forgot to close resources in all exception paths.

### Q29. What is the `AutoCloseable` interface?

`AutoCloseable` is a functional interface with a single method `close()` that gets called automatically by try-with-resources. Any class that implements it can be used in try-with-resources syntax for automatic cleanup.

Most classes you'd want to auto-close already implement it—`Connection`, `Statement`, `InputStream`, `OutputStream`, HTTP clients. When I create custom resource classes, I implement `AutoCloseable` too. For example, I created a custom Redis lock wrapper that implements `AutoCloseable`, so you can use it like `try (RedisLock lock = lockService.acquire(key)) { ... }` and it auto-releases the lock.

### Q30. Can you have a catch block after try-with-resources?

Yes, you can combine try-with-resources with catch and finally blocks. The resource closing happens before the catch or finally blocks execute.

I do this when I want both automatic resource management and specific exception handling. For example: `try (Connection conn = ds.getConnection()) { query } catch (SQLException e) { handle DB errors } finally { cleanup other stuff }`. The connection closes first, then catch handles SQL exceptions, then finally runs for any additional cleanup.

### Q31. What happens if an exception occurs in the finally block?

If an exception is thrown in the finally block and wasn't already handling another exception, that new exception propagates up. But if there was already an exception from the try or catch block, the finally exception overwrites it, which is usually not what you want.

This is dangerous in production. For example, if your try block throws an `IOException` and then finally throws a `NullPointerException` while trying to close a resource, you'd only see the NPE, losing the original error. That's why I always wrap close operations in finally with their own try-catch, or better yet, use try-with-resources which handles this through suppressed exceptions.

### Q32. Can you catch multiple exceptions in a single catch block (Java 7)?

Yes, starting Java 7, you can use multi-catch with the pipe operator: `catch (IOException | SQLException e)`. The exceptions have to be unrelated (not in the same inheritance hierarchy), and the exception variable is implicitly final.

I use this when different exceptions need the same handling logic. For example, when calling external services, both `SocketTimeoutException` and `ConnectException` might warrant the same retry logic, so I'd catch them together. It reduces code duplication and makes the intent clearer than having two identical catch blocks.

### Q33. What is the order of catch blocks? Does it matter?

Yes, order matters a lot. Catch blocks are evaluated top to bottom, and Java picks the first one that matches. You must order them from most specific to most general, or the compiler will complain about unreachable code.

In my microservices, I typically catch specific exceptions first for custom handling, then broader ones. For example: catch `SocketTimeoutException` to retry, then `IOException` to log and fail, then generic `Exception` as a safety net. If I put `Exception` first, the specific catches would be unreachable and the compiler would error out.

### Q34. Can a catch block handle multiple exception types? How?

Yes, using multi-catch syntax with the pipe operator: `catch (ExceptionType1 | ExceptionType2 e)`. This lets you handle different exception types with the same logic in a single catch block.

I find this useful when different external service calls can fail in similar ways. For instance, calling Redis might throw `JedisConnectionException` while Kafka throws `KafkaException`, but both warrant circuit-breaking and alerting. So I'd catch them together: `catch (JedisConnectionException | KafkaException e)` and apply the same recovery logic. Keeps the code DRY.

[↑ Back to Table of Contents](#table-of-contents)

---

## Checked vs Unchecked Exceptions

### Q35. What are checked exceptions?

Checked exceptions are exceptions that extend `Exception` but not `RuntimeException`, and the compiler forces you to either catch them or declare them with `throws`. They represent recoverable conditions that a well-written application should anticipate.

In my experience, checked exceptions come up mainly with I/O operations and database access—`IOException`, `SQLException`, `ClassNotFoundException`. For example, when reading configuration files at startup, I have to explicitly handle `IOException` because the compiler won't let me ignore it. Though honestly, I often wrap these in custom `RuntimeException`s at service boundaries to avoid cluttering method signatures with `throws` declarations everywhere.

### Q36. What are unchecked exceptions?

Unchecked exceptions are `RuntimeException` and its subclasses, plus `Error`s. The compiler doesn't force you to handle them—they typically represent programming bugs or conditions you can't reasonably recover from.

These are what I work with most in Spring Boot apps—`NullPointerException`, `IllegalArgumentException`, `IllegalStateException`. For instance, if a client sends invalid JSON to a REST endpoint, I'd throw `IllegalArgumentException` for validation errors. These don't need `throws` declarations, which keeps service method signatures clean. The global exception handler catches them and converts to proper HTTP responses.

### Q37. What is the difference between checked and unchecked exceptions?

The key difference is compiler enforcement—checked exceptions must be caught or declared, while unchecked ones don't. Philosophically, checked exceptions represent anticipated, recoverable issues, while unchecked ones represent programming errors or unrecoverable conditions.

In production microservices, I see checked exceptions for external I/O (files, network, DB), and unchecked for business logic violations and bugs. For example, `IOException` when calling an API is checked—you can retry or fallback. But `NullPointerException` from not null-checking is unchecked—it's a bug that should be fixed. Modern practice favors unchecked exceptions to avoid boilerplate, which is why Spring's `DataAccessException` is unchecked even though JDBC's `SQLException` is checked.

### Q38. When should you use checked exceptions vs unchecked exceptions?

Use checked exceptions for recoverable conditions where the caller can reasonably do something about it—like retrying on network failure or prompting for a different file. Use unchecked for programming errors, invalid states, or conditions where recovery doesn't make sense.

In my microservices, I use unchecked exceptions almost exclusively now. For domain logic violations, I throw custom runtime exceptions like `InvalidPaymentException` or `AccountNotFoundException`. Even when dealing with checked exceptions from JDBC or I/O, I catch them at the service layer and wrap them in unchecked domain exceptions. This keeps method signatures clean and lets Spring's exception handling convert them to proper HTTP responses.

### Q39. Name some common checked exceptions.

The most common ones are `IOException`, `SQLException`, `ClassNotFoundException`, `InterruptedException`, and `ParseException`. Basically anything that deals with I/O, databases, or external resources tends to be checked.

In production, I hit `IOException` constantly when reading from S3, `SQLException` when using raw JDBC (though Spring wraps these), `InterruptedException` in multi-threaded batch jobs, and sometimes `URISyntaxException` when building URLs dynamically. Each time, I either handle them locally or wrap them in business-specific runtime exceptions that my global error handler understands.

### Q40. Name some common unchecked exceptions.

The main ones are `NullPointerException`, `IllegalArgumentException`, `IllegalStateException`, `IndexOutOfBoundsException`, `ClassCastException`, and `NumberFormatException`. Basically most programming errors are unchecked.

In my Spring Boot apps, NPEs are unfortunately still common at service boundaries, `IllegalArgumentException` for validation, `IllegalStateException` when methods are called in wrong order (like calling close() twice), and `NumberFormatException` when parsing request params. I also throw custom unchecked exceptions extensively—like `ResourceNotFoundException` for 404s or `BusinessValidationException` for domain rule violations.

### Q41. Can you convert a checked exception to an unchecked exception?

Yes, you catch the checked exception and wrap it in an unchecked one by passing the original as the cause. This is common practice to avoid polluting method signatures with throws clauses.

I do this all the time at service layer boundaries. For example, my repository might throw `SQLException`, but my service catches it and throws `new DataAccessException("Failed to fetch user", sqlException)` which extends `RuntimeException`. This way, my service interface stays clean, but I don't lose the original exception info—it's still there via `getCause()` for debugging. Spring's `@Repository` annotation actually does this automatically for JDBC exceptions.

### Q42. What is `RuntimeException`?

`RuntimeException` is the base class for all unchecked exceptions. If an exception extends `RuntimeException`, you don't have to catch it or declare it with throws—it's optional.

This is what I extend when creating custom business exceptions. For instance, I'd create `public class PaymentFailedException extends RuntimeException` so I can throw it anywhere without declaring it in method signatures. It keeps the code much cleaner, especially in microservices where exceptions flow through multiple layers. Spring's exception handling catches them at the controller level and converts them to appropriate HTTP responses.

### Q43. Does the compiler check unchecked exceptions?

No, the compiler doesn't force you to catch or declare unchecked exceptions. You can throw them anywhere without a throws clause, and call methods that throw them without catching.

This is both a blessing and a curse. It keeps code cleaner without forced try-catch everywhere, but it also means you can miss handling important error cases. In my projects, I rely on global exception handlers in Spring (`@ControllerAdvice`) to catch unchecked exceptions that bubble up. For critical operations, I still catch specific unchecked exceptions explicitly—like catching `RedisConnectionException` to implement circuit breaking.

### Q44. What is the best practice for handling checked exceptions?

The best practice is to handle them at the appropriate level—catch them where you can do something meaningful, or convert them to unchecked domain exceptions at layer boundaries. Don't just catch and swallow them, and avoid declaring `throws Exception` everywhere.

In my microservices, I catch checked exceptions like `IOException` at the repository or integration layer, log the details, and wrap them in business-specific unchecked exceptions. For example, when calling an external API throws `IOException`, I catch it and throw `new ExternalServiceException("Payment service unavailable", e)`. The global handler then converts this to a 503 response. This keeps business logic clean while preserving error context for debugging.

[↑ Back to Table of Contents](#table-of-contents)

---

## Custom Exceptions

### Q45. How do you create a custom exception?

You create a class that extends either `Exception` for checked or `RuntimeException` for unchecked, and typically provide constructors that accept a message and optionally a cause. That's really all you need—the rest is inherited from the parent class.

In my microservices, I create custom exceptions for domain-specific errors. For example: `public class ResourceNotFoundException extends RuntimeException { public ResourceNotFoundException(String message) { super(message); } }`. Then I throw it like `throw new ResourceNotFoundException("User not found: " + userId)`. My global exception handler catches these and maps them to appropriate HTTP status codes—404 for `ResourceNotFoundException`, 400 for `ValidationException`, etc.

### Q46. Should custom exceptions extend Exception or RuntimeException?

In modern Java development, you should almost always extend `RuntimeException`. It avoids cluttering your method signatures with throws declarations and gives callers flexibility in handling.

I extend `RuntimeException` for all my custom exceptions—`PaymentFailedException`, `AccountNotFoundException`, `InvalidRequestException`. This keeps service interfaces clean and lets Spring's exception handling work smoothly. The only time I'd consider checked exceptions is for truly exceptional conditions where you want to force the caller to make an explicit decision, but that's rare in practice. Most business logic exceptions should be unchecked.

### Q47. What are the best practices for creating custom exceptions?

Key practices: extend `RuntimeException`, provide constructors for message and cause, use meaningful names that reflect the business domain, and include relevant context in the message. Keep them simple—no complex logic in exception classes.

In my projects, I follow a pattern: create a base `BusinessException` extending `RuntimeException`, then create specific exceptions like `ResourceNotFoundException`, `DuplicateResourceException`, `InvalidStateException` that extend it. Each has constructors for message and cause. I also add an error code field sometimes for API error responses: `private final String errorCode`. This gives clients a machine-readable error identifier while keeping human-readable messages.

### Q48. Should you include a cause in custom exceptions?

Yes, when wrapping lower-level exceptions, always pass them as the cause using the `super(message, cause)` constructor. This preserves the full stack trace for debugging while still throwing a higher-level, domain-specific exception.

I do this constantly when wrapping infrastructure exceptions. For example, when a Redis operation fails with `JedisConnectionException`, I catch it and throw `new CacheException("Failed to access user cache", jedisException)`. This way, my service layer only knows about `CacheException`, but the full Redis stack trace is still available in logs via `getCause()`. Without chaining, you'd lose valuable debugging info.

### Q49. How do you add custom error messages to exceptions?

You pass the message through constructors to the parent class using `super(message)`, and you can format it with context using String formatting or concatenation. The message should be clear, specific, and include relevant values.

In my exceptions, I make messages descriptive: `throw new ResourceNotFoundException("Order not found with id: " + orderId + " for user: " + userId)`. For validation errors, I include what failed: `throw new ValidationException("Amount must be positive, got: " + amount)`. Sometimes I also use String.format for complex messages: `String.format("Payment failed: %s, retry count: %d", reason, retries)`. This makes logs much more actionable than generic messages.

### Q50. When should you create a custom exception vs using built-in exceptions?

Create custom exceptions when you need domain-specific semantics or when you want specific handling at higher levels. Use built-in exceptions for generic programming errors like validation.

In my microservices, I use built-in exceptions like `IllegalArgumentException` for simple input validation, but create custom ones for business rules—`InsufficientBalanceException`, `OrderAlreadyCancelledException`, `PaymentGatewayException`. This lets my global exception handler distinguish between generic errors (return 400) and domain errors (maybe 402 for insufficient balance, with a specific error code). Custom exceptions also make it clear what can go wrong from reading the method signature or code.

[↑ Back to Table of Contents](#table-of-contents)

---

## Best Practices

### Q51. What are exception handling best practices?

Key practices: catch specific exceptions rather than generic ones, don't swallow exceptions silently, always log with context, clean up resources properly (use try-with-resources), and provide meaningful error messages. Also, fail fast—throw exceptions early rather than letting bad state propagate.

In production microservices, I follow these religiously. I catch specific exceptions to handle them appropriately—timeouts get retries, validation errors return 400s, resource not found returns 404s. I always log exceptions with correlation IDs and request context so we can trace them in production. And I use `@ControllerAdvice` in Spring to centralize exception handling and ensure consistent error responses across all endpoints.

### Q52. Should you catch `Exception` or specific exception types?

Catch specific exception types when you need different handling logic for each. Only catch generic `Exception` as a last resort safety net, and even then, make sure to log it properly.

In my REST controllers, I catch specific exceptions in service methods—`SocketTimeoutException` to retry, `JsonProcessingException` to return 400 with parsing error details. Then I have a catch-all `Exception` handler in `@ControllerAdvice` that logs and returns 500 for unexpected errors. Catching only `Exception` everywhere hides important details about what went wrong and makes debugging harder.

### Q53. Should you use exceptions for control flow?

No, exceptions should be for exceptional conditions, not normal program flow. They're expensive—throwing an exception involves stack trace creation—and using them for flow control makes code harder to read.

I've seen bad code where someone threw exceptions for things like "user not found" during login and caught it to show a login error. That's wrong—use proper return values or Optional. Exceptions should be for genuinely unexpected conditions. For instance, throwing `ValidationException` for invalid input is fine, but using exceptions to break out of loops or as return values is an anti-pattern.

### Q54. What is exception chaining?

Exception chaining is when you wrap one exception inside another using the cause parameter, preserving the original exception's stack trace while throwing a higher-level exception. This maintains the full error context.

I use this extensively when crossing architectural boundaries. For example, when JDBC throws `SQLException`, I catch it and throw `new DataAccessException("Failed to fetch user", sqlException)`. When calling external APIs throws `IOException`, I wrap it in `ExternalServiceException`. This way, my service layer deals with domain exceptions, but the full technical details are preserved in the cause chain for debugging.

### Q55. How do you preserve the stack trace when rethrowing an exception?

Either rethrow the same exception without catching it, or if you need to wrap it, pass it as the cause to your new exception using the constructor that accepts a `Throwable`. Never create a new exception without the cause if you're wrapping.

In my code, I catch low-level exceptions and wrap them: `catch (IOException e) { throw new ServiceException("Operation failed", e); }`. The `e` parameter preserves the full stack trace. I've debugged production issues where someone created a new exception without the cause—`throw new ServiceException("Operation failed")`—and we lost all context about the root cause. Always chain exceptions.

### Q56. What is the difference between `printStackTrace()` and logging exceptions?

`printStackTrace()` writes to standard error and isn't production-friendly—no log levels, no correlation IDs, no structured logging. Proper logging uses a framework like SLF4J or Log4j2 with appropriate levels, structured context, and integration with log aggregation tools.

In production, I never use `printStackTrace()`. Instead, I log with SLF4J: `log.error("Failed to process payment for order {}", orderId, exception)`. This gives us proper log levels, timestamps, thread info, and the exception is properly formatted. In microservices with centralized logging (ELK or Splunk), structured logging makes it easy to search and correlate errors across services using trace IDs.

### Q57. Should you catch and ignore exceptions?

Absolutely not—catching and ignoring (empty catch block) is one of the worst anti-patterns. If an exception happens, at minimum log it. If you genuinely need to ignore it, add a comment explaining why.

I've seen production bugs where exceptions were silently swallowed—payment confirmations failed but no one knew because the catch block was empty. Now in code reviews, empty catch blocks are automatic rejections. Even if you decide to ignore an exception (rare), log it at debug or warn level with context: `log.warn("Failed to update cache, continuing with stale data", e)`. Never just `catch (Exception e) {}`.

### Q58. What is the "fail fast" principle?

Fail fast means detecting and throwing exceptions as early as possible when something goes wrong, rather than letting invalid state propagate. Validate inputs immediately, check preconditions early, and throw exceptions at the point of failure.

In my services, I validate all inputs at method entry: `if (amount <= 0) throw new IllegalArgumentException("Amount must be positive")`. I don't let negative amounts flow through business logic and fail later. Same with null checks—I fail immediately if required parameters are null rather than getting an NPE deep in the call stack. This makes debugging easier because the stack trace points to where the problem was detected, not where it eventually exploded.

### Q59. How do you handle exceptions in multi-threaded applications?

In executor service threads, uncaught exceptions terminate only that thread, not the whole application. You need explicit handling—wrap your `Runnable` or `Callable` in try-catch, use `UncaughtExceptionHandler`, or handle returned `Future` exceptions.

In my Spring Boot async methods (using `@Async`), I configure a custom exception handler: `AsyncUncaughtExceptionHandler` to log errors. For executor services, I always check `Future.get()` in try-catch to handle exceptions: `try { future.get(); } catch (ExecutionException e) { log.error("Task failed", e.getCause()); }`. In scheduled jobs, unhandled exceptions would silently stop the schedule, so I wrap the entire method in try-catch.

### Q60. What are suppressed exceptions (Java 7)?

Suppressed exceptions occur in try-with-resources when both your code and the `close()` method throw exceptions. The main exception is thrown, but the close exception is added as suppressed and accessible via `getSuppressed()`.

This solves a problem with traditional finally blocks where close exceptions would overwrite the original exception. For example, if reading a file throws `IOException` and closing the stream also throws one, you'd lose the read exception in a finally block. With try-with-resources: `try (Stream s = ...) { code }`, both exceptions are preserved—the main one is thrown, the close exception is suppressed. In logs, you'd see both in the stack trace.

### Q61. How do you log exceptions properly?

Log exceptions at the appropriate level (error for failures, warn for recoverable issues), include context like user IDs or request IDs, and pass the exception object to the logger so it formats the stack trace. Don't just log the message—log the full exception.

In my microservices, I always log with context: `log.error("Failed to process payment for order {} user {}", orderId, userId, exception)`. I use MDC (Mapped Diagnostic Context) to add trace IDs to every log line so we can track a request across services. Never do `log.error(e.getMessage())`—it loses the stack trace. Always `log.error("Context message", e)` where `e` is the exception object. In production with ELK stack, this makes debugging much easier.

### Q62. Should you catch `Throwable`?

Almost never. Catching `Throwable` catches both exceptions and errors, including `OutOfMemoryError` and `StackOverflowError` which you can't recover from. It's extremely rare to need this—maybe in framework code or test runners, but not in application code.

I've seen people catch `Throwable` thinking it's safer, but it actually masks serious problems. If the JVM is out of memory, catching `Throwable` won't help—you need to let it crash and restart. In Spring Boot applications, stick to catching specific exceptions or at most `Exception`. The only place I've caught `Throwable` is in custom thread pool handlers to log absolutely everything before thread termination.

### Q63. What is the performance impact of exception handling?

Creating exceptions is expensive because it captures the stack trace. Try-catch blocks themselves have minimal overhead if no exception is thrown, but throwing and catching repeatedly in hot paths can impact performance significantly.

In high-throughput services, I avoid exceptions in normal flow. For example, parsing user input, I'd use Optional or validation that returns results rather than throwing exceptions for invalid formats. But for genuine errors—network failures, database issues—the performance cost is acceptable because these aren't hot paths. I've profiled applications where validation was throwing thousands of exceptions per second, and switching to return-based validation improved throughput noticeably.

### Q64. How do you handle exceptions in lambda expressions and streams?

Lambdas can't throw checked exceptions, so you either wrap operations in try-catch inside the lambda, create wrapper methods that convert checked to unchecked, or use libraries like Vavr that provide exception-handling utilities.

In Stream operations, I create helper methods: `private static Function<String, Integer> parseIntSafe() { return s -> { try { return Integer.parseInt(s); } catch (NumberFormatException e) { return null; } }; }`. Or I use `Optional`: `strings.stream().map(s -> tryParse(s)).flatMap(Optional::stream)`. For operations that should fail fast, I throw unchecked exceptions from the lambda. It's a bit awkward, but that's how Java streams work.

### Q65. What is the difference between defensive programming and exception handling?

Defensive programming is preventing errors before they happen through validation, null checks, and precondition verification. Exception handling is dealing with errors after they occur. Both are needed—defensive programming reduces exceptions, exception handling ensures graceful failures.

In my code, I use defensive programming at boundaries—validate all inputs, null-check parameters, verify preconditions. But I also handle exceptions for things I can't prevent—network failures, database issues, external API errors. For example, I'd validate that an amount is positive (defensive) but also catch `SQLException` when saving to database (exception handling). Defense-in-depth approach.

### Q66. Should constructors throw exceptions?

Yes, constructors can and should throw exceptions if object creation fails or if invariants can't be satisfied. It's better to fail fast in the constructor than create an object in an invalid state.

In my domain objects, I throw exceptions from constructors for validation: `public Money(BigDecimal amount) { if (amount.compareTo(ZERO) < 0) throw new IllegalArgumentException("Amount cannot be negative"); }`. This ensures I can never have a Money object with negative value. For objects with complex initialization, I sometimes throw custom exceptions if external resources aren't available. Just make sure you don't leak `this` reference before construction completes.

### Q67. How do you handle exceptions in finally blocks?

Wrap each cleanup operation in its own try-catch so that one failure doesn't prevent other cleanup. Log exceptions that occur during cleanup but don't rethrow them, or they'll mask the original exception.

In finally blocks, I do: `finally { try { connection.close(); } catch (SQLException e) { log.warn("Failed to close connection", e); } }`. If I had multiple resources to close, each gets its own try-catch. This way, if closing one resource fails, others still get closed. Though honestly, I prefer try-with-resources now which handles this automatically and more safely through suppressed exceptions.

### Q68. What is the relationship between exceptions and transactions?

Runtime exceptions (unchecked) trigger automatic rollback in Spring's transactional methods, while checked exceptions don't by default. You can configure which exceptions trigger rollback using `@Transactional(rollbackFor = {...})`.

In my Spring services, I rely on this behavior. If a business rule violation throws a custom `RuntimeException` during an `@Transactional` method, Spring automatically rolls back the transaction. For checked exceptions, I'd either wrap them in unchecked exceptions or explicitly configure rollback. For example: `@Transactional(rollbackFor = {IOException.class})` if I want checked exceptions to also rollback. This is crucial for maintaining data consistency.

### Q69. How do you test exception handling in unit tests?

Use JUnit's `assertThrows()` to verify that specific exceptions are thrown under expected conditions. Also test that the exception message contains expected information and that side effects happened correctly (or didn't happen).

In my unit tests, I write: `assertThrows(ResourceNotFoundException.class, () -> service.findUser(999L))` to verify the exception type. I also check messages: `Exception e = assertThrows(...); assertTrue(e.getMessage().contains("User not found"))`. For transactional code, I verify rollback happened. I test both the happy path and exception paths—for example, when an external API times out, verify we logged the error and the cache remains unchanged.

### Q70. What are the common anti-patterns in exception handling?

Main anti-patterns: catching and swallowing exceptions (empty catch), catching generic Exception everywhere, using exceptions for control flow, logging without the exception object (losing stack trace), not cleaning up resources, and rethrowing exceptions incorrectly (losing the cause).

In code reviews, I watch for these constantly. The worst I've seen: `catch (Exception e) { log.error("Error occurred"); }` losing both the exception type and stack trace, or `catch (Exception e) { throw new MyException(e.getMessage()); }` losing the cause chain. Also throwing exceptions in finally blocks that mask the original exception. In production microservices, these anti-patterns cause hours of debugging because you can't trace errors back to their root cause.

[↑ Back to Table of Contents](#table-of-contents)

---

[← Back to Problem Set](../problem-set.md)

