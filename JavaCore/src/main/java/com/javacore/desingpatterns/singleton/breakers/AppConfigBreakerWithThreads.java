package com.javacore.desingpatterns.singleton.breakers;

import com.javacore.desingpatterns.singleton.AppConfig;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppConfigBreakerWithThreads {
     static void main(String[] args) {
        try(ExecutorService executorService = Executors.newFixedThreadPool(10)){
            for(int i = 0; i < 10; i++){
                executorService.execute(workWithAppConfig());
            }
            executorService.shutdown();
        }

    }

    private static Runnable workWithAppConfig() {
         return new Runnable() {
             @Override
             public void run() {
                 AppConfig config = AppConfig.getInstance();
                 System.out.println(Thread.currentThread().getName()+" "+config.hashCode());
             }
         };
    }
}

/**
 * Observations-
 * 1. Here total 10 threads are accessing AppConfig
 *  - After running the above code, we see at-least two different hashCode
 *  - this means minimum two different database connections, where our use-case was to have only one DB connection
 *
 * Example Output-
 * pool-1-thread-5 1499037851
 * pool-1-thread-6 1499037851
 * pool-1-thread-10 1499037851
 * pool-1-thread-1 824980600
 * pool-1-thread-9 1499037851
 * pool-1-thread-2 824980600
 * pool-1-thread-7 1499037851
 * pool-1-thread-4 824980600
 * pool-1-thread-8 1499037851
 *
 * 2. To fix this issue, within getInstance right after null check put synchronized block,
 * - this will prevent concurrent thread access, F1SynchronizedAppConfig.java mimics the same
 * -
 */