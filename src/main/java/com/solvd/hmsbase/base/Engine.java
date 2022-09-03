package com.solvd.hmsbase.base;

public class Engine {

    private Integer number;
    private Double volume;
    private String fuel;

    public Engine(Integer number, Double volume) {
        this.number = number;
        this.volume = volume;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

}
