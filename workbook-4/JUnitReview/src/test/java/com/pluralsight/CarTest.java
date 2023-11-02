package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    public void accelerate_should_increaseCarSpeed(){
        // arrange
        // Where we all prepare all the variables we use for the test
        Car car = new Car("Ford", "F150 Raptor");
        int speedChange = 15;
        int expectedSpeed = 15;

        // act
        // call the method we are going to test
        car.accelerate(speedChange);

        // assert
        // Verify the test to get the expected answer
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
        }

        @Test
        public void brake_should_decreaseCarSpeed(){
        Car car = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        car.accelerate(speedUpBy);
        int slowDownBy= 10;
        int expectedSpeed = 5;

        car.brake(slowDownBy);

        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
        }

        @Test
        public void brake_should_stopCar_whenChangeIsGreater(){
            Car car = new Car("Ford", "F150 Raptor");
            int speedUpBy = 15;
            car.accelerate(speedUpBy);
            int slowDownBy= 20;
            int expectedSpeed = 0;

            car.brake(slowDownBy);

            int actualSpeed = car.getSpeed();
            assertEquals(expectedSpeed, actualSpeed);
        }

    }

