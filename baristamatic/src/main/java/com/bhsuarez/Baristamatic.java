package com.bhsuarez;
import java.util.Scanner;

public class Baristamatic {

    public static void main(String[] args){

        // Define inventory object
        Inventory inventory = new Inventory();

        // Add ingredients from Inventory object
        inventory.addIngredients();

        // Add ingredients from Inventory object
        inventory.addDrinks();

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // String variable for drink selection
        //String selection = scan.nextLine();

        //
        // LOOP GOES HERE
        //

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

        // TESTING
        inventory.makeDrink(1);

        System.out.println("Inventory:");
        for(int i=0; i <inventory.getIngredients().size(); i++) {
            System.out.println(inventory.getIngredients().get(i).getIngredientName() + "," + inventory.getIngredients().get(i).getIngredientInventoryCount());
        }


        //
        //LOOP ENDS HERE
        //

    }
}
