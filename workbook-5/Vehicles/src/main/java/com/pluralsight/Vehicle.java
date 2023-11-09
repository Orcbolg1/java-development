package com.pluralsight;

public class Vehicle {
    public String model;
    public String color;
    public int numberOfPassengers;
    public int cargoCapacity;
    public int fuelCapacity;
    public int topSpeed;

    public Vehicle(String model, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed) {
        this.model = model;
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
        this.topSpeed = topSpeed;
    }

    public Vehicle() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void startEngine(){
        System.out.println("Engine has started!");
    }

    public void stopEngine(){
        System.out.println("Engine has turned off!");
    }
    public void accelerate(){
        System.out.println("The Vehicle has sped up!");
    }
    public void brake(){
        System.out.println("The Vehicle has slowed down!");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
