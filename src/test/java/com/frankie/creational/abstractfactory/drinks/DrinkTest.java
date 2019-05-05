package com.frankie.creational.abstractfactory.drinks;

import org.junit.Test;

import static org.junit.Assert.*;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;

public class DrinkTest {

    Drink myDrink = Mockito.mock(Drink.class, Mockito.CALLS_REAL_METHODS);

    @Test
    public void setGetProductName() {
        String testName = "testName";
        myDrink.setProductName(testName);
        assertEquals(testName, myDrink.getProductName());
    }

    @Test
    public void setGetVolume() {
        String testVolume = "1000 ml";
        myDrink.setVolume(testVolume);
        assertEquals(testVolume, myDrink.getVolume());
    }

    @Test
    public void setEssentialIngredients() {
        ArrayList<String> testIngredients = new ArrayList<>(Arrays.asList("test1", "test2", "test3"));
        myDrink.setEssentialIngredients(testIngredients);
        assertEquals(testIngredients.toString(), myDrink.getEssentialIngredients());
    }

    @Test
    public void addEssentialIngredients() {

        String testNewIngredients = "new ingredient";
        ArrayList<String> testOldIngredients = new ArrayList<>(Arrays.asList("old ingredient"));

        // clone testOldIngredients as a separate instance and add new ingredient to it for later comparison
        ArrayList<String> clonedTestOldIngredients = (ArrayList<String>) testOldIngredients.clone();
        clonedTestOldIngredients.add(testNewIngredients);

        myDrink.setEssentialIngredients(testOldIngredients);
        myDrink.addEssentialIngredients(testNewIngredients);

        assertEquals(clonedTestOldIngredients.toString(), myDrink.getEssentialIngredients());
    }
}