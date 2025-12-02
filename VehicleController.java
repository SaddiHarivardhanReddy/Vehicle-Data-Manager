package com.codegnan.controller;

import com.codegnan.exceptions.VehicleNotFoundException;
import com.codegnan.model.Vehicle;
import com.codegnan.service.VehicleService;
import com.codegnan.service.VehicleServiceImpl;

public class VehicleController {

    public static void main(String[] args) {

        VehicleService service = new VehicleServiceImpl();

        System.out.println("VEHICLE MANAGEMENT\n");

        // 1. Add Vehicles
        Vehicle v1 = new Vehicle(101, "Honda City", "TS09AB1234", "Petrol");
        Vehicle v2 = new Vehicle(102, "Tata Nexon", "TS07BR4455", "Diesel");
        Vehicle v3 = new Vehicle(103, "Hyundai i20", "TS05CD7788", "Petrol");

        service.addVehicle(v1);
        service.addVehicle(v2);
        service.addVehicle(v3);

        System.out.println("Vehicles Added Successfully\n");

        // 2. Show all vehicles
        System.out.println("=== All Vehicles ===");
        service.getAllVehicles().forEach(System.out::println);
        System.out.println();

        // 3. Search Vehicle by ID
        System.out.println("=== Searching Vehicle ID 102 ===");
        try {
            System.out.println(service.getVehicleById(102));
        } catch (VehicleNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // 4. Update Vehicle
        System.out.println("=== Updating Vehicle ID 101 ===");
        Vehicle updated = new Vehicle(101, "Honda Civic", "TS09AC9999", "Petrol");

        try {
            service.updateVehicle(updated);
            System.out.println("Update Successful");
        } catch (VehicleNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // 5. Delete Vehicle
        System.out.println("=== Deleting Vehicle ID 103 ===");
        try {
            service.deleteVehicle(103);
            System.out.println("Delete Successful");
        } catch (VehicleNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();

        // 6. Show final list
        System.out.println("=== Final Vehicle List ===");
        service.getAllVehicles().forEach(System.out::println);

        
    }
}
