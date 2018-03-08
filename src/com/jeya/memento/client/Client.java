package com.jeya.memento.client;

import com.jeya.memento.MasterGameObject;

public class Client {

	public static void main(String[] args) {
		MasterGameObject masterGameObject = new MasterGameObject();
		
		masterGameObject.playGame();
		// when a new level is reached
		Object saved = (Object)masterGameObject.getCurrentState();
		
		// when a restore is required
		masterGameObject.restoreState(saved);
	}
}