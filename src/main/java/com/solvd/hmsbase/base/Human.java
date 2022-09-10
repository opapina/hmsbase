package com.solvd.hmsbase.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlType(propOrder = {"firstName", "lastName", "dob"})
public class Human {
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDate dob;

    public Human(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Human() {

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
