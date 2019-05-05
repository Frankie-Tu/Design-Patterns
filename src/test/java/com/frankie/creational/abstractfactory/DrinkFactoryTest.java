package com.frankie.creational.abstractfactory;

import com.frankie.creational.abstractfactory.drinks.SoftDrink;
import com.frankie.creational.abstractfactory.drinks.Water;
import com.frankie.creational.abstractfactory.drinks.alcoholicdrinks.GenericBeer;
import com.frankie.creational.abstractfactory.drinks.enums.TypeOfDrink;
import org.junit.Test;
import com.frankie.creational.abstractfactory.drinks.alcoholicdrinks.GenericWine;

import static org.junit.Assert.*;

public class DrinkFactoryTest {

    @Test
    public void getDrinkWine() {
        assertEquals(new GenericWine().getClass(), DrinkFactory.getDrink(TypeOfDrink.WINE).getClass());
    }

    @Test
    public void getDrinkBeer() {
        assertEquals(new GenericBeer().getClass(), DrinkFactory.getDrink(TypeOfDrink.BEER).getClass());
    }

    @Test
    public void getDrinkSoftDrink() {
        assertEquals(new SoftDrink().getClass(), DrinkFactory.getDrink(TypeOfDrink.SOFT_DRINK).getClass());
    }

    @Test
    public void getDrinkWater() {
        assertEquals(new Water().getClass(), DrinkFactory.getDrink(TypeOfDrink.WATER).getClass());
    }
}