package com.colutti.designpatterns.factoryMethod.factories;

import com.colutti.designpatterns.factoryMethod.vehicles.IVehicle;

public abstract class Transport {

    public void startTransport(){
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();

}
