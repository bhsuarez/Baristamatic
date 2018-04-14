package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class IngredientTest {

    private Ingredient ingredient = null;

    @Before
    public void setUpIngredient(){
        ingredient = new Ingredient("TestName",3.5,10);
    }

    @Test
    public void testSetIngredientCost(){
        ingredient.setIngredientCost(3);
    }

    @Test
    public void testSetIngredientName(){
        ingredient.setIngredientName("Test");
    }

    @Test
    public void testSetIngredientInventoryCount(){
        ingredient.setIngredientInventoryCount(10);
    }

    @Test
    public void testGetIngredientName(){
        assertTrue(ingredient.getIngredientName(),true);
    }

    @Test
    public void testGetIngredientCost(){
        assertEquals(ingredient.getIngredientCost(),3.5,0);
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
    public void testReloadIngredient(){
        ingredient.reloadIngredient();
        assertEquals(ingredient.getIngredientInventoryCount(),10,0);
    }
}
