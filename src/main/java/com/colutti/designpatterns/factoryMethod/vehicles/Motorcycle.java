package com.colutti.designpatterns.factoryMethod.vehicles;

public class Motorcycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("starting delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("we take the order, we are ready!");
    }
}
