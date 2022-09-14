package com.solvd.hmsbase.client;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.solvd.hmsbase.base.*;
import com.solvd.hmsbase.vehicle.Bicycle;
import com.solvd.hmsbase.vehicle.Car;
import com.solvd.hmsbase.vehicle.Vehicle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "client")
@XmlAccessorType(XmlAccessType.FIELD)
public class Client extends Human {

    private static final Logger LOGGER = LogManager.getLogger(Client.class);

    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "apartment", type = Apartment.class))
    @JsonProperty("apartments")
    private List<Apartment> apartments;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "vehicle", type = Vehicle.class))
    @JsonProperty("vehicles")
    private List<Vehicle> vehicles;
    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "child", type = Child.class))
    private List<Child> children;



    public List<Apartment> getApartment() {
        return apartments;
    }

    public void setApartment(List<Apartment> apartment) {
        this.apartments = apartment;
    }

    public List<Vehicle> getVehicle() {
        return vehicles;
    }

    public void setVehicle(List<Vehicle> vehicle) {
        this.vehicles = vehicle;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Client{" +
                "apartments=" + apartments +
                ", vehicles=" + vehicles +
                ", children=" + children +
                "} " + super.toString();
    }
}
