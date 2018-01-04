package com.jeya.factory.pizzaingredientsfactory;

import com.jeya.factory.pizzaingredients.Cheese;
import com.jeya.factory.pizzaingredients.Clams;
import com.jeya.factory.pizzaingredients.Dough;
import com.jeya.factory.pizzaingredients.Pepperoni;
import com.jeya.factory.pizzaingredients.Sauce;
import com.jeya.factory.pizzaingredients.Veggies;

public interface PizzaIngredientFactory
{
  Dough createDough();
  
  Sauce createSauce();
  
  Cheese createCheese();
  
  Veggies[] createVeggies();
  
  Pepperoni createPepperoni();
  
  Clams createClam();
}
