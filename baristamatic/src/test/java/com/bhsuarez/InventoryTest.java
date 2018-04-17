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
    public void getIngredients_Test_True(){
        for(int i=0; i<inventory.getIngredients().size(); i++) {

        }
    }

    @Test
    public void drinkInStock_Test_True(){
        for(int i=0; i<inventory.getDrinks().size(); i++) {
            assertTrue(inventory.getDrinks().get(i).isInStock());
        }
    }

    @Test
    public void makeDrink_Test(){
        assertTrue(true);
    }

    @Test
    public void reloadIngredientInventory_Test(){
        inventory.reloadIngredientInventory();
    }
}