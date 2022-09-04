package com.solvd.hmsbase.service;

public class RepairInOutLetPipes extends Service {

    private String material;
    private Double longP;
    private Double diameter;

    public RepairInOutLetPipes(String type, String place, String material, Double longP, Double diameter) {
        super(type, place);
        this.material = material;
        this.longP = longP;
        this.diameter = diameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getLongP() {
        return longP;
    }

    public void setLongP(Double longP) {
        this.longP = longP;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }

    public String getTypeService() {
        return this.name;
    }
}
