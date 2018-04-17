package com.bhsuarez;
import org.junit.Test;
import static org.junit.Assert.*;

public class InventoryTest {

    // New Inventory object
    private Inventory inventory = new Inventory();

    // addIngredients Test True
    @Test
    public void addIngredients_True_Test(){
        inventory.addIngredients();
    }

    // addDrinks Test True
    @Test
    public void addDrinks_Test(){
        inventory.addDrinks();
    }

    // getDrinks Test
    @Test
    public void getDrinks_Test(){
        assertEquals(inventory.getDrinks(),inventory.getDrinks());
    }

    // getIngredients Test True -- For Loop
    @Test
    public void getIngredients_Test_True(){
        for(int i=0; i<inventory.getIngredients().size(); i++) {
            assertTrue(inventory.getIngredients().get(i).getIngredientName(),true);
        }
    }

    // drinkInStock Test True
    @Test
    public void drinkInStock_Test_True(){
        for(int i=0; i<inventory.getDrinks().size(); i++) {
            assertTrue(inventory.getDrinks().get(i).isInStock());
        }
    }

    // drinkInStock Test False
    @Test
    public void drinkInStock_Test_False(){
        for(int i=0; i<inventory.getDrinks().size(); i++){
            assertFalse(inventory.getDrinks().get(i).isInStock());
        }
    }

    // makeDrink Test
    @Test
    public void makeDrink_Test(){
        assertEquals(inventory.getDrinks().size(),0);
    }

    // Reload inventory true
    @Test
    public void reloadIngredientInventory_Test_True(){
        inventory.reloadIngredientInventory();
        for(int i=0;i<inventory.getIngredients().size();i++) {
            assertEquals(inventory.getIngredients().get(i).getIngredientInventoryCount(),10);
        }
    }
}