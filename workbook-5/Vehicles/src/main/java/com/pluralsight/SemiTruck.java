package com.pluralsight;

public class SemiTruck extends Vehicle{

    private int numberOfTrailers;

    public SemiTruck(String model, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, int numberOfTrailers) {
        super(model, color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        this.numberOfTrailers = numberOfTrailers;
    }

    public SemiTruck(){

    }
    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public void loadCargo(){
        System.out.println("Cargo is Loading!");
    }

    public void unloadCargo(){
        System.out.println("Cargo is Unloading!");
    }

    @Override
    public String toString() {
        return "SemiTruck{" +
                "numberOfTrailers=" + numberOfTrailers +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
