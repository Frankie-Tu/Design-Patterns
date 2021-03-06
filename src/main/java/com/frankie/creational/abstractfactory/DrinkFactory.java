package com.frankie.creational.abstractfactory;

import com.frankie.creational.abstractfactory.drinks.Drink;
import com.frankie.creational.abstractfactory.drinks.SoftDrink;
import com.frankie.creational.abstractfactory.drinks.Water;
import com.frankie.creational.abstractfactory.drinks.alcoholicdrinks.GenericBeer;
import com.frankie.creational.abstractfactory.drinks.alcoholicdrinks.GenericWine;

import java.security.InvalidParameterException;

public class DrinkFactory extends FoodOrderingService<Drink>{
    @Override
    public Drink order(TypeOfOrder typeOrder){
        switch (typeOrder) {
            case WINE: {
                return new GenericWine();
            }
            case BEER: {
                return new GenericBeer();
            }
            case SOFT_DRINK: {
                return new SoftDrink();
            }
            case WATER: {
                return new Water();
            }
        }
        // throw exceptions when parameter is invalid
        throw new InvalidParameterException(String.format("Invalid type of drink : %s\n" +
                "Valid options are WINE, BEER, SOFT_DRINK.", typeOrder));
    }
}
