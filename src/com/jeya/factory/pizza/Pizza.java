package com.jeya.factory.pizza;

import com.jeya.factory.pizzaingredients.Cheese;
import com.jeya.factory.pizzaingredients.Clams;
import com.jeya.factory.pizzaingredients.Dough;
import com.jeya.factory.pizzaingredients.Pepperoni;
import com.jeya.factory.pizzaingredients.Sauce;
import com.jeya.factory.pizzaingredients.Veggies;

public abstract class Pizza
{
  protected Dough dough;

  protected Sauce sauce;

  protected Veggies[] veggies;

  protected Cheese cheese;

  protected Pepperoni pepperoni;

  protected Clams clam;

  public abstract void display();
  
  public abstract void prepare();

  /*public void prepare()
  {
    System.out.println("Preparing...");
    System.out.println("Tossing dough...");
    System.out.println("Adding sauce");
    System.out.println("Adding toppings...");
  }*/

  public void bake()
  {
    System.out.println("Baking...");
  }

  public void cut()
  {
    System.out.println("Cutting...");
  }

  public void box()
  {
    System.out.println("Boxing...");
  }
}