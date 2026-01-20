package com.javacore.concepts.oops.inheritance.employees;

public class PartTimeEmployee extends Employee {
    int hoursWorked;

    PartTimeEmployee(String name, double salary, int hoursWorked) {
        super(name, salary);
        this.hoursWorked = hoursWorked;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
