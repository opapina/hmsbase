package com.solvd.hmsbase.client;

import com.solvd.hmsbase.base.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.LocalDate;
import java.util.List;

public class Client<A, V> extends Human {

    private static final Logger LOGGER = LogManager.getLogger(Client.class);

    private List<A> apartments;
    private List<V> vehicles;
    private List<Child> children;

    public Client(String firstName, String lastName, LocalDate dob, List<Apartment> apartments) {
        super(firstName, lastName, dob);
    }

    public List<A> getApartment() {
        return apartments;
    }

    public void setApartment(List<A> apartment) {
        this.apartments = apartment;
    }

    public List<V> getVehicle() {
        return vehicles;
    }

    public void setVehicle(List<V> vehicle) {
        this.vehicles = vehicle;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }
}
