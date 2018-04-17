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

        // Empty String for Selection variable
        String selection = " ";

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

            // Make lowercase String
            selection = selection.toLowerCase();

            // If not 'r' or 'q'
            if(selection.charAt(0) != 'r' && selection.charAt(0) != 'q'){
                int selectionInt = Integer.parseInt(selection);

                // While loop for out of bound values
                while(selectionInt>inventory.getDrinks().size() || selectionInt<=0){
                    System.out.println("INCORRECT VALUE: "+selectionInt);
                    System.out.print("Please enter a drink selection [1-6] [q] to quit or [r] to refill ingredients: ");
                    selection = scan.next();
                    selection = selection.toLowerCase();

                    // Refill then break
                    if(selection.charAt(0) == 'r'){
                        inventory.reloadIngredientInventory();
                        break;
                    }
                }

                // If ingredients are in stock, make drink
                if(inventory.drinkInStock(selectionInt)){
                    inventory.makeDrink(selectionInt);
                }

                /*
                 *
                 If ingredients are not in stock...
                 */
                else{

                    // Loop while inventory is not in stock
                    while(!inventory.drinkInStock(selectionInt)){
                        System.out.println("OUT OF STOCK: "+inventory.getDrinks().get(selectionInt-1).getDrinkName());
                        System.out.print("Please enter a drink selection [1-6] [q] to quit or [r] to refill ingredients: ");
                        selection = scan.next();
                        selection = selection.toLowerCase();

                        if(selection.charAt(0)== 'q'){
                            break;
                        }

                        // Refill then break
                        if(selection.charAt(0) == 'r'){
                            inventory.reloadIngredientInventory();
                            break;
                        }

                        selectionInt = Integer.parseInt(selection);

                        // While loop for out of bound values
                        while(selectionInt>inventory.getDrinks().size() || selectionInt<=0){
                            System.out.println("INCORRECT VALUE: "+selectionInt);
                            System.out.print("Please enter a drink selection [1-6] [q] to quit or [r] to refill ingredients: ");
                            selectionInt = scan.nextInt();
                        }
                            if(inventory.drinkInStock(selectionInt)){
                            inventory.makeDrink(selectionInt);
                            }
                    }
                }
            }

            // Reload inventory ingredients
            if(selection.charAt(0) == 'r'){
                inventory.reloadIngredientInventory();
            }
        }

        // Farewell
        System.out.println("Goodbye!");
    }
}
