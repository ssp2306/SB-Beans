package com.google.android.gms.example.sb_beans;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by parkers on 1/30/15.
 */
public class HouseBean implements Serializable{

    String houseName;
    String bedroom;
    // create a Familybean inside this house

    //create the array list of family members from the PersonBean
    ArrayList<PersonBean> family = new ArrayList<PersonBean>();

    public HouseBean (){

    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    public ArrayList<PersonBean> getFamily() { return family; }

    public void addFamilyMember(PersonBean family) {
        this.family.add(family);
    }
}
