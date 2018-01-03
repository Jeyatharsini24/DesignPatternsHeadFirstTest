package com.jeya.strategy.features;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak Squeak!!");
	}
}