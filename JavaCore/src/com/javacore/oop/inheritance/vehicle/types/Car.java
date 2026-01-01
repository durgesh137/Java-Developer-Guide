package com.javacore.oop.inheritance.vehicle.types;

import com.javacore.oop.inheritance.vehicle.base.Vehicle;

/**
 * Car class extending Vehicle from a different package.
 * Demonstrates what members are accessible across packages.
 */
public class Car extends Vehicle {
    private int numberOfDoors;
    private String fuelType;

    public Car(String brand, int year, String registrationNumber,
               int numberOfDoors, String fuelType) {
        super(brand, year, registrationNumber);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    // Can override protected method
    @Override
    protected void startEngine() {
        // Can access protected members: brand, year
        System.out.println("Car " + brand + " (" + year + ") starting...");
        System.out.println("Fuel Type: " + fuelType);

        // Can call protected method
        super.startEngine();

        // Can access protected getter for private field
        System.out.println("Engine validated: " + getEngineNumber());

        // CANNOT access private field directly:
        // System.out.println(engineNumber); // Compile error!

        // CANNOT access package-private field (different package):
        // System.out.println(chassisNumber); // Compile error!
    }

    // Override protected method to add car-specific info
    @Override
    protected String getVehicleInfo() {
        return super.getVehicleInfo() +
               String.format(", Doors: %d, Fuel: %s", numberOfDoors, fuelType);
    }

    public void openTrunk() {
        System.out.println(brand + " trunk opened");
    }
}
