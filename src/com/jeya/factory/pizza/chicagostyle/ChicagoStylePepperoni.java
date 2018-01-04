package com.jeya.factory.pizza.chicagostyle;

import com.jeya.factory.pizza.Pepperoni;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class ChicagoStylePepperoni extends Pepperoni
{
  public ChicagoStylePepperoni(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("ChicagoStyle Pepperoni");
  }
}