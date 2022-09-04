package com.solvd.hmsbase.organization;

import com.solvd.hmsbase.base.Address;
import com.solvd.hmsbase.client.Client;
import com.solvd.hmsbase.order.Order;
import com.solvd.hmsbase.vehicle.Car;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.solvd.hmsbase.resource.Equipment;
import com.solvd.hmsbase.resource.Worker;
import com.solvd.hmsbase.service.Service;

import java.util.List;

public class HMS extends Organization {

    private static final Logger LOGGER = LogManager.getLogger(HMS.class);

    private final List<Service> services;
    private List<Order<?>> orders;
    private List<Address> addresses;
    private List<Worker> workers;
    private List<Equipment> equipments;
    private List<Client<Address, Car>> clients;

    public HMS(String name, Integer number, Address address, List<Address> addresses, List<Service> services) {
        super(name, number, address);
        this.addresses = addresses;
        this.services = services;
    }
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public List<Worker> getWorker() {
        return workers;
    }

    public void setWorker(List<Worker> workers) {
        this.workers = workers;
    }

    public List<Equipment> getEquipment() {
        return equipments;
    }

    public void setEquipment(List<Equipment> equipments) {
        this.equipments = equipments;
    }

    public List<Order<?>> getOrder() {
        return orders;
    }

    public void setOrders(List<Order<?>> orders) {
        this.orders = orders;
    }

    public List<Client<Address, Car>> getClient() {
        return clients;
    }

    public void setClient(List<Client<Address, Car>> clients) {
        this.clients = clients;
    }

    public List<Service> getServices() {
        return services;
    }
}
