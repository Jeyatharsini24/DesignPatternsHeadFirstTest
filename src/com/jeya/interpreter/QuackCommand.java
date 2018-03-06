package com.jeya.interpreter;

public class QuackCommand implements Expression, Command {
	private Command successor;

	public QuackCommand() {
		successor = new RightCommand();
	}

	public void interpret(String context) {
		if (GrammarToolkit.isQuackCommand(context)) {
			System.out.println("interpreting quack command");
		}
	}

	@Override
	public void handle(String text) {
		if (GrammarToolkit.isQuackCommand(text)) {
			System.out.print("Quack command");
		} else {
			successor.handle(text);
		}
	}
}