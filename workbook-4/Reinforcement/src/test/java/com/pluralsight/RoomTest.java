package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void bookRoom_RoomAlreadyOccupied_ExpectFalse(){
        //Arrange
        Room room = new Room(101, "King");
        Guest guest1 = new Guest("John", 20);
        room.bookRoom(guest1);
        Guest guest2 = new Guest("Raymond", 20);
        assertTrue(room.isOccupied());

        //Act
        boolean result = room.bookRoom(guest2);

        //Assert
        assertFalse(result, "Room should not be bookable if already occupied!");
    }

    @Test
    public void totalBooking_IncreaseTotalBookings_Increase(){
        //Arrange
        Room room = new Room(101, "King");
        Guest guest1 = new Guest("John", 20);
        room.bookRoom(guest1);
    }

}