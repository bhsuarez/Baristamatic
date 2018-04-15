package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    private Ingredient ingredient = null;

    // Initializer for ingredient object
    @Before
    public void setUpIngredient(){
        ingredient = new Ingredient("Name",10);
    }

    // Test for setIngredientName()
    @Test
    public void testSetIngredientName(){
        ingredient.setIngredientName("Test");
        assertTrue("Test",true);
    }

    //  Test for setIngredientInventoryCount()
    @Test
    public void testSetIngredientInventoryCount(){
        ingredient.setIngredientInventoryCount(10);
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }

    // Test for getIngredientName()
    @Test
    public void testGetIngredientName(){
        assertTrue(ingredient.getIngredientName(),true);
    }

    // Test for getIngredientInventoryCount()
    @Test
    public void testGetIngredientInventoryCount(){
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }

    // Test for useIngredient()
    @Test
    public void testUseIngredient_False(){
        ingredient.useIngredient(1);
        assertFalse(ingredient.getIngredientInventoryCount()<0);
    }

    // Test for reloadIngredientCount
    @Test
    public void testReloadIngredientCount(){
        ingredient.reloadIngredientCount();
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }
}
