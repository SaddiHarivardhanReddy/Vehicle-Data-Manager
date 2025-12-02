package com.codegnan.dao;

import java.util.List;
import com.codegnan.exceptions.VehicleNotFoundException;
import com.codegnan.model.Vehicle;

public interface VehicleDao {

    void save(Vehicle vehicle);

    List<Vehicle> findAll();

    Vehicle findById(int id) throws VehicleNotFoundException;

    Vehicle update(Vehicle vehicle) throws VehicleNotFoundException;

    void deleteById(int id) throws VehicleNotFoundException;
}

