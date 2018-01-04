package com.jeya.factory.pizza.nystyle;

import com.jeya.factory.pizza.ClamPizza;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class NyStyleClamPizza extends ClamPizza
{
  public NyStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("NyStyle Clam");
  }
}