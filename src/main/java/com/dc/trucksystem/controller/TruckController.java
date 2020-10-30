package com.dc.trucksystem.controller;

import com.dc.trucksystem.model.Truck;
import com.dc.trucksystem.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/truck")
public class TruckController {

    @Autowired
    private TruckService truckService;

    @PostMapping("/add/truck")
    public ResponseEntity addtruck(@RequestBody Truck truck){
        boolean truck1  =    truckService.addTruck(truck);
        if (!truck1){

            return  new ResponseEntity<>( "THERE WAS A PROBLEAM", HttpStatus.BAD_REQUEST );
        }
        return  new ResponseEntity<>( "TRUCK ADDED SUCCESSFULLY ", HttpStatus.OK );

    }

//    @GetMapping("search/truck/{truckId}")
//    public ResponseEntity searchTruck(@PathVariable Integer truckId){
//
//        Truck truck =  truckService.searchTruck(truckId);
//        if (truckService.searchTruck(truckId) != null){
//
//            return  new ResponseEntity<>( "NOT FOUND", HttpStatus.NOT_FOUND );
//        }
//        return  ResponseEntity.status(HttpStatus.OK).body(truck);
//
//    }



    @PutMapping("/update/truck")
    public ResponseEntity updateTruck(@RequestBody Truck truck){
         Truck truck1 =    truckService.upadteTruck(truck);
         if (truck1 != null){

                 return    ResponseEntity.status(HttpStatus.OK).body(truck);
             }
             return  new ResponseEntity( "CAN NOT BE UPDATE", HttpStatus.BAD_REQUEST );

         }

         @DeleteMapping("/delete/truck/{truckId}")
    public ResponseEntity deleteTruck(@PathVariable Integer truckId){
         boolean truck =      truckService.deleteTruck(truckId);
         if (!truck){
             return  new ResponseEntity<>( "CAN NOT DELETE TRUCK", HttpStatus.BAD_REQUEST );
         }
             return  new ResponseEntity<>( " TRUCK DELETED SUCCESSFULLY", HttpStatus.OK );
         }

         @GetMapping("/search/truck/{truckNumber}")
    public ResponseEntity searchTruck(@PathVariable String  truckNumber){
          if (   truckService.searchByTruckNumber(truckNumber)!= null) {

              return  ResponseEntity.status(HttpStatus.OK).body( truckService.searchByTruckNumber(truckNumber));

          }
             return  new ResponseEntity<>( "NOT FOUND", HttpStatus.NOT_FOUND );

         }

}
