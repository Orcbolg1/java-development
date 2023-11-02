package com.pluralisght;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;



    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }



    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        this.isDirty = dirty;
    }

    public boolean isAvailable(){
        return !isDirty && !isOccupied;
    }

    public void checkIn() {
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
            System.out.println("Room checked in. Room is now occupied and marked as dirty.");
        } else {
            System.out.println("Room is already occupied.");
        }
    }

    public void checkOut() {
        if (isOccupied) {
            if (isDirty) {
                cleanRoom();
                System.out.println("Room has been checked out and cleaned.");
            } else {
                isOccupied = false;
                System.out.println("Room has been checked out.");
            }
        } else {
            System.out.println("Room is not currently occupied.");
        }
    }

    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
            System.out.println("Room has been cleaned.");
        } else {
            System.out.println("Room is already clean.");
        }
    }
}
