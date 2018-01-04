package com.jeya.factory.pizzafactory;

import com.jeya.factory.pizza.CheesePizza;
import com.jeya.factory.pizza.ClamPizza;
import com.jeya.factory.pizza.Pepperoni;
import com.jeya.factory.pizza.Pizza;
import com.jeya.factory.pizza.VeggiePizza;

public class SimplePizzaFactory
{
  public Pizza createPizza(String type)
  {
    Pizza pizza = null;
    if ("cheese".equals(type))
    {
      pizza = new CheesePizza(null);
    }
    else if ("pepperoni".equals(type))
    {
      pizza = new Pepperoni(null);
    }
    else if ("clam".equals(type))
    {
      pizza = new ClamPizza(null);
    }
    else if ("veggie".equals(type))
    {
      pizza = new VeggiePizza(null);
    }
    return pizza;
  }
}