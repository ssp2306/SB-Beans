package com.google.android.gms.example.sb_beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by parkers on 1/30/15.
 */
public class GarageBean implements Serializable{

    //create a carBean inside this garage
        String garageLocation;
        int garageBay;
        ArrayList<CarsBean> allMyCars = new ArrayList<CarsBean>();

        // constructor no args
        public GarageBean() {
        }

        // getter for the Garage Location of the car
        public String getGarageLocation() {
            return garageLocation;
        }

        // setter for the Location
        public void setGarageLocation (String garageLocation)
        {
            this.garageLocation = garageLocation;
        }

    public int getGarageBay() {
        return garageBay;
    }

    public void setGarageBay(int garageBay) {
        this.garageBay = garageBay;
    }

    public ArrayList<CarsBean> getAllMyCars() {
        return allMyCars;
    }

    public void setAllMyCars(CarsBean allMyCars) {
        this.allMyCars.add(allMyCars);
    }
}
