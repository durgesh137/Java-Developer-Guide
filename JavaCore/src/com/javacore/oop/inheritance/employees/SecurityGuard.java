package com.javacore.oop.inheritance.employees;

public class SecurityGuard extends PartTimeEmployee {
    public SecurityGuard(String name, double salary) {
        super(name, salary, 0); // Security guards have 0 hours worked by default
    }

    @Override
    void displayInfo() {
        System.out.println("Security Guard Info:");
        super.displayInfo();
        System.out.println("Role: Security Guard");
    }
}
