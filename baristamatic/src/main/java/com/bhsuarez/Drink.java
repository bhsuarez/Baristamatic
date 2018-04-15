package com.bhsuarez;

public class Drink {

    // Define menu number
    private int drinkNumber;

    // Define drink name
    private String drinkName;

    // Define drink cost
    private double drinkCost;

    // Define array of drink ingredients
    private Ingredient[] ingredients = null;

    // Default constructor
    public Drink(int drinkNumber, String drinkName,

                 //This might need to be removed

                 Ingredient[] ingredients
                //

    ) {
        this.drinkNumber = drinkNumber;
        this.drinkName = drinkName;
        this.ingredients = ingredients;
    }
}