package com.solvd.hmsbase.vehicle;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Car extends Vehicle {

    private String engine;

    public  Car() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
