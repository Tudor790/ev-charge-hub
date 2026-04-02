package com.tudor.demo_app1.service;

import com.tudor.demo_app1.model.ChargingStation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StationService {

    public List<ChargingStation> getAllStations() {
        ChargingStation station1 = new ChargingStation(1L,
                "Tesla A", "Address A", "City A", 4, 0.20, 40.7128, -74.0060);
        ChargingStation station2 = new ChargingStation(2L,
                "Tesla B", "Address B", "City B", 6, 0.25, 34.0522, -118.2437);
        ChargingStation station3 = new ChargingStation(3L,
                "Tesla C", "Address C", "City C", 8, 0.30, 33.7489, -84.3879);

        return List.of(station1, station2, station3);

    }
}
