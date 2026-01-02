package com.javacore.desingpatterns.singleton;

public class AppConfigMain {
    static void main(String[] args) {
        System.out.println("Singleton Pattern example...");
        AppConfig appConfig = AppConfig.getInstance();
        System.out.println(appConfig);
    }
}
