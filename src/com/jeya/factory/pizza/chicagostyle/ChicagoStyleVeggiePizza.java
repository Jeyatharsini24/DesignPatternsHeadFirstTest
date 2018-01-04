package com.jeya.factory.pizza.chicagostyle;

import com.jeya.factory.pizza.VeggiePizza;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class ChicagoStyleVeggiePizza extends VeggiePizza
{
  public ChicagoStyleVeggiePizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("ChicagoStyle Veggie Pizza");
  }
}