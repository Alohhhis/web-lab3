package com.example.weblab3.bean;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@ManagedBean
@Named("point")
@SessionScoped
public class PointBean implements Serializable {
    @NotNull(message = "X cannot be null")
    @DecimalMin(value = "-3", message = "X должен быть в пределах от -3 до 3")
    @DecimalMax(value = "3", message = "X должен быть в пределах от -3 до 3")
    private Double x;

    @NotNull(message = "Y cannot be null")
    @DecimalMin(value = "-5", message = "Y должен быть в пределах от -5 до 3")
    @DecimalMax(value = "3", message = "Y должен быть в пределах от -5 до 3")
    private Double y;

    @NotNull(message = "R cannot be null")
    @DecimalMin(value = "0.1", message = "R должен быть в пределах от 0.1 до 3")
    @DecimalMax(value = "3", message = "R должен быть в пределах от 0.1 до 3")
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
