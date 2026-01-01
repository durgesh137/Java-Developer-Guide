package com.javacore.oop.inheritance.vehicle.base;

/**
 * Base Vehicle class demonstrating different access modifiers.
 * This class is in a separate package to show protected modifier significance.
 */
public class Vehicle {
    // Private: Only accessible within Vehicle class
    private String engineNumber;

    // Protected: Accessible in subclasses even in different packages
    protected String brand;
    protected int year;

    // Public: Accessible everywhere
    public String registrationNumber;

    // Default (package-private): Only accessible in same package
    String chassisNumber;

    public Vehicle(String brand, int year, String registrationNumber) {
        this.brand = brand;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.engineNumber = generateEngineNumber();
        this.chassisNumber = generateChassisNumber();
    }

    // Protected method: Can be overridden and called by subclasses
    protected void startEngine() {
        System.out.println(brand + " engine starting...");
        System.out.println("Engine Number: " + engineNumber);
    }

    // Protected method: Accessible to subclasses for customization
    protected String getVehicleInfo() {
        return String.format("Brand: %s, Year: %d, Reg: %s",
            brand, year, registrationNumber);
    }

    // Public method: Available to all
    public void displayInfo() {
        System.out.println(getVehicleInfo());
    }

    // Private helper method: Only used internally
    private String generateEngineNumber() {
        return "ENG-" + brand.substring(0, 3).toUpperCase() + "-" + year;
    }

    // Package-private method: Only accessible in same package
    String generateChassisNumber() {
        return "CHS-" + registrationNumber;
    }

    // Protected getter for private field (controlled access)
    protected String getEngineNumber() {
        return engineNumber;
    }
}

