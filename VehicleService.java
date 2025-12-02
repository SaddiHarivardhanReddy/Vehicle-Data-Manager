package com.codegnan.service;

import java.util.List;
import com.codegnan.exceptions.VehicleNotFoundException;
import com.codegnan.model.Vehicle;

public interface VehicleService {

    void addVehicle(Vehicle vehicle);

    List<Vehicle> getAllVehicles();

    Vehicle getVehicleById(int id) throws VehicleNotFoundException;

    Vehicle updateVehicle(Vehicle vehicle) throws VehicleNotFoundException;

    void deleteVehicle(int id) throws VehicleNotFoundException;
}
