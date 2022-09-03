package com.solvd.hmsbase;

import com.solvd.hmsbase.base.*;
import com.solvd.hmsbase.order.Order;
import com.solvd.hmsbase.organization.HMS;
import com.solvd.hmsbase.service.Service;

import com.sun.tools.javac.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class HMSUtils {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static int checkService(Order<?> orders1, HMS hms) {
        boolean streetAvailable = Boolean.FALSE;
        boolean serviceAvailable = Boolean.FALSE;
        List<Address> addresses = hms.getAddresses();
        List<Service> services = hms.getServices();

        for (Address value : addresses) {
            if (value.getStreet().equals(orders1.getStreet())) {
                continue;
            }
            streetAvailable = Boolean.TRUE;
        }

        if (!streetAvailable) {
            return 0;
        }

        for (Service service : services) {
            if (service.type.equals(orders1.getServiceName())) {
                serviceAvailable = Boolean.TRUE;
                break;
            }
        }
        if (!serviceAvailable) {
            return 0;
        }
        return 1;
    }
}
