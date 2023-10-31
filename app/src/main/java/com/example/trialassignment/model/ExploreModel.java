package com.example.trialassignment.model;

import java.io.Serializable;

public class ExploreModel   implements Serializable {

    private final String name;   // name of the employee
    private final String place;  // email of the employee
    private  String distance;  // distance of the employee
    private final int progress;  // progress of the employee
    private  String purpose;  // purpose of the employee
    private final String status;  // purpose of the employee

    public ExploreModel(String name, String place,String distance,int progress, String purpose,String status) {
        this.name = name;
        this.place = place;
        this.distance=distance;
        this.progress=progress;
        this.purpose= purpose;
        this.status=status;


    }
    public ExploreModel(String name, String place,int progress, String purpose,String status) {
        this.name = name;
        this.place = place;
        this.progress=progress;
        this.purpose= purpose;
        this.status=status;


    }
    public ExploreModel(String name, String place,int progress,String status) {
        this.name = name;
        this.place = place;
        this.progress=progress;
        this.status=status;


    }
    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getDistance() {
        return distance;
    }

    public int getProgress() {
        return progress;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getStatus() {
        return status;
    }
}
