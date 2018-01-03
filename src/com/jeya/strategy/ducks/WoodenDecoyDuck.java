package com.jeya.strategy.ducks;

import com.jeya.strategy.features.FlyNoWay;
import com.jeya.strategy.features.MuteQuack;

public class WoodenDecoyDuck extends Duck {
	public WoodenDecoyDuck() {
		super("Wooden Decoy Duck");
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
}