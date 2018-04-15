package com.bhsuarez;

public class Drink {

    // Define menu number
    private int drinkNumber;

    // Define drink name
    private String drinkName;

    // Define drink cost
    private double drinkCost;

    // Define array of drink ingredients
    private Ingredient[] ingredients = null;

    // Define inStock boolean variable
    private boolean inStock;

    // Default constructor
    public Drink(int drinkNumber, String drinkName, double drinkCost, boolean inStock) {
        this.drinkNumber = drinkNumber;
        this.drinkName = drinkName;
        this.drinkCost = drinkCost;
        this.inStock = inStock;
    }

    // Getter for drinkNumber
    public int getDrinkNumber() {
        return drinkNumber;
    }

    // Setter for drinkNumber
    public void setDrinkNumber(int drinkNumber) {
        this.drinkNumber = drinkNumber;
    }

    // Getter for drinkName
    public String getDrinkName(){
        return drinkName;
    }

    // Setter for drinkNAme
    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    // Getter for drinkCost
    public double getDrinkCost() {
        return drinkCost;
    }

    // Setter for drinkCost
    public void setDrinkCost(double drinkCost) {
        this.drinkCost = drinkCost;
    }

    // Getter for inStock
    public boolean isInStock() {
        return inStock;
    }

    // Setter for inStock
    public void setInStock(boolean inStock){
        this.inStock = inStock;
    }
}