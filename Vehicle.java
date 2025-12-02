package com.codegnan.model;

public class Vehicle {

    private int id;
    private String model;
    private String registrationNo;
    private String fuelType;

    public Vehicle() {}

    public Vehicle(int id, String model, String registrationNo, String fuelType) {
        this.id = id;
        this.model = model;
        this.registrationNo = registrationNo;
        this.fuelType = fuelType;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getRegistrationNo() { return registrationNo; }
    public void setRegistrationNo(String registrationNo) { this.registrationNo = registrationNo; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    @Override
    public String toString() {
        return "Vehicle [id=" + id + ", model=" + model +
               ", registrationNo=" + registrationNo +
               ", fuelType=" + fuelType + "]";
    }
}

