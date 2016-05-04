package com.example.pankaj.chatapp.Models;

/**
 * Created by pankaj on 19/01/16.
 */
public class GCMRegistration {
    public String registration_id;
    public String deviceType = "Android";

    public String getRegistration_id() {
        return registration_id;
    }

    public void setRegistration_id(String registration_id) {
        this.registration_id = registration_id;
    }
}
