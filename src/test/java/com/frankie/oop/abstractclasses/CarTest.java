package com.frankie.oop.abstractclasses;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class CarTest {

    Car myCar = Mockito.mock(Car.class, Mockito.CALLS_REAL_METHODS);

    @Test
    public void testSetGetCarDoors() {
        myCar.setCarDoors(5);
        assertEquals(5, myCar.getCarDoors());
    }

    @Test
    public void testSetGetWeight() {
        myCar.setWeight(1234);
        assertEquals(1234, myCar.getWeight());
    }

    @Test
    public void testSetGetNumOfSeats() {
        myCar.setNumOfSeats(7);
        assertEquals(7, myCar.getNumOfSeats());
    }

    @Test
    public void testSetGetNumOfWheels() {
        myCar.setNumOfWheels(6);
        assertEquals(6, myCar.getNumOfWheels());
    }

    @Test
    public void testSetGetEngineType() {
        myCar.setEngineType("test engine");
        assertEquals("test engine", myCar.getEngineType());
    }
}