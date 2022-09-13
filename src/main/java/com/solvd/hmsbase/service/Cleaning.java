package com.solvd.hmsbase.service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.solvd.hmsbase.base.BigDecimalAdapter;
import com.solvd.hmsbase.base.DateTimeAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@XmlRootElement(name = "cleaning")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class Cleaning extends Service {

    @XmlElement(name = "typeCleaning")
    private String typeCleaning;
    @XmlElement(name = "squareMeters")
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal squareMeters;

    @XmlElement(name = "dateTimeCleaning")
    @XmlJavaTypeAdapter(DateTimeAdapter.class)
    private LocalDateTime dateTimeCleaning;

    public Cleaning() {
    }

    public Cleaning(@JsonProperty(value = "name") String name, @JsonProperty(value = "place") String place) {
        super(name, place);
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
