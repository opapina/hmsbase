package com.solvd.hmsbase.service;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "service")
@XmlAccessorType(XmlAccessType.FIELD)
public class Service {

    @XmlElement
    @XmlAttribute
    public String name;
    @XmlElement
    @XmlAttribute
    public String place;

    public Service() {
    }

    public Service(String name, String place) {
        this.name = name;
        this.place = place;
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
}
