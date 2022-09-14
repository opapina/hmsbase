package com.solvd.hmsbase.service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.solvd.hmsbase.base.BigDecimalAdapter;
import com.solvd.hmsbase.base.DateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDate;

@XmlRootElement(name = "garbageRemoval")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class GarbageRemoval extends Service {

    @XmlElement
    private String garbageType;
    @XmlElement
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal quantity;

    @XmlElement
    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDate dateRemoval;

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

    @Override
    public String toString() {
        return "GarbageRemoval{" +
                "garbageType='" + garbageType + '\'' +
                ", quantity=" + quantity +
                ", dateRemoval=" + dateRemoval +
                "} " + super.toString();
    }
}
