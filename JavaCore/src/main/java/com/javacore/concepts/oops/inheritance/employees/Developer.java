package com.javacore.concepts.oops.inheritance.employees;

public class Developer extends FullTimeEmployee {
    String programmingLanguage;

    Developer(String name, double salary, double benefits, String programmingLanguage) {
        super(name, salary, benefits);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayInfo() {
        System.out.println("Developer Info:");
        super.displayInfo();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}