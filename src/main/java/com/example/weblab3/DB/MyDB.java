package com.example.weblab3.DB;

import com.example.weblab3.bean.Hit;
import jakarta.annotation.ManagedBean;

import java.io.Serializable;

@ManagedBean
public class MyDB extends AbstractDB<Hit> implements Serializable {
    protected MyDB(){
        super(Hit.class);
    }
}
