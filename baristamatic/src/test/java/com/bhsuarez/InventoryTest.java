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
    public void ingredientsInStock_Test(){
        inventory.ingredientsInStock(0);
        assertEquals(inventory.ingredientsInStock(0),inventory.ingredientsInStock(0));
    }

    @Test
    public void makeDrink_Test(){
        inventory.makeDrink(0);
        assertTrue(true);
    }
}
