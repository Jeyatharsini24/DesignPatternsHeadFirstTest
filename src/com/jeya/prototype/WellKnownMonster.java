package com.jeya.prototype;

public class WellKnownMonster implements Monster, Cloneable {
	@Override
	public void drawMonster() {
		System.out.println("Draw a well known monster!!");
	}
}