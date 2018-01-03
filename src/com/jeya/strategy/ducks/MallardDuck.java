package com.jeya.strategy.ducks;

import com.jeya.strategy.features.FlyWithWings;
import com.jeya.strategy.features.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		super("Mallard Duck");
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
}