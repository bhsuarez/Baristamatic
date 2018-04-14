package com.bhsuarez;

public class Ingredient {

    // Define ingredient name
    public String ingredientName;

    // Define ingredient cost per unit
    public double ingredientPerUnitCost;

    // Define available inventory of ingredient
    public int ingredientInventoryCount;

    // Default Constructor
    public Ingredient(String setName, double setCost, int setInventoryCount){
        ingredientPerUnitCost = setCost;
        ingredientName = setName;
        ingredientInventoryCount = setInventoryCount;
    }

    // Getter for ingredientName
    public String getIngredientName() {
        return ingredientName;
    }

    // Getter for ingredientCost
    public double getIngredientCost() {
        return ingredientPerUnitCost;
    }

    // Getter for ingredientInventoryCount
    public int getIngredientInventoryCount(){
        return ingredientInventoryCount;
    }

    // Setter for ingredientCost
    public void setIngredientCost(double ingredientPerUnitCost) {
        this.ingredientPerUnitCost = ingredientPerUnitCost;
    }

    // Setter for ingredientName
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    // Setter for ingredientInventoryCount
    public void setIngredientInventoryCount(int ingredientInventoryCount){
        this.ingredientInventoryCount = ingredientInventoryCount;

    }

    // Reduce ingredient inventory count by int argument
    public void useIngredient(int count){
        ingredientInventoryCount = ingredientInventoryCount-count;
    }

    // Reload ingredient
    public void reloadIngredientCount(){
        ingredientInventoryCount = 10;
    }

}
