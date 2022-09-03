package com.solvd.hmsbase.organization;

import com.solvd.hmsbase.base.Address;

public class Organization {

    private String name;
    private Integer number;
    private Address address;

    public Organization(String name, Integer number, Address address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
