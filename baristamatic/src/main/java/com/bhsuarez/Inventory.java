package com.bhsuarez;
import java.util.ArrayList;

public class Inventory{

    // Define ArrayList of Drink objects
    private ArrayList<Drink> drinks = new ArrayList<Drink>();

    // Define ArrayList of Ingredient Objects
    private ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

    // Add ingredients to ArrayList
    public void addIngredients() {
        ingredients.add(new Ingredient(1,"Coffee", 10));
        ingredients.add(new Ingredient(2,"Decaf Coffee", 10));
        ingredients.add(new Ingredient(3,"Sugar", 10));
        ingredients.add(new Ingredient(4,"Cream", 10));
        ingredients.add(new Ingredient(5,"Steamed Milk", 10));
        ingredients.add(new Ingredient(6,"Foamed Milk", 10));
        ingredients.add(new Ingredient(7,"Espresso", 10));
        ingredients.add(new Ingredient(8,"Cocoa", 10));
        ingredients.add(new Ingredient(9,"Whipped Cream", 10));
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

    // Checks to see if desired drink is in stock, returns true or false, sets inStock boolean for desired drink
    public boolean drinkInStock(int drinkNumberInput){

        /*
        /Coffee Recipe
         */
        if (drinkNumberInput==1){
            if(     ingredients.get(0).getIngredientInventoryCount() >= 3 &&
                    ingredients.get(2).getIngredientInventoryCount() >= 1 &&
                    ingredients.get(3).getIngredientInventoryCount() >= 1){
                        drinks.get(drinkNumberInput).setInStock(true);
            }
            else {
                drinks.get(drinkNumberInput).setInStock(false);
            }
        }

        /*
        Decaf Coffee Recipe
         */
        if (drinkNumberInput==2){
            if(     ingredients.get(1).getIngredientInventoryCount() >= 3 &&
                    ingredients.get(2).getIngredientInventoryCount() >= 1 &&
                    ingredients.get(3).getIngredientInventoryCount() >= 1){
                drinks.get(drinkNumberInput).setInStock(true);
            }
            else {
                drinks.get(drinkNumberInput).setInStock(false);
            }
        }

        /*
        Cafe Latte Recipe
         */
        if (drinkNumberInput==3){
            if(     ingredients.get(6).getIngredientInventoryCount() >= 2 &&
                    ingredients.get(4).getIngredientInventoryCount() >= 1){
                drinks.get(drinkNumberInput).setInStock(true);
            }
            else {
                drinks.get(drinkNumberInput).setInStock(false);
            }
        }

        /*
        Cafe Americano Recipe
         */
        if (drinkNumberInput==4){
            if(     ingredients.get(6).getIngredientInventoryCount() >= 3){
                drinks.get(drinkNumberInput).setInStock(true);
            }
            else {
                drinks.get(drinkNumberInput).setInStock(false);
            }
        }

        /*
        Cafe Mocha Recipe
         */
        if (drinkNumberInput==5){
            if(     ingredients.get(6).getIngredientInventoryCount() >= 1 &&
                    ingredients.get(7).getIngredientInventoryCount() >= 1 &&
                    ingredients.get(4).getIngredientInventoryCount() >= 1 &&
                    ingredients.get(8).getIngredientInventoryCount() >= 1){
                drinks.get(drinkNumberInput).setInStock(true);
            }
            else {
                drinks.get(drinkNumberInput).setInStock(false);
            }
        }

        /*
        Cappuccino Recipe
         */
        if (drinkNumberInput==6){
            if(     ingredients.get(6).getIngredientInventoryCount() >= 2 &&
                    ingredients.get(4).getIngredientInventoryCount() >= 1 &&
                    ingredients.get(5).getIngredientInventoryCount() >= 1){
                drinks.get(drinkNumberInput).setInStock(true);
            }
            else {
                drinks.get(drinkNumberInput).setInStock(false);
            }
        }
        return drinks.get(drinkNumberInput).isInStock();
    }

    // Method to useIngredient() to make drink if in stock
    public void makeDrink(int drinkNumber){
        if(drinks.get(drinkNumber).isInStock()){
            switch (drinkNumber) {

                //
                case 1:
                    ingredients.get(0).useIngredient(3);
                    ingredients.get(2).useIngredient(1);
                    ingredients.get(3).useIngredient(1);
                    System.out.println("Dispensing: " + drinks.get(drinkNumber-1).getDrinkName());
                    break;

                //
                case 2:
                    ingredients.get(1).useIngredient(3);
                    ingredients.get(2).useIngredient(1);
                    ingredients.get(3).useIngredient(1);
                    System.out.println("Dispensing: " + drinks.get(drinkNumber-1).getDrinkName());
                    break;

                case 3:
                    ingredients.get(6).useIngredient(2);
                    ingredients.get(4).useIngredient(1);
                    System.out.println("Dispensing: " + drinks.get(drinkNumber-1).getDrinkName());
                    break;

                case 4:
                    ingredients.get(6).useIngredient(3);
                    System.out.println("Dispensing: " + drinks.get(drinkNumber-1).getDrinkName());
                    break;

                case 5:
                    ingredients.get(6).useIngredient(1);
                    ingredients.get(7).useIngredient(1);
                    ingredients.get(4).useIngredient(1);
                    ingredients.get(8).useIngredient(1);
                    System.out.println("Dispensing: " + drinks.get(drinkNumber-1).getDrinkName());
                    break;

                case 6:
                    ingredients.get(6).useIngredient(2);
                    ingredients.get(4).useIngredient(1);
                    ingredients.get(5).useIngredient(1);
                    System.out.println("Dispensing: " + drinks.get(drinkNumber-1).getDrinkName());
                    break;
            }
        }
        else {
            System.out.println("Out of stock: " + drinks.get(drinkNumber-1).getDrinkName());
        }
    }

    // Reload ingredients inventory
    public void reloadIngredientInventory(){
        for (Ingredient ingredient : ingredients) {
            ingredient.reloadIngredientCount();
        }
    }
}
