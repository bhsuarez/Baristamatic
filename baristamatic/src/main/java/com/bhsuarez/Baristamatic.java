package com.bhsuarez;
import java.util.ArrayList;
import java.util.Scanner;

public class Baristamatic {

    public static void main(String[] args){

        // Define ArrayList of Drink objects
        ArrayList<Drink> drinks = new ArrayList<Drink>();

        // Define ArrayList of Ingredient Objects
        ArrayList<Ingredient> ingredients = new ArrayList<Ingredient>();

        // Add ingredients to ArrayList
        ingredients.add(new Ingredient("Coffee",10));
        ingredients.add(new Ingredient("Decaf Coffee",10));
        ingredients.add(new Ingredient("Sugar",10));
        ingredients.add(new Ingredient("Cream",10));
        ingredients.add(new Ingredient("Steamed Milk",10));
        ingredients.add(new Ingredient("Foamed Milk",10));
        ingredients.add(new Ingredient("Espresso",10));
        ingredients.add(new Ingredient("Cocoa",10));
        ingredients.add(new Ingredient("Whipped Cream",10));

        // Add drinks to ArrayList
        drinks.add(new Drink(1,"Coffee",2.75,true));
        drinks.add(new Drink(2,"Decaf Coffee",2.75,true));
        drinks.add(new Drink(3,"Cafe Latte",2.55,true));
        drinks.add(new Drink(4,"Cafe Mocha",3.35,true));
        drinks.add(new Drink(5,"Cafe Americano",3.30,true));
        drinks.add(new Drink(6,"Cappuccino",2.90,true));

        // Print out ingredient inventory
        System.out.println("Inventory:");
        for(int i=0; i<ingredients.size();i++) {
            System.out.println(ingredients.get(i).getIngredientName() + "," + ingredients.get(i).getIngredientInventoryCount());
        }

        // Print out drink menu
        System.out.println("Menu:");
        for(int i=0; i<drinks.size();i++){
            System.out.println(drinks.get(i).getDrinkNumber()+","+drinks.get(i).getDrinkName()+",$"+drinks.get(i).getDrinkCost()+","+drinks.get(i).isInStock());
        }

        //Scanner object
        System.out.print("Enter your selection: ");
        Scanner scan = new Scanner(System.in);
        int selection = scan.nextInt();

        while(selection<1 || selection>6){
            if(scan.nextInt()<1 || scan.nextInt()>6){
                System.out.println("Invalid selection: "+selection);
                selection = scan.nextInt();
            }
        }

        if (selection==1){
            System.out.println("Dispensing: "+drinks.get(selection-1).getDrinkName());
        }


    }
}
