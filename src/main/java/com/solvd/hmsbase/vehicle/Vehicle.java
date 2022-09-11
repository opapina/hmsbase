package com.solvd.hmsbase.vehicle;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Vehicle {
    @XmlElement
    private String model;
    @XmlElement
    private String brand;

    private Integer wheelsCount;

    public  Vehicle () {
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
        this.wheelsCount = wheelsCount;
    }
}
