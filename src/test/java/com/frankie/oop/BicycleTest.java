package com.frankie.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class BicycleTest{

    private Bicycle myBicycle = new Bicycle(1, 12);

    @Test
    public void testRideBike() {
        assertEquals("Riding Bicycle", myBicycle.rideBike());
    }
}