package com.jeya.strategy.ducks;

import com.jeya.strategy.features.FlyBehavior;
import com.jeya.strategy.features.QuackBehavior;

public abstract class Duck {
	private String name;
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Duck(String name) {
		super();
		this.name = name;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void print() {
		System.out.println(name);
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
