package com.solvd.hmsbase.vehicle;

import com.solvd.hmsbase.base.Engine;

public class Truck extends Vehicle {

    private Engine engine;
    private String typeTruck;

    public Truck(String model, String brand) {
        super(model, brand);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getTypeTruck() {
        return typeTruck;
    }

    public void setTypeTruck(String typeTruck) {
        this.typeTruck = typeTruck;
    }
}

