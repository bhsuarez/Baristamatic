# BrianSuarez_Assignment2

## Drink.java
Creates a Drink object
*   Accepts an int for drink number, String for drink name, double for the drink price, and boolean for stock status
*   Setters and getters for drink number, name, price, and stock status

## DrinkTest.java
JUnit tests for Drink.java

## Ingredient.java
Creates an Ingredient object. 

*   Accepts a String for name and an int for available inventory count
*   Setters and getters for name and inventory count
*   Method useIngredient() reduces the available inventory of ingredient by int argument
*   Method reloadIngredientCount() sets the available count of ingredient to 10

## IngredientTest.java
JUnit unit tests for Ingredient.java

## Inventory.java
Creates an Inventory object.

*   addIngredients() adds ArrayList of Ingredients object to Inventory object
*   addDrinks() adds ArrayList of Drink objects to Inventory
*   getDrinks() returns ArrayList of Drink objects
*   getIngredients() returns ArrayList of Ingredient objects
*   drinkInStock() returns boolean value if Drink object is in stock
*   makeDrink() creates chosen drink using useIngredient() method
*   reloadIngredientInventory() reloads Ingredient inventory of selected Drink object

## InventoryTest.java
JUnit tests for Inventory.java

## Baristamatic.java
Uses the Drink, Ingredient, and Inventory classes to create a drink from the Baristamatic machine
*   Prompts user for drink number [1-6]
*   Enter 'r' to reload all ingredient inventories to 10
*   Enter 'q' to quit Baristamatic
*   Outputs inventory levels plus menu
*   Shows if drink is out of stock based upon ingredient levels