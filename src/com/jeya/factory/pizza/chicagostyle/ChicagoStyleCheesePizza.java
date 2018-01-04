package com.jeya.factory.pizza.chicagostyle;

import com.jeya.factory.pizza.CheesePizza;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class ChicagoStyleCheesePizza extends CheesePizza
{
  public ChicagoStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("ChicagoStyle Cheese Pizza");
  }
}