package com.pluralsight;

public class Car extends Vehicle{

   private int NumberOfDoors;

    public Car(String model, String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int topSpeed, int numberOfDoors) {
        super(model, color, numberOfPassengers, cargoCapacity, fuelCapacity, topSpeed);
        NumberOfDoors = numberOfDoors;
    }

    public Car(){

    }
    public int getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

    public void openTrunk(){
        System.out.println("Trunk is Open!");
    }

    public void closeTrunk(){
        System.out.println("Trunk is Closed!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "NumberOfDoors=" + NumberOfDoors +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", cargoCapacity=" + cargoCapacity +
                ", fuelCapacity=" + fuelCapacity +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
