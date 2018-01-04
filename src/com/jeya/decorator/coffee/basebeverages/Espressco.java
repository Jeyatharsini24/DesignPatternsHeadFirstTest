package com.jeya.decorator.coffee.basebeverages;

public class Espressco extends Beverage {
	public Espressco() {
		description = "Espressco";
	}

	@Override
	public double cost() {
		return 1.99;
	}
}