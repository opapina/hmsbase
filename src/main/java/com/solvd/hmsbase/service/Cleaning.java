package com.solvd.hmsbase.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cleaning extends Service {

    private String typeCleaning;
    private BigDecimal squareMeters;
    private LocalDateTime dateTimeCleaning;

    public Cleaning(String name, String place, String typeCleaning, BigDecimal squareMeters, LocalDateTime dateTimeCleaning) {
        super(name, place);
        this.squareMeters = squareMeters;
        this.dateTimeCleaning = dateTimeCleaning;
        this.typeCleaning = typeCleaning;
    }

    public String getTypeCleaning() {
        return typeCleaning;
    }

    public void setTypeCleaning(String typeCleaning) {
        this.typeCleaning = typeCleaning;
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
}
