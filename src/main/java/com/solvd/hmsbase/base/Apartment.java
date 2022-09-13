package com.solvd.hmsbase.base;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "apartment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Apartment {

    @XmlElement
    private Integer room;
    @XmlElement
    private Double square;
    @XmlElement(name = "address")
    private Address address;

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "room=" + room +
                ", square=" + square +
                ", address=" + address +
                '}';
    }
}
