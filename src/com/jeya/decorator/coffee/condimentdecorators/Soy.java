package com.jeya.decorator.coffee.condimentdecorators;

import com.jeya.decorator.coffee.basebeverages.Beverage;

public class Soy extends CondimentDecorator {
	protected Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return beverage.cost() + getCostForSize();
	}
	
  @Override
  public double getCostForSize()
  {
    switch (getSize())
    {
      case SMALL:
        return 0.06;
      case MEDIUM:
        return 0.11;
      case LARGE:
        return 0.15;
    }
    return 0;
  }
}