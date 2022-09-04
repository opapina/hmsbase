package com.solvd.hmsbase.vehicle;

public class Vehicle {

    private String model;
    private String brand;
    private Integer wheelsCount;

    public Vehicle(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(Integer wheelsCount) {
        if (wheelsCount == 0) {
            throw new InvalidCountWheelException("Vehicle should have wheels! Input number from 1 to 4:");
        }
        this.wheelsCount = wheelsCount;
    }
}
