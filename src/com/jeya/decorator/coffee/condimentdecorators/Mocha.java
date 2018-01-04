package com.jeya.decorator.coffee.condimentdecorators;

import com.jeya.decorator.coffee.basebeverages.Beverage;

public class Mocha extends CondimentDecorator
{
  protected Beverage beverage;

  public Mocha(Beverage beverage)
  {
    this.beverage = beverage;
  }

  @Override
  public String getDescription()
  {
    return beverage.getDescription() + ", Mocha";
  }

  @Override
  public double cost()
  {
    return beverage.cost() + getCostForSize();
  }

  @Override
  public double getCostForSize()
  {
    switch (getSize())
    {
      case SMALL:
        return 0.07;
      case MEDIUM:
        return 0.14;
      case LARGE:
        return 0.20;
    }
    return 0;
  }
}