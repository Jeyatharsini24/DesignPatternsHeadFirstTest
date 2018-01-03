package com.jeya.strategy.ducks;

import com.jeya.strategy.features.FlyNoWay;
import com.jeya.strategy.features.Quack;

public class RubberDuck extends Duck {
	public RubberDuck() {
		super("Rubber Duck");
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
}