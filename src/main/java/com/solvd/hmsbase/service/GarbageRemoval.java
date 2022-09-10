package com.solvd.hmsbase.service;

import com.solvd.hmsbase.base.DateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;

@XmlRootElement(name = "garbageRemoval")
@XmlAccessorType(XmlAccessType.FIELD)
public class GarbageRemoval extends Service {

    @XmlElement
    private String garbageType;
    @XmlElement
    private BigDecimal quantity;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDate dateRemoval;

    public GarbageRemoval () {
    }

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
