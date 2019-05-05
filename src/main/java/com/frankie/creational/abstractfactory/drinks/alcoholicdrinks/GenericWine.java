package com.frankie.creational.abstractfactory.drinks.alcoholicdrinks;

// one special implementation of alcoholicDrink with essential ingredient grape added.
public class GenericWine extends AlcoholicDrink {

    // by default, pass productName and volume to super class constructor AlcoholicDrink()
    // call method addEssentialIngredients to add GenericWine specific ingredient grape (Don't wish to override essentialIngredients of super class)
    public GenericWine(){
        super("Generic Wine","500 ml");
        addEssentialIngredients("grape");
    }
}
