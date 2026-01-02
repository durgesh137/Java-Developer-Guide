package com.javacore.desingpatterns.singleton.fixes;

/**
 * Fix for AppConfigBreakerWithThreads issue
 */
public class F1SynchronizedAppConfig {
    private volatile static F1SynchronizedAppConfig config;
    private final String dbUrl;

    private F1SynchronizedAppConfig() {
        this.dbUrl = "jdbc:mysql://localhost:3306/test";
    }

    public static F1SynchronizedAppConfig getInstance() {
        if (config == null) {
            synchronized (F1SynchronizedAppConfig.class) {
                if (config == null) {
                    config = new F1SynchronizedAppConfig();
                }
            }
        }
        return config;
    }

    public String toString(){
        return "DB URL: " + dbUrl;
    }
}

/**
 * Key Changes-
 * 1. Putting synchronized block within static getInstance() after null check
 * - since only once object needs to be created, hence synchronized block is placed to only when config is null
 * - synchronized only protects the creation of the object
 *
 * 2. Make this config variable volatile as well while declaring it
 * - this bug was common on older hardware like ARM
 * - volatile ensures that the "Write" by the initializing thread is immediately "Read" by all other CPU cores.
 *
 * 3. This approach of using synchronized block and volatile keyword is termed Double-Checked Locking pattern
 */