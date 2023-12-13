package com.example.weblab3.bean;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "clockBean")
public class ClockBean implements Serializable {

    private static final long serialVersionUID = 1L;

    public String getCurrentDate() {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        return dateFormat.format(now);
    }

    public String getCurrentTime() {
        Date now = new Date();
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        return timeFormat.format(now);
    }
}
