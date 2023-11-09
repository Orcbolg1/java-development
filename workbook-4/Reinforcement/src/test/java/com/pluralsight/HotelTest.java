package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    public void totalBooking_IncreaseTotalBookings_Increase() {
        // Arrange
        Room room = new Room(101, "Double");
        Room room1 = new Room(102, "King");
        Room room2 = new Room(103, "Suite");

        Guest guest = new Guest("John", 25);
        Guest guest1 = new Guest("Raymond", 20);
        Guest guest2 = new Guest("Henry", 45);

        room.bookRoom(guest);
        room1.bookRoom(guest1);
        room2.bookRoom(guest2);

        // Act
        int sum = Hotel.getTotalBookings();


        //Assert
        assertEquals(3, sum, "Should have the same amount of bookings with the get bookings");
    }

}