package com.bhsuarez;
import java.util.ArrayList;
import java.util.Scanner;

public class Baristamatic {

    public static void main(String[] args){


        Inventory inventory = new Inventory();
        inventory.addIngredients();
        inventory.addDrinks();

        /* Print out ingredient inventory
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

            /*
            Logic to see if ingredients are in stock



            System.out.println("Dispensing: "+drinks.get(selection-1).getDrinkName());

        }
*/

    }
}
