package com.solvd.hmsbase.base;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "address")
@XmlAccessorType(XmlAccessType.FIELD)
public class Address {

    @XmlElement
    private String street;
    @XmlElement
    private Integer house;
    @XmlElement
    private Integer flat;

    public Address(String street) {
        this.street = street;
    }

    public Address () {
    }

    public Address(String street, Integer house, Integer flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getHouse() {
        return house;
    }

    public void setHouse(Integer house) {
        this.house = house;
    }

    public Integer getFlat() {
        return flat;
    }

    public void setFlat(Integer flat) {
        this.flat = flat;
    }
}
