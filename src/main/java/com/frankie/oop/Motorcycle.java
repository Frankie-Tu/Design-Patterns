package com.frankie.oop;

import com.frankie.oop.abstractclasses.Bike;

public class Motorcycle extends Bike {

    private String engineType;

    Motorcycle() {
        int bikeSeats = 2;
        long bikeWeight = 150;
        String engineType = "500cc";
    }

    Motorcycle(int seats, long weight, String engine) {
        this.bikeSeat = seats;
        this.bikeWeight = weight;
        this.engineType = engine;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String rideBike() {
        return "Riding Motorcycle";
    }
}
