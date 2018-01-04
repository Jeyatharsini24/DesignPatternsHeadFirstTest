package com.jeya.factory.pizza;

import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza
{
  private PizzaIngredientFactory pizzaIngredientFactory;

  public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory)
  {
    this.pizzaIngredientFactory = pizzaIngredientFactory;
  }

  @Override
  public void display()
  {
    System.out.println("Veggie Pizza");
  }

  @Override
  public void prepare()
  {
    System.out.println("Preparing veggie pizza");
    dough = pizzaIngredientFactory.createDough();
    sauce = pizzaIngredientFactory.createSauce();
    cheese = pizzaIngredientFactory.createCheese();
    veggies = pizzaIngredientFactory.createVeggies();
  }
}