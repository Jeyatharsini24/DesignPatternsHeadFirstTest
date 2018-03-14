package com.jeya.prototype;

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Monster monster = MonsterMaker.makeRandomMonster();
		monster.drawMonster();
	}
}