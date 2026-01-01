package com.javacore.oop.inheritance.vehicle.types;

import com.javacore.oop.inheritance.vehicle.base.Vehicle;

/**
 * Bike class extending Vehicle from a different package.
 */
public class Bike extends Vehicle {
    private String handleType;
    private boolean hasCarrier;

    public Bike(String brand, int year, String registrationNumber,
                String handleType, boolean hasCarrier) {
        super(brand, year, registrationNumber);
        this.handleType = handleType;
        this.hasCarrier = hasCarrier;
    }

    @Override
    protected void startEngine() {
        // Access protected members
        System.out.println("Bike " + brand + " kick-starting...");
        System.out.println("Handle Type: " + handleType);

        // Call parent's protected method
        super.startEngine();
    }

    @Override
    protected String getVehicleInfo() {
        return super.getVehicleInfo() +
               String.format(", Handle: %s, Carrier: %s",
                   handleType, hasCarrier ? "Yes" : "No");
    }

    public void ringBell() {
        System.out.println(brand + " bike bell ringing!");
    }
}

