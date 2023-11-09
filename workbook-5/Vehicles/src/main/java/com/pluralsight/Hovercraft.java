package com.pluralsight;

public class Hovercraft extends Vehicle{

    public int airCushionPressure;

    public Hovercraft(String model, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, int airCushionPressure) {
        super(model, color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        this.airCushionPressure = airCushionPressure;
    }
    public Hovercraft(){

    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover(){
        System.out.println("Hovercraft is hovering!");
    }

    @Override
    public String toString() {
        return "Hovercraft{" +
                "airCushionPressure=" + airCushionPressure +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
