package com.solvd.hmsbase.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GarbageRemoval extends Service {


    private String garbageType;
    private BigDecimal quantity;
    private LocalDate dateRemoval;

    public GarbageRemoval(String name, String place, String garbageType, BigDecimal quantity, LocalDate dateRemoval) {
        super(name, place);
        this.quantity = quantity;
        this.dateRemoval = dateRemoval;
        this.garbageType = garbageType;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDateRemoval() {
        return dateRemoval;
    }

    public void setDateRemoval(LocalDate dateRemoval) {
        this.dateRemoval = dateRemoval;
    }

    public String getGarbageType() {
        return garbageType;
    }

    public void setGarbageType(String garbageType) {
        this.garbageType = garbageType;
    }

    public String getTypeService() {
        return this.name;
    }
}
