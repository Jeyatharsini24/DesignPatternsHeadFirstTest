package com.jeya.prototype;

public class DynamicPlayerGeneratedMonster implements Monster {
	private String type = "PLAYER GENERATED MONSTER";

	@Override
	public void drawMonster() {
		System.out.println("Draw a dynamic player generated monster!!");
	}

	public Monster clone() throws CloneNotSupportedException {
		return (Monster) super.clone();
	}
}