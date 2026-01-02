package com.javacore.desingpatterns.singleton.fixes;

import java.io.Serial;
import java.io.Serializable;

public class F3SerializationReflectionSynchronizedConfig implements Serializable {
    //safeguarding immediate reads visibility across threads
    private static volatile F3SerializationReflectionSynchronizedConfig instance;
    private String dbUrl;

    private F3SerializationReflectionSynchronizedConfig() {
        if (instance != null) {
            //safeguarding Reflection
            throw new RuntimeException("Instance already initialized");
        }
        this.dbUrl = "jdbc:mysql://localhost:3306/test";
    }

    public static F3SerializationReflectionSynchronizedConfig getInstance() {
        if (instance == null) {
            //safeguarding concurrency
            synchronized (F3SerializationReflectionSynchronizedConfig.class) {
                instance = new F3SerializationReflectionSynchronizedConfig();
            }
        }
        return instance;
    }

    public String toString(){
        return "DB URL: " + dbUrl;
    }

    //safeguarding serialization, from creating new Object
    @Serial
    protected Object readResolve() {
        return getInstance();
    }
}
