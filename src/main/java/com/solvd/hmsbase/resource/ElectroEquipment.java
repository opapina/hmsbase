package com.solvd.hmsbase.resource;

import java.math.BigDecimal;

public class ElectroEquipment extends Equipment {

    private Integer power;

    public ElectroEquipment(String name, String typeService, BigDecimal price, Integer power) {
        super(name, typeService, price);
        this.power = power;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }
}
