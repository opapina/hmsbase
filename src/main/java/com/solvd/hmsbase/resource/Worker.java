package com.solvd.hmsbase.resource;

import com.solvd.hmsbase.base.*;
import com.solvd.hmsbase.vehicle.Bicycle;
import com.solvd.hmsbase.vehicle.Car;
import com.solvd.hmsbase.vehicle.Vehicle;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.math.BigDecimal;
import java.util.List;

@XmlRootElement(name = "worker")
@XmlAccessorType(XmlAccessType.FIELD)
public class Worker extends Human {

    @XmlElement
    private String profession;
    @XmlElement
    private Integer experience;
    @XmlElement
    @XmlJavaTypeAdapter(BigDecimalAdapter.class)
    private BigDecimal salaryPerMonth;

    @XmlElement
    private Address address;
    @XmlElementWrapper
    @XmlElements({@XmlElement(name = "car", type = Car.class),
            @XmlElement(name = "bicycle", type = Bicycle.class)})
    private List<String> vehicles;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "child", type = Child.class))
    private List<Child> children;

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

    @Override
    public String toString() {
        return "Worker{" +
                "profession='" + profession + '\'' +
                ", experience=" + experience +
                ", salaryPerMonth=" + salaryPerMonth +
                ", address=" + address +
                ", vehicles=" + vehicles +
                ", children=" + children +
                "} " + super.toString();
    }
}
