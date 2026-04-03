package com.tudor.demo_app1.repository;

import com.tudor.demo_app1.model.ChargingStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<ChargingStation, Long> {
}
