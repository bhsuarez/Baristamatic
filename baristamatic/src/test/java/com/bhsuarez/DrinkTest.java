package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrinkTest {

    private Drink drink = null;

    // Initializer for Drink object
    @Before
    public void setDrink() {
        drink = new Drink(0,"Test",0,false);
    }

    // Test for getDrinkNumber()
    @Test
    public void getDrinkNumber_Zero_True(){
        assertEquals(drink.getDrinkNumber(),0);
    }

    // Test for setDrinkNumber() less than zero
    @Test
    public void setDrinkNumber_Less_Than_Zero(){
        drink.setDrinkNumber(-1);
        assertTrue(drink.getDrinkNumber()<0);
    }

    // Test for setDrinkNumber() out of bounds
    @Test
    public void setDrinkNumber_Greater_Than_Six(){
        drink.setDrinkNumber(7);
        assertTrue(drink.getDrinkNumber()>6);
    }

    // Test for getDrinkName() True
    @Test
    public void getDrinkName_True(){
        assertTrue(drink.getDrinkName(),true);
    }

    // Test for getDrinkName() False
    @Test
    public void getDrinkName_False(){
        assertFalse(drink.getDrinkName(),false);
    }

    // Test for setDrinkName() Null test
    @Test
    public void setDrinkName_Null_Test(){
        drink.setDrinkName(null);
        assertNull(drink.getDrinkName());
    }

    // Test for setDrinkName() Empty test
    @Test
    public void setDrinkName_Empty_Test(){
        drink.setDrinkName("");
        assertEquals(drink.getDrinkName(),"");
    }

    // Test for getDrinkCost() True test
    @Test
    public void getDrinkCost_Zero_True(){
        assertEquals(drink.getDrinkCost(),0,0);
    }

    // Test for setDrinkCost() less than zero
    @Test
    public void setDrinkCost_Less_Than_Zero_Test(){
        drink.setDrinkCost(-1);
        assertTrue(drink.getDrinkCost()<0);
    }

    //Test for getInStock() False
    @Test
    public void getInStock_False(){
        assertFalse(drink.isInStock());
    }

    //Test for getInStock() True
    @Test
    public void getInStock_True(){
        drink.setInStock(true);
        assertTrue(drink.isInStock());
    }
}