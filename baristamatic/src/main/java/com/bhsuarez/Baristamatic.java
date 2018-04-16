package com.bhsuarez;
import java.util.ArrayList;
import java.util.Scanner;

public class Baristamatic {

    public static void main(String[] args){

        // Define inventory object
        Inventory inventory = new Inventory();

        // Add ingredients from Inventory object
        inventory.addIngredients();

        // Add ingredients from Inventory object
        inventory.addDrinks();

        // Print out ingredient inventory
        System.out.println("Inventory:");
        for(int i=0; i <inventory.getIngredients().size(); i++) {
            System.out.println(inventory.getIngredients().get(i).getIngredientName() + "," + inventory.getIngredients().get(i).getIngredientInventoryCount());
        }

        // Print out drinks menu
        System.out.println("Menu: ");
        for(int i=0; i <inventory.getDrinks().size(); i++) {
            System.out.println(inventory.getDrinks().get(i).getDrinkNumber() + "," +
                                inventory.getDrinks().get(i).getDrinkName() + ",$"+
                                inventory.getDrinks().get(i).getDrinkCost() + ","+
                                inventory.getDrinks().get(i).isInStock());
        }

        /* Scanner object
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

            /*
            Logic to see if ingredients are in stock



            System.out.println("Dispensing: "+drinks.get(selection-1).getDrinkName());

        }
*/

    }
}
