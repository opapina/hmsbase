package com.solvd.hmsbase.service;

public class RepairInOutLetWires extends Service {

    private Double longW;

    public RepairInOutLetWires(String type, String place, Double longW) {
        super(type, place);
        this.longW = longW;
    }

    public Double getLongW() {
        return longW;
    }

    public void setLongW(Double longW) {
        this.longW = longW;
    }

    public String getTypeService() {
        return this.name;
    }
}
