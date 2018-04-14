package com.bhsuarez;

public class Drink {

    // Define menu number
    private int menu;

    // Define drink name
    private String drinkName;

    // Define array of drink ingredients
    private Ingredient[] ingredients = null;

    // Default constructor
    public Drink(int menu, String drinkName, Ingredient[] ingredients){
        this.menu = menu;
        this.drinkName = drinkName;
        this.ingredients = ingredients;
    }
}