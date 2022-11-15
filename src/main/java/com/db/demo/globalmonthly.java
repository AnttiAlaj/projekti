package com.db.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class globalmonthly {
    @Id
    private String time;
    private double anomaly;

    public globalmonthly() {
    }

    public globalmonthly(String time, double anomaly) {
        this.time = time;
        this.anomaly = anomaly;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getAnomaly() {
        return this.anomaly;
    }

    public void setAnomaly(double anomaly) {
        this.anomaly = anomaly;
    }

}
