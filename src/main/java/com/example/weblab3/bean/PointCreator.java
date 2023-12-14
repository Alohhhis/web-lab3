package com.example.weblab3.bean;

public class PointCreator {
    public Hit createHit(Double x, Double y, Double r){
        Hit hit = new Hit();
        hit.setX(x);
        hit.setY(y);
        hit.setR(r);
        return hit;
    }
}
