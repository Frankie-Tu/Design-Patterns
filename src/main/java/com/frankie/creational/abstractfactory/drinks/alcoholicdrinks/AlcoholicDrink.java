package com.frankie.creational.abstractfactory.drinks.alcoholicdrinks;

import com.frankie.creational.abstractfactory.drinks.Drink;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class AlcoholicDrink extends Drink {

    public AlcoholicDrink(String productName, String volume, ArrayList<String> essentialIngredients){
        super(productName, volume, essentialIngredients);
    }

    // if essentialIngredients not specified
    public AlcoholicDrink(String productName, String volume) {
        super(productName, volume, new ArrayList<>(Arrays.asList("alcohol", "water")));
    }

    @Override
    public void describe() {
        System.out.println(String.format("This is %s %s, it contains %s", getVolume(),getProductName(), getEssentialIngredients()));
    }
}
