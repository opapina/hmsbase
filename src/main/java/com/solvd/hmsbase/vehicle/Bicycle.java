package com.solvd.hmsbase.vehicle;

import javax.xml.bind.annotation.XmlType;

@XmlType
public class Bicycle extends Vehicle {

    public  Bicycle() {
    }
    public Bicycle(String model, String brand) {
        super(model, brand);
    }
}
