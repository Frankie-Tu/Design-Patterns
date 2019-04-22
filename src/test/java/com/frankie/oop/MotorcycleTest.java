package com.frankie.oop;

import org.junit.Test;

import static org.junit.Assert.*;

public class MotorcycleTest {

    private Motorcycle myMotorcycle = new Motorcycle(1, 200, "600cc");

    public void testRideBike() {
        assertEquals("Riding Motorcycle", myMotorcycle.rideBike());
    }

    @Test
    public void testGetEngineType() {
        assertEquals("600cc", myMotorcycle.getEngineType());
    }

    // setter tests
    @Test
    public void testSetEngineType() {
        myMotorcycle.setEngineType("450cc");
        assertEquals("450cc", myMotorcycle.getEngineType());
    }
}