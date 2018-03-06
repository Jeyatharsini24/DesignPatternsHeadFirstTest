package com.jeya.interpreter;

public class RightCommand implements Expression, Command {
	private Command successor;

	public RightCommand() {
	}

	public void interpret(String context) {
		if (GrammarToolkit.isRightCommand(context)) {
			System.out.println("interpreting right command");
		}
	}

	@Override
	public void handle(String text) {
		if (GrammarToolkit.isRightCommand(text)) {
			System.out.print("Right command");
		} else {
			successor.handle(text);
		}
	}
}