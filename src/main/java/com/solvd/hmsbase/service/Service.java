package com.solvd.hmsbase.service;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "service")
@XmlAccessorType(XmlAccessType.FIELD)
public class Service {


    @XmlAttribute(name = "name")
    public String name;

    @XmlAttribute(name = "place")
    public String place;

    public Service() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
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
