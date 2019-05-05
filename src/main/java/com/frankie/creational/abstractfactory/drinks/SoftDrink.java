package com.frankie.creational.abstractfactory.drinks;

import java.util.ArrayList;
import java.util.Arrays;

public class SoftDrink extends Drink {
    public SoftDrink () {
        super( "Generic Soft Drink",
                "355 ml",
                new ArrayList<>(Arrays.asList("carbonated water", "sugar(sweeteners)")));
    }

    @Override
    public void describe() {
        System.out.println(String.format("This is %s %s and it contains %s", getVolume(), getProductName(), getEssentialIngredients()));
    }
}
