package com.jeya.factory.pizza;

import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class Pepperoni extends Pizza
{
  private PizzaIngredientFactory pizzaIngredientFactory;

  public Pepperoni(PizzaIngredientFactory pizzaIngredientFactory)
  {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void display()
  {
    System.out.println("Pepperoni");
  }

  @Override
  public void prepare()
  {
    System.out.println("Preparing pepperoni pizza");
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    pepperoni = pizzaIngredientFactory.createPepperoni();
  }
}