package com.solvd.hmsbase.service;

import com.solvd.hmsbase.base.BigDecimalAdapter;
import com.solvd.hmsbase.base.DateAdapter;
import com.solvd.hmsbase.base.DateTimeAdapter;

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
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal squareMeters;

    @XmlElement
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private LocalDateTime dateTimeCleaning;

    public Cleaning () {
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

    @Override
    public String toString() {
        return "Cleaning{" +
                "typeCleaning='" + typeCleaning + '\'' +
                ", squareMeters=" + squareMeters +
                ", dateTimeCleaning=" + dateTimeCleaning +
                "} " + super.toString();
    }
}
