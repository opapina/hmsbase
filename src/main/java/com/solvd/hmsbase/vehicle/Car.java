package com.solvd.hmsbase.vehicle;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Car extends Vehicle {

    public  Car() {
    }

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
