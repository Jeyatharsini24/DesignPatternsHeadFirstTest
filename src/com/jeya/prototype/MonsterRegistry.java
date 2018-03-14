package com.jeya.prototype;

import java.util.HashMap;
import java.util.Map;

public class MonsterRegistry {
	private Map<String, Monster> monsterMap = new HashMap<>();

	public MonsterRegistry() {
		monsterMap.put("WELL KNOWN MONSTER", new WellKnownMonster());
		monsterMap.put("PLAYER GENERATED MONSTER", new DynamicPlayerGeneratedMonster());
	}

	Monster getMonster(String type) throws CloneNotSupportedException {
		Monster correctMonster = null;
		// find the correct monster
		correctMonster = findCorrectMonster(type);
		return correctMonster.clone();
	}

	private Monster findCorrectMonster(String type) {
		return monsterMap.get(type);
	}
}