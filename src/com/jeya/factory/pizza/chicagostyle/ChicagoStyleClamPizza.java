package com.jeya.factory.pizza.chicagostyle;

import com.jeya.factory.pizza.ClamPizza;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends ClamPizza
{
  public ChicagoStyleClamPizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("ChicagoStyle Clam");
  }
}