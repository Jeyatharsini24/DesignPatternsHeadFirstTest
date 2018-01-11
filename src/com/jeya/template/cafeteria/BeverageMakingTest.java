package com.jeya.template.cafeteria;

import com.jeya.template.cafeteria.beverages.Coffee;
import com.jeya.template.cafeteria.beverages.CoffeeWithHook;
import com.jeya.template.cafeteria.beverages.Tea;

public class BeverageMakingTest
{
  public static void main(String[] args)
  {
    Tea myTea = new Tea();
    myTea.prepareRecipe();
    
    System.out.println("--------------------------");
    
    Coffee myCoffee = new Coffee();
    myCoffee.prepareRecipe();
    
    System.out.println("--------------------------");

    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
    coffeeWithHook.prepareRecipe();
  }
}