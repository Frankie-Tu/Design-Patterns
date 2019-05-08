package com.frankie.creational.abstractfactory;

import java.security.InvalidParameterException;

// abstract factory, factory of factories
public abstract class FoodOrderingService<T> {
    public static FoodOrderingService getFactory (TypeOfFactory typeFactory){
        switch (typeFactory) {
            case FOOD_FACOTRY: {
                return new FoodFactory();
            }
            case DRINK_FACTORY: {
                return new DrinkFactory();
            }
        }
        throw new InvalidParameterException(String.format("Invalid type of factory : %s\n" +
                "Valid options are FOOD_FACTORY, DRINK_FACTORY.", typeFactory));
    }

    // can be implemented to return different types of objects, Food / Drink etc.
    public abstract T order (TypeOfOrder typeOrder);
}
