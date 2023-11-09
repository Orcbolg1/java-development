package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println(slowRide.color);
        System.out.println(slowRide.fuelCapacity);
        slowRide.accelerate();


        Hovercraft hoover = new Hovercraft();
        hoover.hover();
        hoover.accelerate();
        hoover.brake();
    }
}
