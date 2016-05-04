package com.example.pankaj.chatapp.Models.Case;

import java.io.Serializable;

/**
 * Created by pankaj on 20/04/16.
 */
public class ApiSuccess implements Serializable{

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
