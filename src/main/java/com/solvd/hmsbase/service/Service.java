package com.solvd.hmsbase.service;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlSeeAlso({Cleaning.class, GarbageRemoval.class})
@JsonAutoDetect(creatorVisibility = JsonAutoDetect.Visibility.PROTECTED_AND_PUBLIC)
public class Service {

    @XmlAttribute
    public String name;

    @XmlAttribute
    public String place;

    public Service(@JsonProperty(value = "name") String name, @JsonProperty(value = "place") String place) {
        this.name = name;
        this.place = place;
    }

    public Service() {

    }

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
