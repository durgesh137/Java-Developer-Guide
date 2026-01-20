package com.javacore.desingpatterns.singleton;

public final class AppConfig {
    private static AppConfig appConfig;
    private final String dbUrl;

    private AppConfig() {
        dbUrl = "jdbc:mysql://localhost:3306/test";
    }

    public static AppConfig getInstance(){
        if(appConfig == null){
            appConfig = new AppConfig();
        }
        return appConfig;
    }

    public String toString(){
        return "DB URL: " + dbUrl;
    }
}

/**
 * Key Points for designing a Singleton class-
 * 1. Make constructors private, further all fields should be private exception static
 * 2. Define static variable of same class type like Person in this case
 * 3. Define a public factory method to provide the object of Person
 * - here idea is to check if static variable person is already initialized, then return same object
 * - otherwise create object and then return it
 * 4. This public factory method should not access parameters
 * - since everytime this method is called, different parameters might be passed,
 * - if once static variable is initialized, later those parameter will not be used.
 * - it can be misleading, hence don't use it this way
 */