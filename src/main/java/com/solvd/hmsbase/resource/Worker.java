package com.solvd.hmsbase.resource;

import com.solvd.hmsbase.base.*;
import com.solvd.hmsbase.vehicle.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Worker extends Human {

    private static final Logger LOGGER = LogManager.getLogger(Worker.class);

    private String profession;
    private Integer experience;
    private BigDecimal salaryPerMonth;
    private Address address;
    private Vehicle[] vehicles;
    private Child[] children;

    public Worker(String firstName, String lastName, LocalDate dob, String profession, Integer experience) {
        super(firstName, lastName, dob);
        this.profession = profession;
        this.experience = experience;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public BigDecimal getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(BigDecimal salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Vehicle[] getVehicle() {
        return vehicles;
    }

    public void setVehicle(Vehicle[] vehicle) {
        this.vehicles = vehicle;
    }

    public Child[] getChildren() {
        return children;
    }

    public void setChildren(Child[] children) {
        this.children = children;
    }
}
