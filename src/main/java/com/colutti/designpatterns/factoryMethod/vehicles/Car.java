package com.colutti.designpatterns.factoryMethod.vehicles;

public class Car implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("starting route");
    }

    @Override
    public void getCargo() {
        System.out.println("we take the passengers, we are ready!");
    }
}
