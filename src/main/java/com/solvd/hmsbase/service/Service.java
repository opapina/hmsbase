package com.solvd.hmsbase.service;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Cleaning.class, GarbageRemoval.class})
public class Service {

   @XmlAttribute
    public String name;

   @XmlAttribute
    public String place;

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
