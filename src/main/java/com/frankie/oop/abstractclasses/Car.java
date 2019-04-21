package com.frankie.oop.abstractclasses;

import com.frankie.oop.interfaces.Vehicle;

public abstract class Car implements Vehicle {
    // encapsulation
    protected int carDoors;
    protected long carWeight;
    protected int carSeats;
    protected int carWheels;
    protected String engineType;

    public void setCarDoors(int newNumOfDoors) {
        this.carDoors = newNumOfDoors;
    }

    public int getCarDoors() {
        return carDoors;
    }

    @Override
    public void setCarWeight(long newWeight) {
        this.carWeight = newWeight;
    }

    @Override
    public long getCarWeight() {
        return carWeight;
    }

    @Override
    public void setNumOfSeats(int newNumOfSeats) {
        this.carSeats = newNumOfSeats;
    }

    @Override
    public int getNumOfSeats() {
        return carSeats;
    }

    @Override
    public void setNumOfWheels(int newNumOfWheels) {
        this.carWheels = newNumOfWheels;
    }

    @Override
    public int getNumOfWheels() {
        return carWheels;
    }

    public void setEngineType(String newEngineType) {
        this.engineType = newEngineType;
    }

    public String getEngineType() {
        return engineType;
    }

    abstract public String describe();
}
