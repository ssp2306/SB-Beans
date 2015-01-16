package com.google.android.gms.example.sb_beans;

import java.io.Serializable;

/**
 * Created by parkers on 1/13/15.
 */
public class CarsBean implements Serializable {

    String make;
    String model;
    String color;
    int year;

    // constructor no args
    public CarsBean() {
    }

    // getter for the make of the car
    public String getMake() {
        return make;
    }

    // setter for the make
    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
            this.color = color;
        }

    public int getYear()
    {
        return year;
    }
    public void setYear (int year)
    {
        this.year = year;
    }

}

