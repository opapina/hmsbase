package com.solvd.hmsbase.service;

import java.math.BigDecimal;
import java.time.LocalDate;

public class GarbageRemoval extends Service {

    public static int countRemoval;
    private String garbageType;
    private BigDecimal quantity;
    private LocalDate dateRemoval;

    public GarbageRemoval(String type, String place, String garbageType, BigDecimal quantity) {
        super(type, place);
        this.garbageType = garbageType;
        this.quantity = quantity;
        this.dateRemoval = LocalDate.now();
        countRemoval++;
    }

    public GarbageRemoval(String type, String place, String garbageType, BigDecimal quantity, LocalDate dateRemoval) {
        super(type, place);
        this.quantity = quantity;
        this.dateRemoval = dateRemoval;
        this.garbageType = garbageType;
        countRemoval++;
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

    public void sort(String garbageType) {
        if (garbageType == "Plastic") {
            setPlace("Plastic container");
        } else if (garbageType == "Glass") {
            setPlace("Glass container");
        } else if (garbageType == "Paper") {
            setPlace("Paper container");
        } else {
            setPlace("Common container");
        }
    }

    public void sort(String place, String garbageType) {
        if (garbageType == "Plastic") {
            setPlace("Plastic container");
            System.out.println("This is the Plastic container");
        } else if (garbageType == "Glass") {
            setPlace("Glass container");
            System.out.println("This is the Glass container");
        } else if (garbageType == "Paper") {
            setPlace("Paper container");
            System.out.println("This is the Paper container");
        } else {
            setPlace("Common container");
            System.out.println("This is the Common container");
        }
    }

    public String getTypeService() {
        return this.type;
    }
}
