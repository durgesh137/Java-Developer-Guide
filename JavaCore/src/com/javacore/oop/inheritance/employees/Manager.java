package com.javacore.oop.inheritance.employees;

public class Manager extends FullTimeEmployee {
    int teamSize;

    Manager(String name, double salary, double benefits, int teamSize) {
        super(name, salary, benefits);
        this.teamSize = teamSize;
    }

    @Override
    void displayInfo() {
        System.out.println("Manager Info:");
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}