package com.frankie.creational.prototype;

import org.junit.Test;
import static org.junit.Assert.*;

public class ClonableCarTest {
    private CloneableVehicle car1 = new CloneableCar();
    private CloneableVehicle car2 = car1.clone();

    @Test
    public void checkSeparateInstance(){
        assertNotEquals(car1.hashCode(), car2.hashCode());
    }

    @Test
    public void sameNumOfSeats(){
        assertEquals(car1.getNumOfSeats(), car2.getNumOfSeats());
    }

    @Test
    public void sameWeight(){
        assertEquals(car1.getWeight(), car2.getWeight());
    }
}