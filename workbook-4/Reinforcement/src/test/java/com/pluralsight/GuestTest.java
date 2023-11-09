package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuestTest {

    @Test
    public void isCheckedIn_VerifyIsCheckedIn_ExpectedTrue(){
        // Arrange
        Guest guest = new Guest("Raymond", 20);

        // Act
        guest.checkIn();

        // Assert
        assertTrue(guest.isCheckedIn(), " Guest Should be Checked In.");

    }

    @Test
    public void checkOut_VerifyCheckedOut_ExpectedFalse(){
        // Arrange
        Guest guest = new Guest("Raymond", 20);
        guest.checkIn();

        // Act
        guest.checkOut();

        // Assert
        assertFalse(guest.isCheckedIn(), "Guest should not be check in");
    }
}