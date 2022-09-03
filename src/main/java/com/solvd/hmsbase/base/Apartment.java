package com.solvd.hmsbase.base;

public class Apartment {

    private Integer room;
    private Double square;
    private Address address;

    public Apartment(Integer room, double square, Address address) {
        this.room = room;
        this.square = square;
        this.address = address;
    }

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

}
