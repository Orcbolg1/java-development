package com.pluralsight;

public class car {

    private String color;
    private int year;
    private String make;
    private String model;
    private double odometer;


    public car(String color, int year, String make, String model, double odometer) {
        this.color = color;
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
    }

    public String getColor(){
        return this.color;
    }

    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }
}
