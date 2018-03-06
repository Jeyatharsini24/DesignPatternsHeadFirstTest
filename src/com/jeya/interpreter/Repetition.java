package com.jeya.interpreter;

import java.util.StringTokenizer;

public class Repetition implements Expression {
	private Variable variable;
	private Expression expression;

	public void interpret(String context) {
		StringTokenizer st1 = new StringTokenizer(context.trim(), "()");

		int i = 0;
		String keywordString;
		String variableString = null;
		String expressionString = null;
		variable = new Variable();
		expression = new ExpressionImpl();
		while (st1.hasMoreTokens()) {
			switch (i) {
			case 0:
				keywordString = st1.nextToken();
				break;
			case 1:
				variableString = st1.nextToken();
				break;
			case 2:
				expressionString = st1.nextToken();
				break;
			}
			i++;
		}
		System.out.println("\nInterpreting repetition...");
		System.out.print("repeat ");
		expression.interpret(expressionString);
		System.out.print(" when Variable ");
		variable.interpret(variableString);
		System.out.print(" is true\n");
	}
}