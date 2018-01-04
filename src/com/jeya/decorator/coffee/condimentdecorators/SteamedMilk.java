package com.jeya.decorator.coffee.condimentdecorators;

import com.jeya.decorator.coffee.basebeverages.Beverage;

public class SteamedMilk extends CondimentDecorator
{
  protected Beverage beverage;

  public SteamedMilk(Beverage beverage)
  {
    this.beverage = beverage;
  }

  @Override
  public String getDescription()
  {
    return beverage.getDescription() + ", Steamed Milk";
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
        return 0.04;
      case MEDIUM:
        return 0.08;
      case LARGE:
        return 0.10;
    }
    return 0;
  }
}