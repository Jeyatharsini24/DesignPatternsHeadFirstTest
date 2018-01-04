package com.jeya.factory.pizza;

import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza
{
  protected PizzaIngredientFactory pizzaIngredientFactory;

  public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void display()
  {
    System.out.println("Cheese Pizza");
  }

  @Override
  public void prepare()
  {
    System.out.println("Preparing cheese pizza");
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
  }
}