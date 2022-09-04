package com.solvd.hmsbase.resource;

import java.math.BigDecimal;

public class Equipment {

    private String name;
    private String typeService;
    private BigDecimal price;

    public Equipment(String name, String typeService, BigDecimal price) {
        this.name = name;
        this.typeService = typeService;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
