package com.solvd.hmsbase.service;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.solvd.hmsbase.base.BigDecimalAdapter;
import com.solvd.hmsbase.base.CustomDateDeserializer;
import com.solvd.hmsbase.base.DateTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@XmlRootElement(name = "cleaning")
@XmlAccessorType(XmlAccessType.FIELD)
public class Cleaning extends Service {

    @XmlElement(name = "typeCleaning")
//    @JsonProperty("type")
    @JsonIgnore
    private String typeCleaning;
    @XmlElement(name = "squareMeters")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal squareMeters;

    @XmlElement(name = "dateTimeCleaning")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private LocalDateTime dateTimeCleaning;

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
