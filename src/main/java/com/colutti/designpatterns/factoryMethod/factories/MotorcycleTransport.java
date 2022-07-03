package com.colutti.designpatterns.factoryMethod.factories;

import com.colutti.designpatterns.factoryMethod.vehicles.IVehicle;
import com.colutti.designpatterns.factoryMethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
