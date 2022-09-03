package com.solvd.hmsbase.order;

import com.solvd.hmsbase.base.Address;
import com.solvd.hmsbase.resources.Equipment;
import com.solvd.hmsbase.resources.Worker;
import com.solvd.hmsbase.service.Service;

import java.util.List;

public class Order<E extends Equipment> {

    private Integer id;
    private String serviceName;
    private Address address;
    private Service service;
    private Worker worker;

    private List<E> equipments;

    public Order(Integer id, String serviceName, Address address) {
        this.id = id;
        this.serviceName = serviceName;
        this.address = address;
        List<E> equipments;
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

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public List<E> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<E> equipments) {
        this.equipments = equipments;
    }
}