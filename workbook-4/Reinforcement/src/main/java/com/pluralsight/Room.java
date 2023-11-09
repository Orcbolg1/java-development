package com.pluralsight;

public class Room {
    private int roomNumber;
    private String roomType;
    private boolean isOccupied;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isOccupied = false;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean bookRoom(){
        if(!isOccupied){
            isOccupied = true;
            Hotel.increaseTotalBookings();
            return true;
        }
        return false;
    }

    public void vacateRoom(){
        this.isOccupied = false;
        Hotel.decreaseTotalBookings();
    }
    public boolean bookRoom(Guest guest) {
        if (!isOccupied) {
            isOccupied = true;
            guest.isCheckedIn();
            Hotel.increaseTotalBookings();
        }

        return false;
    }

    public void vacateRoom(Guest guest) {
        isOccupied = false;
        guest.checkOut();
        Hotel.decreaseTotalBookings();
    }
}

