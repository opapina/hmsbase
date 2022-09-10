package com.solvd.hmsbase.resource;

import com.solvd.hmsbase.base.*;
import com.solvd.hmsbase.vehicle.Vehicle;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "worker")
@XmlAccessorType(XmlAccessType.FIELD)
public class Worker extends Human {

    @XmlElement
    private String profession;
    @XmlElement
    private Integer experience;
    @XmlElement
    private BigDecimal salaryPerMonth;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "address", type = Address.class))
    private Address address;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "vehicle", type = Vehicle.class))
    private List<String> vehicles;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "child", type = Child.class))
    private List<Child> children;

    public Worker() {
    }

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

    public List<String> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<String> vehicles) {
        this.vehicles = vehicles;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
