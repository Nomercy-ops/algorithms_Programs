package com.bridgelabz.Algorithm.Models;

/**
 * This is the user details model for regex program. it is used for getting and
 * setting user details like name phone number etc.
 *
 */
public class UserDetails {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String date;

    // no arguments constructor.
    public UserDetails() {

    }

    // getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String phoneNumber() {
        return phoneNumber;
    }

    public String date() {
        return date;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
   
}



    
    

