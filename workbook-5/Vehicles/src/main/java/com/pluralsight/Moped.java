package com.pluralsight;

public class Moped extends Vehicle{

    private int maxWeight;

    public Moped(String model, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, int maxWeight) {
        super(model, color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        this.maxWeight = maxWeight;
    }

    public Moped() {

    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void ride(){
        System.out.println("You can ride the Moped!");
    }

    @Override
    public String toString() {
        return "Moped{" +
                "maxWeight=" + maxWeight +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
