package com.bhsuarez;
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

    // Return drink menu from ArrayList<Drink>
    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    // Return ingredients inventory from ArrayList<Ingredient>
    public ArrayList<Ingredient> getIngredients(){
        return ingredients;
    }

    public boolean ingredientsInStock(int drinkNumber){
        switch (drinkNumber){
            case 1:
                if(ingredients.get(0).ingredientInventoryCount>=3
                        && ingredients.get(2).ingredientInventoryCount>=1
                        && ingredients.get(3).ingredientInventoryCount>=1){
                    return true;
                }
        }
        return true;
    }

    // Make drink method
    public void makeDrink(int drinkNumber){
        switch (drinkNumber){
            case 1:
                if(ingredients.get(0).ingredientInventoryCount>=3
                        && ingredients.get(2).ingredientInventoryCount>=1
                        && ingredients.get(3).ingredientInventoryCount>=1){
                    System.out.println("Dispensing: "+drinks.get(drinkNumber-1).getDrinkName());
                    ingredients.get(0).useIngredient(3);
                    ingredients.get(2).useIngredient(1);
                    ingredients.get(3).useIngredient(1);
                }
                else {
                    drinks.get(drinkNumber-1).setInStock(false);
                    System.out.println("Out of stock: " + drinks.get(drinkNumber - 1).getDrinkName());
                }
//            case 2:
//                if(ingredients.get(0).ingredientInventoryCount>=3
//                        && ingredients.get(2).ingredientInventoryCount>=1
//                        && ingredients.get(3).ingredientInventoryCount>=1){
//                    ingredients.get(0).useIngredient(3);
//                    ingredients.get(2).useIngredient(1);
//                    ingredients.get(3).useIngredient(1);
//                }
//            case 3:
//                if(ingredients.get(0).ingredientInventoryCount>=3
//                        && ingredients.get(2).ingredientInventoryCount>=1
//                        && ingredients.get(3).ingredientInventoryCount>=1){
//                    ingredients.get(0).useIngredient(3);
//                    ingredients.get(2).useIngredient(1);
//                    ingredients.get(3).useIngredient(1);
//                }
//            case 4:
//                if(ingredients.get(0).ingredientInventoryCount>=3
//                        && ingredients.get(2).ingredientInventoryCount>=1
//                        && ingredients.get(3).ingredientInventoryCount>=1){
//                    ingredients.get(0).useIngredient(3);
//                    ingredients.get(2).useIngredient(1);
//                    ingredients.get(3).useIngredient(1);
//                }
//            case 5:
//                if(ingredients.get(0).ingredientInventoryCount>=3
//                        && ingredients.get(2).ingredientInventoryCount>=1
//                        && ingredients.get(3).ingredientInventoryCount>=1){
//                    ingredients.get(0).useIngredient(3);
//                    ingredients.get(2).useIngredient(1);
//                    ingredients.get(3).useIngredient(1);
//                }
//            case 6:
//                if(ingredients.get(0).ingredientInventoryCount>=3
//                        && ingredients.get(2).ingredientInventoryCount>=1
//                        && ingredients.get(3).ingredientInventoryCount>=1){
//                    ingredients.get(0).useIngredient(3);
//                    ingredients.get(2).useIngredient(1);
//                    ingredients.get(3).useIngredient(1);
//                }
        }
    }
}
