package com.jeya.strategy;

import com.jeya.strategy.ducks.Duck;
import com.jeya.strategy.ducks.MallardDuck;
import com.jeya.strategy.features.FlyRocketPowered;
import com.jeya.strategy.features.MuteQuack;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.print();
		mallard.performQuack();
		mallard.performFly();
		mallard.setFlyBehavior(new FlyRocketPowered());
		mallard.setQuackBehavior(new MuteQuack());
		mallard.performQuack();
		mallard.performFly();
	}
}