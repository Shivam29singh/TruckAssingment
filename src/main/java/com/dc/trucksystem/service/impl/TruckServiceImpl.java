package com.dc.trucksystem.service.impl;

import com.dc.trucksystem.dao.TruckDao;
import com.dc.trucksystem.model.Truck;
import com.dc.trucksystem.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TruckServiceImpl implements TruckService {
    @Autowired
    private TruckDao truckDao;

    @Override
    public boolean addTruck(Truck truck) {

        Truck truck1 =  truckDao.save(truck);
        if (truck != null){
            return true;
        }
        return false;
    }

    @Override
    public Truck searchTruck(Integer truckId) {
        if (truckDao.findById(truckId) != null){
            Truck truck =  truckDao.findByTruckId(truckId);
            return  truck;
        }

        return null;
    }

    @Override
    public Truck searchByTruckNumber(String truckNumber) {
           if (  truckDao.findBytruckNumber(truckNumber) != null){

               return truckDao.findBytruckNumber(truckNumber);

           }

        return null;
    }

    @Override
    public Truck upadteTruck(Truck truck) {
        Truck truck1 =  truckDao.findByTruckId(truck.getTruckId());
        if (truck1 != null){
          return truckDao.save(truck);
        }

        return null;
    }

    @Override
    public boolean deleteTruck(Integer truckId) {
        if (this.searchTruck(truckId) != null){
            Truck truck = this.searchTruck(truckId);
            truckDao.delete(truck);
            return true;
        }

        return false;
    }


}
