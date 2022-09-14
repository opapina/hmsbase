package com.solvd.hmsbase.base;

import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "child")
@XmlAccessorType(XmlAccessType.FIELD)
public class Child extends Human {

    @XmlElement
    private Integer infantAge;

    public Integer getInfantAge() {
        return infantAge;
    }

    public void setInfantAge(Integer infantAge) {
        this.infantAge = infantAge;
    }

    @Override
    public String toString() {
        return "Child{" +
                "infantAge=" + infantAge +
                "} " + super.toString();
    }
}
