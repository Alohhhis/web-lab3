package com.example.weblab3.bean;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@ManagedBean
@Named("point")
@SessionScoped
public class PointBean implements Serializable {
    private Double x;
    private Double y;
    private Double r = 1.0;
    private String offset;

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "PointBean{" +
                "x = " + x +
                ", y = " + y +
                ", r = " + r + "}"
                ;
    }
}
