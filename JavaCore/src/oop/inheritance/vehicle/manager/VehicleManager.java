package oop.inheritance.vehicle.manager;

import oop.inheritance.vehicle.base.Vehicle;
import oop.inheritance.vehicle.types.Car;
import oop.inheritance.vehicle.types.Bike;

/**
 * VehicleManager operates on vehicles from a different package.
 * Demonstrates what members are accessible from outside the inheritance hierarchy.
 */
public class VehicleManager {

    public void manageVehicle(Vehicle vehicle) {
        System.out.println("\n=== Managing Vehicle ===");

        // CAN access public members
        System.out.println("Registration: " + vehicle.registrationNumber);

        // CAN call public methods
        vehicle.displayInfo();

        // CANNOT access protected members (not a subclass):
        // System.out.println(vehicle.brand); // Compile error!
        // System.out.println(vehicle.year); // Compile error!

        // CANNOT call protected methods (not a subclass):
        // vehicle.startEngine(); // Compile error!
        // vehicle.getVehicleInfo(); // Compile error!

        // CANNOT access package-private members (different package):
        // System.out.println(vehicle.chassisNumber); // Compile error!
    }

    public void manageCar(Car car) {
        System.out.println("\n=== Managing Car ===");

        // Can access public members from Vehicle
        System.out.println("Registration: " + car.registrationNumber);

        // Can call public methods
        car.displayInfo();

        // Can call Car's own public methods
        car.openTrunk();

        // CANNOT access protected members even though Car can
        // System.out.println(car.brand); // Compile error!
    }

    public void manageBike(Bike bike) {
        System.out.println("\n=== Managing Bike ===");

        bike.displayInfo();
        bike.ringBell();

        // Same restrictions as Car
        // System.out.println(bike.brand); // Compile error!
    }

    public static void main(String[] args) {
        VehicleManager manager = new VehicleManager();

        // Create vehicles
        Car car = new Car("Toyota", 2023, "KA01AB1234", 4, "Petrol");
        Bike bike = new Bike("Honda", 2022, "KA02CD5678", "Sport", true);

        // Manage through manager (limited access)
        manager.manageVehicle(car);
        manager.manageCar(car);
        manager.manageBike(bike);

        System.out.println("\n=== Direct Vehicle Operations ===");
        // Vehicles can access their own protected methods internally
        car.displayInfo(); // Calls public method which uses protected members
        bike.displayInfo();
    }
}

