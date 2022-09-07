package com.solvd.hmsbase.order;

import com.solvd.hmsbase.base.Address;
import com.solvd.hmsbase.resource.Worker;

public class Order {

    private Integer id;
    private String serviceName;
    private Address address;
    private Worker worker;

    public Order(Integer id, String serviceName, Address address) {
        this.id = id;
        this.serviceName = serviceName;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getStreet() {
        return address.getStreet();
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }
}
