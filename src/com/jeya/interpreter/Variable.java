package com.jeya.interpreter;

public class Variable implements Expression {
	private String variableName;
	private boolean value;

	public void interpret(String context) {
		if(GrammarToolkit.isVariable(context))
		{
			System.out.print(context);
		}
	}
}