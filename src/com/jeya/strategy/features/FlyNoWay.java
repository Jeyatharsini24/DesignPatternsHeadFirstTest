package com.jeya.strategy.features;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Can't fly");
	}
}