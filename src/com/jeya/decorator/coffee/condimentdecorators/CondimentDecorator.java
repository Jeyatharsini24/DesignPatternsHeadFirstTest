package com.jeya.decorator.coffee.condimentdecorators;

import com.jeya.decorator.coffee.basebeverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
	
	public abstract double getCostForSize();
}