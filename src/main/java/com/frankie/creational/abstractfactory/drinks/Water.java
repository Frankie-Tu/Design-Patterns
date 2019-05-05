package com.frankie.creational.abstractfactory.drinks;

public class Water extends Drink {

    public Water () {
        super ("water", "400 ml");
    }

    @Override
    public void describe() {
        System.out.println(String.format("This is just %s %s",getVolume(), getProductName()));
    }
}
