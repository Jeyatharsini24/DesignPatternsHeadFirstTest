package com.jeya.prototype;

public class WellKnownMonster implements Monster {
	private String type = "WELL KNOWN MONSTER";

	@Override
	public void drawMonster() {
		System.out.println("Draw a well known monster!!");
	}

	public Monster clone() throws CloneNotSupportedException {
		return (Monster) super.clone();
	}
}