package com.jeya.prototype;

public class MonsterMaker {
	public static Monster makeRandomMonster() throws CloneNotSupportedException {
		String type = getRandomType();
		Monster m = new MonsterRegistry().getMonster(type);
		return m;
	}

	private static String getRandomType() {
		int random = getRandomNumber();
		switch (random) {
		case 0:
			return "WELL KNOWN MONSTER";
		case 1:
			return "PLAYER GENERATED MONSTER";
		}
		return "WELL KNOWN MONSTER";
	}

	private static int getRandomNumber() {
		return (int) (Math.random() * 1000) % 2;
	}
}