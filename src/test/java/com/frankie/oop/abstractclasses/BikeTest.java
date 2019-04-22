package com.frankie.oop.abstractclasses;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class BikeTest{

    Bike myBike = Mockito.mock(Bike.class, Mockito.CALLS_REAL_METHODS);

    @Test
    public void testSetGetWeight() {
        myBike.setWeight(123);
        assertEquals(123, myBike.getWeight());
    }

    @Test
    public void testSetGetNumOfSeats() {
        myBike.setNumOfSeats(4);
        assertEquals(4, myBike.getNumOfSeats());
    }
}