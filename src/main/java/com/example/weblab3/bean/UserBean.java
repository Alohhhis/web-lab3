package com.example.weblab3.bean;

import jakarta.annotation.ManagedBean;

import java.io.Serializable;

@ManagedBean
public class UserBean implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String username) {
        this.name = username;
    }

    @Override
    public String toString(){
        return "User{"+
                "name = " + name + "}";
    }
}
