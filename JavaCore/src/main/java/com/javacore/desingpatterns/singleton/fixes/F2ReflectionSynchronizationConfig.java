package com.javacore.desingpatterns.singleton.fixes;

import java.io.Serializable;

/**
 * this class safeguards against threading and reflection breakers of singleton pattern
 */
public class F2ReflectionSynchronizationConfig implements Serializable {
    //volatile to ensure immediate changes are visible among all threads
    private volatile static F2ReflectionSynchronizationConfig instance;
    private String dbUrl;

    private F2ReflectionSynchronizationConfig() {
        if(instance != null){
            throw new RuntimeException("F2ReflectionSynchronizationConfig instance has been already initialized");
        }
        this.dbUrl = "jdbc:mysql://localhost:3306/test";
    }

    /**
     * static factory method to provide the Singleton instance
     * @return
     */
    public static F2ReflectionSynchronizationConfig getInstance(){
        if(instance == null){
            synchronized (F2ReflectionSynchronizationConfig.class){
                    instance = new F2ReflectionSynchronizationConfig();
            }
        }
        return instance;
    }

    public String toString(){
        return "DB URL: " + dbUrl;
    }
}
