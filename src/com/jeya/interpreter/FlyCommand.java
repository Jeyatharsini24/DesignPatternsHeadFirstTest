package com.jeya.interpreter;

public class FlyCommand implements Expression, Command {
	private Command successor;

	public FlyCommand() {
		successor = new QuackCommand();
	}

	public void interpret(String context) {
		handle(context);
	}

	@Override
	public void handle(String text) {
		if (GrammarToolkit.isFlyCommand(text)) {
			System.out.print("Fly command");
		} else {
			successor.handle(text);
		}
	}
}