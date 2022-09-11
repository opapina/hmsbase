package com.solvd.hmsbase.organization;

import com.solvd.hmsbase.base.Address;
import com.solvd.hmsbase.client.Client;
import com.solvd.hmsbase.order.Order;
import com.solvd.hmsbase.vehicle.Car;
import com.solvd.hmsbase.resource.Worker;
import com.solvd.hmsbase.service.Service;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "hms")
@XmlAccessorType(XmlAccessType.FIELD)
public class HMS {

    @XmlElement
    private String name;

    @XmlElement
    private Integer number;

    @XmlElement(name = "address")
    private Address address;

    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "service", type = Service.class))
    private List<Service> services;

    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "order", type = Order.class))
    private List<Order> orders;

    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "address", type = Address.class))
    private List<Address> addresses;

    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "worker", type = Worker.class))
    private List<Worker> workers;

    @XmlElementWrapper
    @XmlElements(@XmlElement(name = "client", type = Client.class))
    private List<Client<Address, Car>> clients;

    public HMS() {
    }

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

    public List<Client<Address, Car>> getClient() {
        return clients;
    }

    public void setClient(List<Client<Address, Car>> clients) {
        this.clients = clients;
    }
}
