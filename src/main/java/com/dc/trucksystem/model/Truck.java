package com.dc.trucksystem.model;

import javax.persistence.*;

@Entity
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="truckId")
    private Integer truckId;

    @Column(name = "truckNumber")
    private String truckNumber;

    @Column(name = "truckName")
    private String truckName;

    @Column(name =  "truckType")
    private String truckType;



    public Truck() {
    }

    public Truck(Integer truckId, String truckNumber, String truckName, String truckType) {
        this.truckId = truckId;
        this.truckNumber = truckNumber;
        this.truckName = truckName;
        this.truckType = truckType;
    }

    public Integer getTruckId() {
        return truckId;
    }

    public void setTruckId(Integer truckId) {
        this.truckId = truckId;
    }

    public String getTruckNumber() {
        return truckNumber;
    }

    public void setTruckNumber(String truckNumber) {
        this.truckNumber = truckNumber;
    }

    public String getTruckName() {
        return truckName;
    }

    public void setTruckName(String truckName) {
        this.truckName = truckName;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }
}
