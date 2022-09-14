package com.solvd.hmsbase.service;;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Service {

    @XmlAttribute
    public String name;

    @XmlAttribute
    public String place;

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
