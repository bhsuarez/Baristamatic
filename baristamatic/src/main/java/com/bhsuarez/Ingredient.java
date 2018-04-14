package com.bhsuarez;

public class Ingredient {

    //Define variables
    private String ingredientName;
    private double ingredientCost;


    public Ingredient(String setName, double setCost){
        ingredientCost = setCost;
        ingredientName = setName;
    }

    // Default Constructor
    public Ingredient(String testName, String s) {

    }

    public String getIngredientName() {
        return ingredientName;
    }

    public double getIngredientCost() {
        return ingredientCost;
    }

    public void setIngredientCost(double ingredientCost) {
        this.ingredientCost = ingredientCost;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
}
