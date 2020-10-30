package com.dc.trucksystem.service;

import com.dc.trucksystem.model.Truck;
import org.springframework.stereotype.Service;


public interface TruckService {

    boolean addTruck(Truck truck);

    Truck searchTruck(Integer truckId);

    Truck searchByTruckNumber(String truckNumber);

    Truck upadteTruck(Truck truck);

    boolean deleteTruck(Integer truckId);
}
