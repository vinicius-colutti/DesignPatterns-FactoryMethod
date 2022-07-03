package com.colutti.designpatterns.factoryMethod.services.impl;

import com.colutti.designpatterns.factoryMethod.factories.CarTransport;
import com.colutti.designpatterns.factoryMethod.factories.MotorcycleTransport;
import com.colutti.designpatterns.factoryMethod.factories.Transport;
import com.colutti.designpatterns.factoryMethod.services.VehicleService;
import org.springframework.stereotype.Service;
import java.util.HashMap;

@Service
public class VehicleServiceImpl implements VehicleService {

    private static Transport transport;

    @Override
    public void startTransport(String type) {
        configure(type);
        if (transport != null) {
            runTransport();
        }
    }

    @Override
    public void runTransport() {
        transport.startTransport();
    }

    @Override
    public void configure(String type) {
        HashMap<String,Transport> mapTransports=new HashMap<>();
        mapTransports.put("uber", new CarTransport());
        mapTransports.put("log", new MotorcycleTransport());
        transport = mapTransports.get(type);
    }

}
