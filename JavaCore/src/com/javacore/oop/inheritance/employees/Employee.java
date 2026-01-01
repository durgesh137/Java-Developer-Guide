package com.javacore.oop.inheritance.employees;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}