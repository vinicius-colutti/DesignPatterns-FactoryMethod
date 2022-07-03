package com.colutti.designpatterns.factoryMethod.services;

public interface VehicleService {
    void startTransport(String type);
    void runTransport();
    void configure(String type);
}
