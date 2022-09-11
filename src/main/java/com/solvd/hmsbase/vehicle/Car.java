package com.solvd.hmsbase.vehicle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Car extends Vehicle {

    @XmlElement
    private String engine;

    public  Car() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                "} " + super.toString();
    }
}
