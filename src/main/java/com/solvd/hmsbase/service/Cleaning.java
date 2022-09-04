package com.solvd.hmsbase.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cleaning extends Service {

    private String typeCleaning;
    private Integer surfaceDirection;
    private BigDecimal squareMeters;
    private LocalDateTime dateTimeCleaning;

    public Cleaning(String type, String place, String typeCleaning, Integer surfaceDirection, BigDecimal squareMeters) {
        super(type, place);
        this.dateTimeCleaning = LocalDateTime.now();
        this.squareMeters = squareMeters;
        this.typeCleaning = typeCleaning;
        this.surfaceDirection = surfaceDirection;
    }

    public Cleaning(String type, String place, String typeCleaning, Integer surfaceDirection, BigDecimal squareMeters, LocalDateTime dateTimeCleaning) {
        super(type, place);
        this.squareMeters = squareMeters;
        this.dateTimeCleaning = dateTimeCleaning;
        this.typeCleaning = typeCleaning;
        this.surfaceDirection = surfaceDirection;
    }

    public static void dust(String placeOfCleaning1, Integer surfaceDirection1) {
        System.out.print("Dust was removed in" + placeOfCleaning1 + " ");
        if (surfaceDirection1 == 1) {
            System.out.println("from walls");
        } else {
            System.out.println("from furniture");
        }
    }

    public String getTypeCleaning() {
        return typeCleaning;
    }

    public void setTypeCleaning(String typeCleaning) {
        this.typeCleaning = typeCleaning;
    }

    public Integer getSurfaceDirection() {
        return surfaceDirection;
    }

    public void setSurfaceDirection(Integer surfaceDirection) {
        this.surfaceDirection = surfaceDirection;
    }

    public BigDecimal getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(BigDecimal squareMeters) {
        this.squareMeters = squareMeters;
    }

    public LocalDateTime getDateTimeCleaning() {
        return dateTimeCleaning;
    }

    public void setDateTimeCleaning(LocalDateTime dateTimeCleaning) {
        this.dateTimeCleaning = dateTimeCleaning;
    }

    public BigDecimal wash(String placeOfCleaning, Boolean surfaceDirection, BigDecimal squareMeters) {
        return squareMeters;
    }

    public BigDecimal sweep(String placeOfCleaning, BigDecimal squareMeters) {
        return squareMeters;
    }

    public String getTypeService() {
        return this.name;
    }
}
