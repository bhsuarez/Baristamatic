package com.bhsuarez;

import org.junit.Before;

public class DrinkTest {

    Drink drink = null;

    @Before
    public void setUpDrink(){
        drink = new Drink(0,"Drink Name", new Ingredient[]{
                new Ingredient("Name",1,10)});
    }

}
