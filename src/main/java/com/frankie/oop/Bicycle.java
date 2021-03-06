package com.frankie.oop;

import com.frankie.oop.abstractclasses.Bike;

public class Bicycle extends Bike {

    public Bicycle(int seats, long weight){
        this.bikeSeat = seats;
        this.bikeWeight = weight;
    }

    @Override
    public String rideBike() {
       return "Riding Bicycle";
    }
}
