package com.solvd.hmsbase.base;

import java.time.LocalDate;

public class Child extends Human {

    private Integer infantAge;

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
