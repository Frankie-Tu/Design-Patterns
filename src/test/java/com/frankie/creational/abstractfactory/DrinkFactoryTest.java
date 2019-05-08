package com.frankie.creational.abstractfactory;

import com.frankie.creational.abstractfactory.drinks.SoftDrink;
import com.frankie.creational.abstractfactory.drinks.Water;
import com.frankie.creational.abstractfactory.drinks.alcoholicdrinks.GenericBeer;
import org.junit.Test;
import com.frankie.creational.abstractfactory.drinks.alcoholicdrinks.GenericWine;

import static org.junit.Assert.*;

public class DrinkFactoryTest {
    DrinkFactory myDrinkFactory = new DrinkFactory();

    @Test
    public void getDrinkWine() {
        assertEquals(new GenericWine().getClass(), myDrinkFactory.order(TypeOfOrder.WINE).getClass());
    }

    @Test
    public void getDrinkBeer() {
        assertEquals(new GenericBeer().getClass(), myDrinkFactory.order(TypeOfOrder.BEER).getClass());
    }

    @Test
    public void getDrinkSoftDrink() {
        assertEquals(new SoftDrink().getClass(), myDrinkFactory.order(TypeOfOrder.SOFT_DRINK).getClass());
    }

    @Test
    public void getDrinkWater() {
        assertEquals(new Water().getClass(), myDrinkFactory.order(TypeOfOrder.WATER).getClass());
    }
}