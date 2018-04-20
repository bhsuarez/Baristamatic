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

        // Empty String for Selection variable
        String selection = " ";

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

            // Make lowercase String if string
            selection = selection.toLowerCase();

            // If selection is 'r' reloadIngredientInventory()
            if (selection.charAt(0) == 'r') {
                inventory.reloadIngredientInventory();
            }

            // If selection is not 'r' or 'q'
            if (selection.charAt(0)!='r' || selection.charAt(0)!='q'){
                System.out.println("INCORRECT VALUE: " + selection);
            }

            // If selection matches int value, parse String into int
            if (selection.matches("\\d+")) {
                selectionInt = Integer.parseInt(selection);

                // While loop for out of bound values
                while (!selection.matches("\\d+") || selectionInt <= 0 || selectionInt > inventory.getDrinks().size()) {

                    // If selectionInt js greater than size or selectionInt is less than 0
                    if (selectionInt > inventory.getDrinks().size() || selectionInt <= 0) {
                        System.out.println("INCORRECT VALUE: " + selection);
                        System.out.print("Please enter a drink selection [1-6] [q] to quit or [r] to refill ingredients: ");
                        selection = scan.next();

                        // If selection matches int value, parse String into int
                        if (selection.matches("\\d+")) {
                            selectionInt = Integer.parseInt(selection);
                        }

                        // If selection is 'r' reloadIngredientInventory()
                        if (selection.charAt(0) == 'r') {
                            inventory.reloadIngredientInventory();
                        }

                        // If selection is 'q', then quit
                        if (selection.charAt(0) == 'q'){
                            break;
                        }
//                        if (selection.charAt(0) != 'r' || selection.charAt(0) != 'q' || selectionInt <=0 || selectionInt > inventory.getDrinks().size()){
//                            System.out.println("INCORRECT VALUE: " + selectionInt);
//                            System.out.print("Please enter a drink selection [1-6] [q] to quit or [r] to refill ingredients: ");
//                            selection = scan.next();
//                        }
                    }
                }

                /*
                /If ingredients are in stock, make drink
                  */
                if (inventory.drinkInStock(selectionInt)) {
                    inventory.makeDrink(selectionInt);
                }

                /*
                 *
                 If ingredients are not in stock...
                 */
                else {
                    System.out.println("OUT OF STOCK: " + inventory.getDrinks().get(selectionInt - 1).getDrinkName());
                }
            }
        }

        // Farewell
        System.out.println("Goodbye!");
    }
}
