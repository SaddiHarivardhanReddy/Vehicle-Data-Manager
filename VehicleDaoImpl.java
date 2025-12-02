package com.codegnan.dao;

import java.util.ArrayList;
import java.util.List;

import com.codegnan.exceptions.VehicleNotFoundException;
import com.codegnan.model.Vehicle;

public class VehicleDaoImpl implements VehicleDao {

    List<Vehicle> vehicleList = new ArrayList<>();

    @Override
    public void save(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    @Override
    public List<Vehicle> findAll() {
        return vehicleList;
    }

    @Override
    public Vehicle findById(int id) throws VehicleNotFoundException {
        for (Vehicle v : vehicleList) {
            if (v.getId() == id) {
                return v;
            }
        }
        throw new VehicleNotFoundException("Vehicle with ID " + id + " not found");
    }

    @Override
    public Vehicle update(Vehicle vehicle) throws VehicleNotFoundException {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId() == vehicle.getId()) {
                vehicleList.set(i, vehicle);
                return vehicle;
            }
        }
        throw new VehicleNotFoundException("Vehicle with ID " + vehicle.getId() + " not found. Cannot update.");
    }

    @Override
    public void deleteById(int id) throws VehicleNotFoundException {
        boolean removed = false;

        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getId() == id) {
                vehicleList.remove(i);
                removed = true;
                break;
            }
        }

        if (!removed) {
            throw new VehicleNotFoundException("Vehicle with ID " + id + " not found. Cannot delete.");
        }
    }
}
