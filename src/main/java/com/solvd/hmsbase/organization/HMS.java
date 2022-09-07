package com.solvd.hmsbase.organization;

import com.solvd.hmsbase.base.Address;
import com.solvd.hmsbase.client.Client;
import com.solvd.hmsbase.order.Order;
import com.solvd.hmsbase.vehicle.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.hmsbase.resource.Worker;
import com.solvd.hmsbase.service.Service;

import java.util.List;

public class HMS {

    private static final Logger LOGGER = LogManager.getLogger(HMS.class);

    private String name;
    private Integer number;
    private Address address;
    private List<Service> services;
    private List<Order> orders;
    private List<Address> addresses;
    private List<Worker> workers;
    private List<Client<Address, Car>> clients;

    public HMS(String name, Integer number, Address address, List<Address> addresses, List<Service> services) {
        this.name = name;
        this.number = number;
        this.address = address;
        this.addresses = addresses;
        this.services = services;
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
