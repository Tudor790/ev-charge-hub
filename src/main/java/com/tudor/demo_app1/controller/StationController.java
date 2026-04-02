package com.tudor.demo_app1.controller;

import com.tudor.demo_app1.model.ChargingStation;
import com.tudor.demo_app1.service.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stations")
public class StationController {

    @Autowired
    private StationService stationService;

    @GetMapping("/all")
    public List<ChargingStation> getAllStations() {
        return stationService.getAllStations();
    }
}