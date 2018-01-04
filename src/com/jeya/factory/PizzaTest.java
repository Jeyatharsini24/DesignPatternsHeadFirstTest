package com.jeya.factory;

import com.jeya.factory.pizzastore.NYStylePizzaStore;
import com.jeya.factory.pizzastore.PizzaStore;

public class PizzaTest
{
  public static void main(String[] args)
  {
    PizzaStore pizzaStore = new NYStylePizzaStore();
    pizzaStore.orderPizza("pepperoni");
  }
}