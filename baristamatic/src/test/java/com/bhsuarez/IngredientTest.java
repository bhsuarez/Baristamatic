package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    private Ingredient ingredient = null;

    // Initializer for ingredient object
    @Before
    public void setUpIngredient(){
        ingredient = new Ingredient(0,"Name",10);
    }

    // Test for getIngredientName() is true
    @Test
    public void testGetIngredientName_True(){
        assertTrue(ingredient.getIngredientName(),true);
    }

    // Test for getIngredientName() is false
    @Test
    public void testGetIngredientName_False(){
        assertFalse(ingredient.getIngredientName(),false);
    }

    // Test for setIngredientName() is null
    @Test
    public void testSetIngredientName_Null(){
        ingredient.setIngredientName(null);
        assertNull(ingredient.getIngredientName());
    }

    // Test for setIngredientName() is not null
    @Test
    public void testSetIngredientName_Empty(){
        ingredient.setIngredientName("");
        assertEquals(ingredient.getIngredientName(),"");
    }

    //  Test for setIngredientInventoryCount() less than zero
    @Test
    public void testSetIngredientInventoryCount_Less_Than_Zero(){
        ingredient.setIngredientInventoryCount(-1);
        assertTrue(ingredient.getIngredientInventoryCount()<0);
    }

    // Test for setIngredientInventoryCount greater than 10
    @Test
    public void testSetIngredientInventoryCount_Greater_Than_Ten(){
        ingredient.setIngredientInventoryCount(11);
        assertTrue(ingredient.getIngredientInventoryCount()>10);
    }

    // Test for getIngredientInventoryCount()
    @Test
    public void testGetIngredientInventoryCount_True(){
        assertEquals(ingredient.getIngredientInventoryCount(),20,10);
    }

    // Test for useIngredient() more than getIngredientInventoryCount value
    @Test
    public void testUseIngredient_More_Than_InventoryCount(){
        ingredient.useIngredient(ingredient.getIngredientInventoryCount());
        assertEquals(ingredient.getIngredientInventoryCount(),0);
    }

    // Test for reloadIngredientCount
    @Test
    public void testReloadIngredientCount_True(){
        ingredient.reloadIngredientCount();
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }
}
