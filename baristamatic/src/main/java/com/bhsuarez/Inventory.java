package com.bhsuarez;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Inventory{

    // Define ArrayList of Drink objects
    private ArrayList<Drink> drinks = new ArrayList<Drink>();

    // Define ArrayList of Ingredient Objects
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    // Add ingredients to ArrayList
    public void addIngredients() {
        ingredients.add(new Ingredient("Coffee", 10));
        ingredients.add(new Ingredient("Decaf Coffee", 10));
        ingredients.add(new Ingredient("Sugar", 10));
        ingredients.add(new Ingredient("Cream", 10));
        ingredients.add(new Ingredient("Steamed Milk", 10));
        ingredients.add(new Ingredient("Foamed Milk", 10));
        ingredients.add(new Ingredient("Espresso", 10));
        ingredients.add(new Ingredient("Cocoa", 10));
        ingredients.add(new Ingredient("Whipped Cream", 10));
    }

    // Add drinks to ArrayList
    public void addDrinks() {
        drinks.add(new Drink(1, "Coffee", 2.75, true));
        drinks.add(new Drink(2, "Decaf Coffee", 2.75, true));
        drinks.add(new Drink(3, "Cafe Latte", 2.55, true));
        drinks.add(new Drink(4, "Cafe Mocha", 3.35, true));
        drinks.add(new Drink(5, "Cafe Americano", 3.30, true));
        drinks.add(new Drink(6, "Cappuccino", 2.90, true));
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }
}
