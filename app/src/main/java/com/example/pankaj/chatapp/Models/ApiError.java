package com.example.pankaj.chatapp.Models;

/**
 * Created by pankaj on 20/01/16.
 */
public class ApiError {

    private int status_code;
    private String message;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {

        if(this.message == null){
            if(this.error != null){
                this.message =this.error;
            }else{
                this.message = "";
            }
        }

        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}