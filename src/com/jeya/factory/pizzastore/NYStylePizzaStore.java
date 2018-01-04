package com.jeya.factory.pizzastore;

import com.jeya.factory.pizza.Pizza;
import com.jeya.factory.pizza.nystyle.NyStyleCheesePizza;
import com.jeya.factory.pizza.nystyle.NyStyleClamPizza;
import com.jeya.factory.pizza.nystyle.NyStylePepperoni;
import com.jeya.factory.pizza.nystyle.NyStyleVeggiePizza;
import com.jeya.factory.pizzaingredientsfactory.NyStylePizzaIngredientFactory;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore
{
  @Override
  Pizza createPizza(String type)
  {
    Pizza pizza = null;
    PizzaIngredientFactory pizzaIngredientFactory = new NyStylePizzaIngredientFactory();
    if ("cheese".equals(type))
    {
      pizza = new NyStyleCheesePizza(pizzaIngredientFactory);
    }
    else if ("pepperoni".equals(type))
    {
      pizza = new NyStylePepperoni(pizzaIngredientFactory);
    }
    else if ("clam".equals(type))
    {
      pizza = new NyStyleClamPizza(pizzaIngredientFactory);
    }
    else if ("veggie".equals(type))
    {
      pizza = new NyStyleVeggiePizza(pizzaIngredientFactory);
    }
    return pizza;
  }
}