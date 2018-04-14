package com.bhsuarez;

import java.util.ArrayList;

public class Baristamatic {

    public static void main(String[] args){

        // Inventory of Ingredients
        ArrayList<Ingredient> inventory = new ArrayList<Ingredient>();

        // Menu items
        ArrayList<Drink> menu = new ArrayList<Drink>();

        // Create Ingredient objects for drinks
        inventory.add((new Ingredient("Coffee",0.75,10)));
        inventory.add((new Ingredient("Decaf Coffee",0.75,10)));
        inventory.add((new Ingredient("Sugar",0.25,10)));
        inventory.add((new Ingredient("Cream",0.25,10)));
        inventory.add((new Ingredient("Steamed Milk",0.35,10)));
        inventory.add((new Ingredient("Foamed Milk",0.35,10)));
        inventory.add((new Ingredient("Espresso",1.10,10)));
        inventory.add((new Ingredient("Cocoa",0.90,10)));
        inventory.add((new Ingredient("Whipped Cream",1.00,10)));

        System.out.println("Inventory:");
        for(int i=0; i < inventory.size(); i++) {
            System.out.println(inventory.get(i).getIngredientName() + "," + inventory.get(i).getIngredientInventoryCount());
        }
        System.out.println("Menu:");
        for(int i=0; i < menu.size(); i++){
            System.out.println();
        }


    }
}
