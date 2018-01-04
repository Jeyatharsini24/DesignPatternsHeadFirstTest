package com.jeya.factory.pizza.nystyle;

import com.jeya.factory.pizza.CheesePizza;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class NyStyleCheesePizza extends CheesePizza
{
  public NyStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("NyStyle Cheese Pizza");
  }
}