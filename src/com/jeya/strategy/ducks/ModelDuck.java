package com.jeya.strategy.ducks;

import com.jeya.strategy.features.FlyNoWay;
import com.jeya.strategy.features.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super("Model Duck");
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
}