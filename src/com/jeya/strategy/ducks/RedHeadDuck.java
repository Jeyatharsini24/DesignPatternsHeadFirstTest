package com.jeya.strategy.ducks;

import com.jeya.strategy.features.FlyWithWings;
import com.jeya.strategy.features.Quack;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		super("Red Head Duck");
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}