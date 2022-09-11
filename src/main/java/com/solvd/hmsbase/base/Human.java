package com.solvd.hmsbase.base;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlType
public class Human {
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;

    @XmlElement
    @XmlJavaTypeAdapter(DateAdapter.class)
    private LocalDate dob;

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

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                '}';
    }
}
