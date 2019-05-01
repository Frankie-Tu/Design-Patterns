package com.frankie.creational.prototype;
// Allows developer to instantiating new object by copying existing object
// This avoids costly creation of object previously done by instantiating a class using new keyword
// Makes the application run faster as a result
// Note: shallow and deep copy will make this design pattern more complex, and sometimes creates ambiguity
//       to the other developers whether the clone() is shallow or deep.
public class CloneableCar implements CloneableVehicle {

    private long weight;
    private int seats;

    public CloneableCar(){
        this.weight = 1500;
        this.seats = 4;
    }

    @Override
    public void setWeight(long newWeight) {
        this.weight = newWeight;
    }

    @Override
    public long getWeight() {
        return this.weight;
    }

    @Override
    public void setNumOfSeats(int newNumOfSeats) {
        this.seats = newNumOfSeats;
    }

    @Override
    public int getNumOfSeats() {
        return this.seats;
    }

    @Override
    public CloneableVehicle clone() {

        CloneableCar clonedCar = null;

        try {
            clonedCar = (CloneableCar) super.clone();
            // in case if clone() is called on an object that does not implement Cloneable interface
            // or inference that extend cloneable interface
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clonedCar;
    }
}
