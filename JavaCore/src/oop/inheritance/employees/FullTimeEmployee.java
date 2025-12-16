package oop.inheritance.employees;

public class FullTimeEmployee extends Employee {
    double benefits;

    FullTimeEmployee(String name, double salary, double benefits) {
        super(name, salary);
        this.benefits = benefits;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Benefits: " + benefits);
    }
}