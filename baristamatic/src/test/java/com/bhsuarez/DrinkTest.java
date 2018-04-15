package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrinkTest {

    private Drink drink = null;

    // Initializer for Drink object
    @Before
    public void setDrink() {
        this.drink = new Drink(0,"Test",0,false);
        assertEquals(this.drink,drink);
    }

    // Test for getDrinkNumber()
    @Test
    public void getDrinkNumber_Zero_True(){
        assertTrue(drink.getDrinkNumber()==0);
    }

    // Test for setDrinkNumber()
    @Test
    public void setDrinkNumber_Test(){
        drink.setDrinkNumber(0);
        assertEquals(drink.getDrinkNumber(),0,0);
    }

    // Test for getDrinkName()
    @Test
    public void getDrinkName_Null_True(){
        assertTrue(drink.getDrinkName(),true);
    }

    // Test for setDrinkName()
    @Test
    public void setDrinkName_Test(){
        drink.setDrinkName("Test");
        assertTrue(drink.getDrinkName(),true);
    }

    // Test for getDrinkCost()
    @Test
    public void getDrinkCost_Zero_True(){
        assertTrue(drink.getDrinkCost()==0.0);
    }

    // Test for setDrinkCost()
    @Test
    public void setDrinkCost_Test(){
        drink.setDrinkCost(0.0);
        assertEquals(drink.getDrinkCost(),0,0);
    }

    //Test for getInStock()
    @Test
    public void getInStock_False(){
        assertFalse(drink.isInStock());
    }

    @Test
    //Test for setInStock()
    public void setInStock_Test(){
        drink.setInStock(true);
        assertTrue(drink.isInStock());
    }

}