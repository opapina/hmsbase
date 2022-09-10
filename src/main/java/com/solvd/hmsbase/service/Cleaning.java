package com.solvd.hmsbase.service;

import com.solvd.hmsbase.base.DateAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@XmlRootElement(name = "cleaning")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cleaning extends Service {

    @XmlElement
    private String typeCleaning;
    @XmlElement
    private BigDecimal squareMeters;

    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDateTime dateTimeCleaning;

    public Cleaning () {
    }

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
