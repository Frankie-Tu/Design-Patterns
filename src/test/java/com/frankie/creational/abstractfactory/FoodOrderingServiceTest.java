package com.frankie.creational.abstractfactory;

import com.frankie.creational.abstractfactory.drinks.Drink;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoodOrderingServiceTest {
    private FoodOrderingService myService = FoodOrderingService.getFactory(TypeOfFactory.DRINK_FACTORY);
    private DrinkFactory myDrinkFactory = new DrinkFactory();
    Drink myBeer = myDrinkFactory.order(TypeOfOrder.BEER);
    Drink myWine = myDrinkFactory.order(TypeOfOrder.WINE);
    Drink mySoftDrink = myDrinkFactory.order(TypeOfOrder.SOFT_DRINK);
    Drink myWater = myDrinkFactory.order(TypeOfOrder.WATER);

    @Test
    public void getFactory() {
        FoodOrderingService myService2 = FoodOrderingService.getFactory(TypeOfFactory.DRINK_FACTORY);
        assertEquals(DrinkFactory.class ,myService2.getClass());
    }

    @Test
    public void getFactoryFood() {
        FoodOrderingService myService3 = FoodOrderingService.getFactory(TypeOfFactory.FOOD_FACOTRY);
        assertEquals(FoodFactory.class, myService3.getClass());
    }

    @Test
    public void rightWater() {
        assertEquals(myWater.getClass(), myService.order(TypeOfOrder.WATER).getClass());
    }

    @Test
    public void rightWine() {
        assertEquals(myWine.getClass(), myService.order(TypeOfOrder.WINE).getClass());
    }

    @Test
    public void rightSoftDrink() {
        assertEquals(mySoftDrink.getClass(), myService.order(TypeOfOrder.SOFT_DRINK).getClass());
    }

    @Test
    public void rightBeer() {
        assertEquals(myBeer.getClass(), myService.order(TypeOfOrder.BEER).getClass());
    }
}