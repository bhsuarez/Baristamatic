package com.bhsuarez;
import java.util.Scanner;

public class Baristamatic {

    public static void main(String[] args) {

        // Define inventory object
        Inventory inventory = new Inventory();

        // Add ingredients from Inventory object
        inventory.addIngredients();

        // Add ingredients from Inventory object
        inventory.addDrinks();

        // Scanner object
        Scanner scan = new Scanner(System.in);

        // Selection variable
        String selection = " ";

        // Selection int
        int selectionInt;

        // While loop for selection, q for quit
        while (selection.charAt(0) != 'q') {

            // Print out ingredient inventory
            System.out.println("Inventory:");
            for (int i = 0; i < inventory.getIngredients().size(); i++) {
                System.out.println(inventory.getIngredients().get(i).getIngredientName() + "," +
                        inventory.getIngredients().get(i).getIngredientInventoryCount());
            }

            // Print out drinks menu
            System.out.println("Menu: ");
            for (int i = 0; i < inventory.getDrinks().size(); i++) {
                System.out.println(inventory.getDrinks().get(i).getDrinkNumber() + "," +
                        inventory.getDrinks().get(i).getDrinkName() + ",$" +
                        inventory.getDrinks().get(i).getDrinkCost() + "," +
                        inventory.getDrinks().get(i).isInStock());
            }

            // Prompt for drink selection
            System.out.print("Please enter a drink selection [1-6] [q] to quit or [r] to refill ingredients: ");
            selection = scan.next();
            selection = selection.toLowerCase();

            // Make drink
            if(selection.charAt(0) != 'r' && selection.charAt(0) != 'q'){
                selectionInt = Integer.parseInt(selection);

                // If ingredients are in stock, make drink
                if(inventory.ingredientsInStock(selectionInt)){
                    inventory.makeDrink(selectionInt);
                }
                else{
                    System.out.println("Out of stock!");

                    break;
                }
            }

            // Reload inventory ingredients
            if(selection.charAt(0) == 'r'){
                inventory.reloadIngredientInventory();
            }

        }
        System.out.println("Goodbye!");
    }
}
