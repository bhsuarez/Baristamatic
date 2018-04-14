package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;

public class IngredientTest {

    Ingredient ingredient;

    @Before
    public void setUpIngredient(){
        ingredient = new Ingredient("TestName","3.50");
    }

    @Test
    public void SetIngredientCost_Test(){
        double cost = 3;
        ingredient.setIngredientCost(cost);
    }
}
