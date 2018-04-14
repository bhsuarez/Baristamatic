package com.bhsuarez;

public class Baristamatic {

    private static Ingredient coffee = new Ingredient("Coffee",0.75,10);

    /* Ingredient objects

    private static Ingredient decafCoffee = new Ingredient("Decaf Coffee",0.75,10);
    private static Ingredient sugar = new Ingredient("Sugar",0.25,10);
    private static Ingredient cream = new Ingredient("Cream",0.25,10);
    private static Ingredient steamedMilk = new Ingredient("Steamed Milk",0.35,10);
    private static Ingredient foamedMilk = new Ingredient("Foamed Milk",0.35,10);
    private static Ingredient espresso = new Ingredient("Espresso",1.10,10);
    private static Ingredient cocoa = new Ingredient("Cocoa",0.90,10);
    private static Ingredient whippedCream = new Ingredient("Whipped Cream",1.00,10);
    */

    public static void main(String[] args){

        // Output testing for useIngredient
        System.out.println(coffee.getIngredientName()+","+coffee.getIngredientInventoryCount());
        coffee.useIngredient(1);
        System.out.println(coffee.getIngredientName()+","+coffee.getIngredientInventoryCount());
        coffee.useIngredient(4);
        System.out.println(coffee.getIngredientName()+","+coffee.getIngredientInventoryCount());
        coffee.reloadIngredient();
        System.out.println(coffee.getIngredientName()+","+coffee.getIngredientInventoryCount());
    }
}
