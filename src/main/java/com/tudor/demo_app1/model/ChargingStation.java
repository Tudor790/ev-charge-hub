package com.tudor.demo_app1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class ChargingStation {
    private Long id;
    private String nameCompany;
    private String address;
    private String city;
    private Integer avPlugs;
    private double priceKwh;
    private double latitude;
    private double longitude;
}


