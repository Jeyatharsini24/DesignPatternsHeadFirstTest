package com.jeya.decorator.coffee;

import com.jeya.decorator.coffee.basebeverages.Beverage;
import com.jeya.decorator.coffee.basebeverages.DarkRoast;
import com.jeya.decorator.coffee.basebeverages.Espressco;
import com.jeya.decorator.coffee.basebeverages.HouseBlend;
import com.jeya.decorator.coffee.condimentdecorators.Mocha;
import com.jeya.decorator.coffee.condimentdecorators.Soy;
import com.jeya.decorator.coffee.condimentdecorators.Whip;

public class CoffeeShop
{

  public static void main(String[] args)
  {
    Beverage beverage = new Espressco();
    System.out.println(beverage.getDescription() + " $" + Math.round(beverage.cost() * 100.0) / 100.0);

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    System.out.println(beverage2.getDescription() + " $" + Math.round(beverage2.cost() * 100.0) / 100.0);

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    System.out.println(beverage3.getDescription() + " $" + Math.round(beverage3.cost() * 100.0) / 100.0);
  }
}