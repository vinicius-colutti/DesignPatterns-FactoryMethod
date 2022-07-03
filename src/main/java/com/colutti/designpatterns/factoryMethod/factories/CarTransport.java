package com.colutti.designpatterns.factoryMethod.factories;

import com.colutti.designpatterns.factoryMethod.vehicles.Car;
import com.colutti.designpatterns.factoryMethod.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
