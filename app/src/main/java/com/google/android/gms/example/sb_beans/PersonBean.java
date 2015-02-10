package com.google.android.gms.example.sb_beans;

import java.io.Serializable;

/**
 * Created by parkers on 1/13/15.
 */
public class PersonBean implements Serializable {
    String firstName;
    String lastName;
    int age;

    public PersonBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() { return firstName + " " +  lastName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
