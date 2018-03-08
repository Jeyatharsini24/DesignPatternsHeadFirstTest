package com.jeya.memento;

public class MasterGameObject {
	private GameMemento gameState;

	private int currentLevel;

	public MasterGameObject() {
		gameState = new GameMemento();
	}

	public Object getCurrentState() {
		gameState.setLevel(currentLevel);
		// gather state
		return gameState;
	}

	public void restoreState(Object savedState) {
		System.out.println("Current level is set to " + gameState.getLevel());
	}

	public void playGame() {
		System.out.println("Playing game...");
		currentLevel = 24;
		System.out.println("Level is set to " + currentLevel);
		System.out.println("Playing level " + currentLevel);
		System.out.println("Game over");
		System.out.println("****************************************************");
	}
}