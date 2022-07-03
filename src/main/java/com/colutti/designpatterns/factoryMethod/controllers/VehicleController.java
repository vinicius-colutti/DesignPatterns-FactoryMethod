package com.colutti.designpatterns.factoryMethod.controllers;

import com.colutti.designpatterns.factoryMethod.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public String startRoute(@RequestParam(name = "type") String type){
        vehicleService.startTransport(type);
        return "It's ok! :D";
    }

}
