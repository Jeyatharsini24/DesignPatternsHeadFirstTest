package com.jeya.factory.pizzastore;

import com.jeya.factory.pizza.Pizza;
import com.jeya.factory.pizza.chicagostyle.ChicagoStyleCheesePizza;
import com.jeya.factory.pizza.chicagostyle.ChicagoStyleClamPizza;
import com.jeya.factory.pizza.chicagostyle.ChicagoStylePepperoni;
import com.jeya.factory.pizza.chicagostyle.ChicagoStyleVeggiePizza;
import com.jeya.factory.pizzaingredientsfactory.ChicagoStylePizzaIngredientFactory;
import com.jeya.factory.pizzaingredientsfactory.PizzaIngredientFactory;

public class ChicagoStylePizzaStore extends PizzaStore
{
  @Override
  Pizza createPizza(String type)
  {
    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoStylePizzaIngredientFactory();
    Pizza pizza = null;
    if ("cheese".equals(type))
    {
      pizza = new ChicagoStyleCheesePizza(pizzaIngredientFactory);
    }
    else if ("pepperoni".equals(type))
    {
      pizza = new ChicagoStylePepperoni(pizzaIngredientFactory);
    }
    else if ("clam".equals(type))
    {
      pizza = new ChicagoStyleClamPizza(pizzaIngredientFactory);
    }
    else if ("veggie".equals(type))
    {
      pizza = new ChicagoStyleVeggiePizza(pizzaIngredientFactory);
    }
    return pizza;
  }
}