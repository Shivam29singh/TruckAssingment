package com.dc.trucksystem.dao;

import com.dc.trucksystem.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TruckDao  extends JpaRepository<Truck, Integer> {
    public Truck findByTruckId(Integer Id);
      Truck findBytruckNumber(String truckNumber);
}
