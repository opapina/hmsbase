package com.solvd.hmsbase.base;

import javax.xml.bind.annotation.*;
import java.time.LocalDate;

@XmlRootElement(name = "child")
@XmlAccessorType(XmlAccessType.FIELD)
public class Child extends Human {

    @XmlElement
    private Integer infantAge;

    public Child() {
    }

    public Child(String firstName, String lastName, LocalDate dob) {
        super(firstName, lastName, dob);
    }

    public Integer getInfantAge() {
        return infantAge;
    }

    public void setInfantAge(Integer infantAge) {
        this.infantAge = infantAge;
    }
}
