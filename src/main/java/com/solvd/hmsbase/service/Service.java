package com.solvd.hmsbase.service;

public class Service {

    public String type;
    public String place;

    public Service(String type, String place) {
        this.type = type;
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
