package com.tudor.demo_app1.service;

import com.tudor.demo_app1.model.ChargingStation;
import com.tudor.demo_app1.repository.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StationService {
    @Autowired
    private StationRepository stationRepository;

    public List<ChargingStation> getAllStations() {
        return stationRepository.findAll();
    }
}
