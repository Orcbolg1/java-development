package com.pluralisght;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;


    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0; // Default value for bookedSuites
        this.bookedBasicRooms = 0; // Default value for bookedBasicRooms
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public void setNumberOfSuites(int numberOfSuites) {
        this.numberOfSuites = numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public void setBookedSuites(int bookedSuites) {
        this.bookedSuites = bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public void setBookedBasicRooms(int bookedBasicRooms) {
        this.bookedBasicRooms = bookedBasicRooms;
    }


    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }
    public boolean bookRooms(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= (getAvailableSuites())) {
                bookedSuites += numberOfRooms;
                System.out.println(numberOfRooms + " suite(s) booked successfully.");
                System.out.println(getAvailableSuites() + " suite(s) are Available");
                return true;
            } else {
                System.out.println("Insufficient suite(s) available for booking.");
                return false;
            }
        } else {
            if (numberOfRooms <= (getAvailableRooms())) {
                bookedBasicRooms += numberOfRooms;
                System.out.println(numberOfRooms + " basic room(s) booked successfully.");
                System.out.println(getAvailableRooms() + " basic room(s) are Available");
                return true;
            } else {
                System.out.println("Insufficient basic room(s) available for booking.");
                return false;
            }
        }
    }

}
