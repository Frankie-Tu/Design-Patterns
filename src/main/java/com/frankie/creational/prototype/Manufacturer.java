package com.frankie.creational.prototype;

public class Manufacturer {
    public static void main(String[] args){
        CloneableVehicle car1 = new CloneableCar();
        CloneableVehicle car2 = car1.clone();

        // verify if two objects are the same one
        System.out.println("car 1 hashcode:" + car1.hashCode());
        System.out.println("car 2 hashcode:" + car2.hashCode());

    }
}
