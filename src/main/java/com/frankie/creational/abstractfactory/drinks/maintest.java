package com.frankie.creational.abstractfactory.drinks;

import com.frankie.creational.abstractfactory.DrinkFactory;
import com.frankie.creational.abstractfactory.drinks.enums.TypeOfDrink;

public class maintest {
    public static void main(String[] args) {
        Drink myBeer = DrinkFactory.getDrink(TypeOfDrink.BEER);
        Drink myWine = DrinkFactory.getDrink(TypeOfDrink.WINE);
        Drink mySoftDrink = DrinkFactory.getDrink(TypeOfDrink.SOFT_DRINK);
        Drink myWater = DrinkFactory.getDrink(TypeOfDrink.WATER);

        myBeer.describe();
        myWine.describe();
        mySoftDrink.describe();
        myWater.describe();
    }
}
