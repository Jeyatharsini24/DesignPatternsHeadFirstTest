package com.jeya.factory.pizzaingredientsfactory;

import com.jeya.factory.pizzaingredients.BlackOlives;
import com.jeya.factory.pizzaingredients.Cheese;
import com.jeya.factory.pizzaingredients.Clams;
import com.jeya.factory.pizzaingredients.Dough;
import com.jeya.factory.pizzaingredients.EggPlant;
import com.jeya.factory.pizzaingredients.FrozenClam;
import com.jeya.factory.pizzaingredients.MozzarellaCheese;
import com.jeya.factory.pizzaingredients.Pepperoni;
import com.jeya.factory.pizzaingredients.PlumTomatoSauce;
import com.jeya.factory.pizzaingredients.Sauce;
import com.jeya.factory.pizzaingredients.SlicedPepperoni;
import com.jeya.factory.pizzaingredients.Spinach;
import com.jeya.factory.pizzaingredients.ThickCrustDough;
import com.jeya.factory.pizzaingredients.Veggies;

public class ChicagoStylePizzaIngredientFactory implements PizzaIngredientFactory
{

  @Override
  public Dough createDough()
  {
    return new ThickCrustDough();
  }

  @Override
  public Sauce createSauce()
  {
    return new PlumTomatoSauce();
  }

  @Override
  public Cheese createCheese()
  {
    return new MozzarellaCheese();
  }

  @Override
  public Veggies[] createVeggies()
  {
    return new Veggies[]{new EggPlant(), new Spinach(), new BlackOlives()};
  }

  @Override
  public Pepperoni createPepperoni()
  {
    return new SlicedPepperoni();
  }

  @Override
  public Clams createClam()
  {
    return new FrozenClam();
  }
}