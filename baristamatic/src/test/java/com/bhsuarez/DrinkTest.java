package com.bhsuarez;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DrinkTest {

    Drink drink = null;

    @Before
    public void setUpDrink(){
        drink = new Drink(-1,"Drink Name", new Ingredient[]{
                new Ingredient("Name",10)});
    }
}
