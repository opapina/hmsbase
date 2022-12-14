package com.solvd.hmsbase.organization;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.solvd.hmsbase.base.Address;
import com.solvd.hmsbase.base.Apartment;
import com.solvd.hmsbase.client.Client;
import com.solvd.hmsbase.order.Order;
import com.solvd.hmsbase.service.Cleaning;
import com.solvd.hmsbase.service.GarbageRemoval;
import com.solvd.hmsbase.vehicle.Bicycle;
import com.solvd.hmsbase.vehicle.Car;
import com.solvd.hmsbase.resource.Worker;
import com.solvd.hmsbase.service.Service;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "hms")
@XmlAccessorType(XmlAccessType.FIELD)
public class HMS {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "number")
    private Integer number;

    @XmlElement(name = "address")
    private Address address;

    @XmlElementWrapper
    @XmlElements({
            @XmlElement(name = "cleaning", type = Cleaning.class),
            @XmlElement(name = "garbage-removal", type = GarbageRemoval.class)})

    @JsonProperty("services")
    private List<Service> services;

    @XmlElementWrapper(name = "orders")
    @XmlElements(@XmlElement(name = "order", type = Order.class))
    private List<Order> orders;

    @XmlElementWrapper(name = "address")
    @XmlElements(@XmlElement(name = "address", type = Address.class))
    private List<Address> addresses;

    @XmlElementWrapper(name = "workers")
    @XmlElements(@XmlElement(name = "worker", type = Worker.class))
    @JsonProperty("workers")
    private List<Worker> workers;

    @XmlElementWrapper(name = "clients")
    @XmlElements(@XmlElement(name = "client", type = Client.class))
    @JsonProperty("clients")
    private List<Client> clients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services; }

    public List<Worker> getWorker() {
        return workers;
    }

    public void setWorker(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Order> getOrder() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Client> getClient() {
        return clients;
    }

    public void setClient(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "HMS{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", address=" + address +
                ", services=" + services +
                ", orders=" + orders +
                ", addresses=" + addresses +
                ", workers=" + workers +
                ", clients=" + clients +
                '}';
    }
}
