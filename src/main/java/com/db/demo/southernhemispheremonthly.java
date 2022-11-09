package com.db.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class southernhemispheremonthly {

    @Id
    private String Time;
    private double anomaly;

    public southernhemispheremonthly() {
    }

    public southernhemispheremonthly(String Time, double anomaly){
        this.Time = Time;
        this.anomaly = anomaly;
    }

    public String getTime(){
        return this.Time;
    }

    public void setTime(String Time){
        this.Time = Time;
    }
    
    public double getAnomaly(){
        return this.anomaly;
    }

    public void setAnomaly(double anomaly){
        this.anomaly = anomaly;
    }
}
