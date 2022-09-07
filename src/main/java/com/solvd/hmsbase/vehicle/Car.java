package com.solvd.hmsbase.vehicle;

public class Car extends Vehicle {

    private String engine;

    public Car(String model, String brand) {
        super(model, brand);
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
