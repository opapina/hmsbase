package com.solvd.hmsbase.vehicle;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicle")
@XmlAccessorType(XmlAccessType.FIELD)
public class Bicycle extends Vehicle {

    public Bicycle() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
