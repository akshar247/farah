package com.farah.model;

import java.io.Serializable;

public class LocationModel implements Serializable {


    private String location;

    public LocationModel() {
    }

    public LocationModel(String status) {

        this.location = status;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "LocationModel{" +

                " location='" + location + '\'' +
                '}';
    }
}