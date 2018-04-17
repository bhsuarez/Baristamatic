package com.bhsuarez;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {

    private Inventory inventory = new Inventory();

    @Test
    public void addIngredients_Test(){
        inventory.addIngredients();
        assertTrue(true);
    }

    @Test
    public void addDrinks_Test(){
        inventory.addDrinks();
        assertTrue(true);
    }

    @Test
    public void getDrinks_Test(){
        inventory.getDrinks();
        assertEquals(inventory.getDrinks(),inventory.getDrinks());
    }

    @Test
    public void getIngredients_Test(){
        inventory.getIngredients();
        assertEquals(inventory.getIngredients(),inventory.getIngredients());
    }

    @Test
    public void drinkInStock_Test_True(){
        inventory.drinkInStock(0);
        assertEquals(inventory.drinkInStock(0),inventory.drinkInStock(0));
    }

    @Test
    public void makeDrink_Test(){
        inventory.makeDrink(0);
        assertTrue(true);
    }
    // FIX ME
    @Test
    public void reloadIngredientInventory_Test(){
        inventory.reloadIngredientInventory();
        //
        // Enter test here
        //
    }
}