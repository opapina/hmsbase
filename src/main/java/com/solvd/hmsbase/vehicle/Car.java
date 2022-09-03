package com.solvd.hmsbase.vehicle;

import com.solvd.hmsbase.base.Engine;

public class Car extends Vehicle {

    private Engine engine;

    public Car(String model, String brand) {
        super(model, brand);
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
