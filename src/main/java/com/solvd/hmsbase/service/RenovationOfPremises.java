package com.solvd.hmsbase.service;

import java.time.LocalDateTime;

public class RenovationOfPremises extends Service {

    private Float heightOfWalls;
    private Float widthOfWalls;
    private Double squaresOfFloor;
    private Integer quantityOfWindows;
    private Integer quantityOfDoors;
    private LocalDateTime timeOfRenovation;

    public RenovationOfPremises(String type, String place, Float heightOfWalls, Float widthOfWalls, Double squaresOfFloor, Integer quantityOfWindows, Integer quantityOfDoors) {
        super(type, place);
        this.timeOfRenovation = LocalDateTime.now();
        this.heightOfWalls = heightOfWalls;
        this.widthOfWalls = widthOfWalls;
        this.squaresOfFloor = squaresOfFloor;
        this.quantityOfWindows = quantityOfWindows;
        this.quantityOfDoors = quantityOfDoors;
    }

    public Float getHeightOfWalls() {
        return heightOfWalls;
    }

    public void setHeightOfWalls(Float heightOfWalls) {
        this.heightOfWalls = heightOfWalls;
    }

    public Float getWidthOfWalls() {
        return widthOfWalls;
    }

    public void setWidthOfWalls(Float widthOfWalls) {
        this.widthOfWalls = widthOfWalls;
    }

    public Double getSquaresOfFloor() {
        return squaresOfFloor;
    }

    public void setSquaresOfFloor(Double squaresOfFloor) {
        this.squaresOfFloor = squaresOfFloor;
    }

    public Integer getQuantityOfWindows() {
        return quantityOfWindows;
    }

    public void setQuantityOfWindows(Integer quantityOfWindows) {
        this.quantityOfWindows = quantityOfWindows;
    }

    public Integer getQuantityOfDoors() {
        return quantityOfDoors;
    }

    public void setQuantityOfDoors(Integer quantityOfDoors) {
        this.quantityOfDoors = quantityOfDoors;
    }

    public LocalDateTime getTimeOfRenovation() {
        return timeOfRenovation;
    }

    public void timeOfRenovation(LocalDateTime timeOfRenovation) {
        this.timeOfRenovation = timeOfRenovation;
    }

    public String getTypeService() {
        return type;
    }
}
