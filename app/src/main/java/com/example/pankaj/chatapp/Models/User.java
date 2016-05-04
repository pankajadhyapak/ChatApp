package com.example.pankaj.chatapp.Models;

import java.io.Serializable;

/**
 * Created by pankaj on 19/01/16.
 */
public class User implements Serializable{

    private Integer id;

    private String email;
    private String name;
    private String password;
    private String phone;
    private Boolean isSelected;

    public Boolean getSelected() {
        return isSelected;
    }

    public void setSelected(Boolean selected) {
        isSelected = selected;
    }

    private Boolean isFriend;

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsFriend() {
        return isFriend;
    }

    public Integer getId() {
        return id;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
