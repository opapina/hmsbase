package com.solvd.hmsbase.client;

import com.solvd.hmsbase.base.*;
import com.solvd.hmsbase.vehicle.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client<A, V> extends Human {

    private static final Logger LOGGER = LogManager.getLogger(Client.class);

    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "apartment", type = Apartment.class))
    private List<A> apartments;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "vehicle", type = Vehicle.class))
    private List<V> vehicles;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "child", type = Child.class))
    private List<Child> children;

    public Client() {
    }
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
