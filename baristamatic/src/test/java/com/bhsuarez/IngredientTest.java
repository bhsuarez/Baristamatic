package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    private Ingredient ingredient = null;

    @Before
    public void setUpIngredient(){
        ingredient = new Ingredient("Name",10);
    }

    @Test
    public void testSetIngredientName(){
        ingredient.setIngredientName("Test");
        assertTrue("Test",true);
    }

    @Test
    public void testSetIngredientInventoryCount(){
        ingredient.setIngredientInventoryCount(10);
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }

    @Test
    public void testGetIngredientName(){
        assertTrue(ingredient.getIngredientName(),true);
    }

    @Test
    public void testGetIngredientInventoryCount(){
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }

    @Test
    public void testUseIngredient_False(){
        ingredient.useIngredient(1);
        assertFalse(ingredient.getIngredientInventoryCount()<0);
    }

    @Test
    public void testUseIngredient_True(){
        ingredient.useIngredient(1);
        assertTrue(ingredient.getIngredientInventoryCount()>0);
    }

    @Test
    public void testReloadIngredientCount(){
        ingredient.reloadIngredientCount();
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }
}
