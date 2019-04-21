package com.frankie.oop;

import com.frankie.oop.abstractclasses.Car;

// inheritance
public class Suv extends Car {

    public Suv(){
        carDoors = 4;
        carWeight = 3000;
        carSeats = 5;
        carWheels = 4;
        engineType = "Default Engine";
    }
    // overloading
    public Suv(int doors, long weight, int seats, int wheels, String engine) {
        carDoors = doors;
        carWeight = weight;
        carSeats = seats;
        carWheels = wheels;
        engineType = engine;
    }

    @Override
    public String describe() {
        return String.format("=========This is an SUV=========\n" +
                "Doors: %s\n" +
                "Weight: %s\n" +
                "Seats: %s\n" +
                "Wheels: %s\n" +
                "Engine: %s", carDoors, carWeight, carSeats,carWheels,engineType);
    }
}
