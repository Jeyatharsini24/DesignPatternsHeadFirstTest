package com.jeya.factory.pizza.nystyle;

import com.jeya.factory.pizza.VeggiePizza;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class NyStyleVeggiePizza extends VeggiePizza
{
  public NyStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("NyStyle Veggie Pizza");
  }
}