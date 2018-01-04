package com.jeya.factory.pizza.nystyle;

import com.jeya.factory.pizza.Pepperoni;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class NyStylePepperoni extends Pepperoni
{
  public NyStylePepperoni(PizzaIngredientFactory pizzaIngredientFactory)
  {
    super(pizzaIngredientFactory);
  }

  @Override
  public void display()
  {
    System.out.println("NyStyle Pepperoni");
  }
}