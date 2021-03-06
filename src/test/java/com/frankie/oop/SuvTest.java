package com.frankie.oop;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuvTest{

    private Suv mySuv = new Suv(4,2500, 7, 4, "Gas V8");

    // getter tests
    @Test
    public void testGetDoors() {
        assertEquals(4, mySuv.getCarDoors());
    }

    @Test
    public void testGetWeight() {
        assertEquals(2500, mySuv.getWeight());
    }

    @Test
    public void testGetSeats() {
        assertEquals(7, mySuv.getNumOfSeats());
    }

    @Test
    public void testGetWheels() {
        assertEquals(4, mySuv.getNumOfWheels());
    }

    @Test
    public void testGetEngine() {
        assertEquals("Gas V8", mySuv.getEngineType());
    }

    @Test
    public void testDescribe() {
        assertEquals("=========This is an SUV=========\n" +
                "Doors: 4\n" +
                "Weight: 2500\n" +
                "Seats: 7\n" +
                "Wheels: 4\n" +
                "Engine: Gas V8", mySuv.describe());
    }
}
