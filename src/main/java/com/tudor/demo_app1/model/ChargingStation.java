package com.tudor.demo_app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class ChargingStation {
    @Id
    @GeneratedValue
    private Long id;
    private String nameCompany;
    private String address;
    private String city;
    private Integer avPlugs;
    private double priceKwh;
    private double latitude;
    private double longitude;
}


