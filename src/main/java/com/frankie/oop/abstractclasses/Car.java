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
    public void setWeight(long newWeight) {
        this.carWeight = newWeight;
    }

    @Override
    public long getWeight() {
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

    public void setNumOfWheels(int newNumOfWheels) {
        this.carWheels = newNumOfWheels;
    }

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
