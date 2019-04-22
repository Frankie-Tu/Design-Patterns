package com.frankie.oop.abstractclasses;

import com.frankie.oop.interfaces.Vehicle;

public abstract class Bike implements Vehicle {
    // encapsulation
    protected long bikeWeight;
    protected final int bikeWheels = 2;
    protected int bikeSeat;

    @Override
    public void setWeight(long newWeight) {
        this.bikeWeight = newWeight;
    }

    @Override
    public long getWeight() {
        return bikeWeight;
    }

    @Override
    public void setNumOfSeats(int newNumOfSeats) {
        this.bikeSeat = newNumOfSeats;
    }

    @Override
    public int getNumOfSeats() {
        return bikeSeat;
    }

    public abstract String rideBike();
}
