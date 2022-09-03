package com.solvd.hmsbase.base;

public class Address {

    private String street;
    private Integer house;
    private Integer apartment;

    public Address(String street) {
        this.street = street;
    }

    public Address(String street, Integer house, Integer apartment) {
        this.street = street;
        this.house = house;
        this.apartment = apartment;
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

    public Integer getApartment() {
        return apartment;
    }

    public void setApartment(Integer apartment) {
        this.apartment = apartment;
    }

}
