package com.solvd.hmsbase.vehicle;

import com.solvd.hmsbase.service.Cleaning;
import com.solvd.hmsbase.service.GarbageRemoval;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Bicycle.class, Car.class})
public class Vehicle {

    @XmlElement
    private String model;
    @XmlElement
    private String brand;
    @XmlElement
    private Integer wheelsCount;

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

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", wheelsCount=" + wheelsCount +
                '}';
    }
}
