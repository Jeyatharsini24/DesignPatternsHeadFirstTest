package com.jeya.factory.pizza;

import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza
{
  private PizzaIngredientFactory pizzaIngredientFactory;

  public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void display()
  {
    System.out.println("Clam");
  }

  @Override
  public void prepare()
  {
    System.out.println("Preparing clam pizza");
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    clam = pizzaIngredientFactory.createClam();
  }
}