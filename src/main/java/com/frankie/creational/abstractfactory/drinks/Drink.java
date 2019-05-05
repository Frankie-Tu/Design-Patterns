package com.frankie.creational.abstractfactory.drinks;

import java.util.ArrayList;
import java.util.Arrays;

/*
To encapsulate data and methods in this class but at the same time allow subclasses to super
constructor of this super class.
Abstracting features essential to all types of drinks.
 */

public abstract class Drink {
    private String productName;
    private String volume;
    private ArrayList<String> essentialIngredients;

    // also available to all subclasses outside package inheriting this class
    protected Drink (String productName, String volume, ArrayList<String> essentialIngredients) {
        this.productName = productName;
        this.volume = volume;
        this.essentialIngredients = essentialIngredients;
    }

    // assuming essentialIngredient is the same as productName when it is not specified in the constructor. Such as water
    protected Drink(String productName, String volume) {
        this.productName = productName;
        this.volume = volume;
        this.essentialIngredients = new ArrayList<>(Arrays.asList(productName));
    }

    public void setProductName(String productName) { this.productName = productName; }

    public void setVolume(String volume) { this.volume = volume; }

    public void setEssentialIngredients(ArrayList<String> essentialIngredients) { this.essentialIngredients = essentialIngredients; }

    public String getProductName() {
        return productName;
    }

    public String getVolume() {
        return volume;
    }

    public String getEssentialIngredients() {
        return essentialIngredients.toString();
    }

    public void addEssentialIngredients (String Ingre){
        this.essentialIngredients.add(Ingre);
    }

    public abstract void describe ();
}
