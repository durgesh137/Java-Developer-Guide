# Singleton
 
## Basic Rules for Creating a singleton class:
These are:

1. Make constructor private  
   - It is needed to prevent explicit object creation of the singleton class by any caller.

2. Define a private static reference of the same class to hold the single instance  
   - It resides in the static area of JVM memory, ensuring it stays for the application lifetime.  
   - Example: `private static AppConfig appConfig;`

3. Provide a public method to return the created instance  
   - It checks if the variable is null, creates the object if needed, otherwise returns the existing one.  
   - Common name: `getInstance()`

4. No parameters in the public factory method  
   - Accepting parameters is misleading because once the static instance is created, subsequent parameter values will be ignored.  
   - To configure a singleton, use separate initialization methods, a builder before first use, or eager initialization.

5. Consider thread-safety when creating lazy singletons  
   - Use `synchronized`, double-checked locking, or the initialize-on-demand holder idiom.

6. Handle serialization and reflection  
   - Implement `readResolve()` to preserve the singleton on deserialization.  
   - Guard against reflective access to the private constructor if needed.

## Creating class following first 4 points only
`AppConfig.java` does the same thing.

## Breaking Singleton with Concurrency using `AppConfigBreakerWithThreads.java`.
When total 10 threads tried accessing getInstance() at the same time, it created multiple instances of AppConfig class.
Cause-
1. Here getInstance() was not safeguarded to handle multiple threads access simultaneously.
2. since there is no lock, all 10 threads can read the config variable as null at the exact same time and execute the new keyword independently.
3. This resulted in creation of multiple objects.

### Ensuring thread safety with double-checked locking:
It can be done like this-
1. We need only once object creation to be done, hence only when static variable is null, we should check for concurrency.
- Here put synchronized block, to prevent multiple threads from access object creation code simultaneously.

2. Make static variable volatile
- It ensures that the "Write" by the initializing thread is immediately "Read" by all other CPU cores.
- Without volatile, a thread might create the instance and exit the synchronized block, but the CPU cache might not flush that change to Main Memory immediately. 
- Another thread, checking the first if(config == null) (which is outside the lock), will see a stale null and try to enter the lock, 
causing unnecessary contention or redundant checks.
- Replicating this scenario without volatile keyword is difficult, since modern hardware have become better, but this issue can come, hence Recommended

## Breaking Singleton with Reflection:
The singleton pattern can be broken in the following steps-
1. Create first instance using legal `getInstace()` method of Singleton class.
2. Get private constructor of singleton class via reflection.
3. Make it accessible using setAccessible(true), ensuring calling it despite being private.
4. Call the private constructor directly now and create new separate instance of the Singleton class.
5. Now compare the hashcode of both objects, if those are different, then Singleton is broken.

### Safeguarding against Reflection:
It can be prevented like this:

1. Within the constructor of Singleton class, first check if static variable is already initialized or not 
2. If already Initialized, then throw exception from constructor

````java
private F2ReflectionSynchronizationConfig() {
    if(instance != null){
        throw new RuntimeException("F2ReflectionSynchronizationConfig instance has been already initialized");
    }
    this.dbUrl = "jdbc:mysql://localhost:3306/test";
}
````

## Breaking Singleton With Serialization:
class `SingletonSerializationBreaker.java` breaks singleton by creating multiple objects
class `F3SerializationReflectionSynchronizedConfig.java` safeguards from all three common singleton breaker patterns