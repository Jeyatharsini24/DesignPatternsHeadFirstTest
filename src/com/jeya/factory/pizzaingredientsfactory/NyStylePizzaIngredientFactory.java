package com.jeya.factory.pizzaingredientsfactory;

import com.jeya.factory.pizzaingredients.Cheese;
import com.jeya.factory.pizzaingredients.Clams;
import com.jeya.factory.pizzaingredients.Dough;
import com.jeya.factory.pizzaingredients.FreshClams;
import com.jeya.factory.pizzaingredients.Garlic;
import com.jeya.factory.pizzaingredients.MarinaraSauce;
import com.jeya.factory.pizzaingredients.Mushroom;
import com.jeya.factory.pizzaingredients.Onion;
import com.jeya.factory.pizzaingredients.Pepperoni;
import com.jeya.factory.pizzaingredients.RedPepper;
import com.jeya.factory.pizzaingredients.ReggianoSauce;
import com.jeya.factory.pizzaingredients.Sauce;
import com.jeya.factory.pizzaingredients.SlicedPepperoni;
import com.jeya.factory.pizzaingredients.ThinCrustDough;
import com.jeya.factory.pizzaingredients.Veggies;

public class NyStylePizzaIngredientFactory implements PizzaIngredientFactory
{

  @Override
  public Dough createDough()
  {
    return new ThinCrustDough();
  }

  @Override
  public Sauce createSauce()
  {
    return new MarinaraSauce();
  }

  @Override
  public Cheese createCheese()
  {
    return new ReggianoSauce();
  }

  @Override
  public Veggies[] createVeggies()
  {
    return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
  }

  @Override
  public Pepperoni createPepperoni()
  {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam()
  {
    return new FreshClams();
  }
}