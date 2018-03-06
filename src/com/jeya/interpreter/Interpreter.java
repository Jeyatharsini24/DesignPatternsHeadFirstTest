package com.jeya.interpreter;

import java.util.StringTokenizer;

public class Interpreter {
	private String text;

	public Interpreter(String text) {
		this.text = text;
		preprocess();
		process();
	}

	void process() {
		StringTokenizer st1 = new StringTokenizer(text.trim(), ";");
		Expression expression = new ExpressionImpl();
		while (st1.hasMoreTokens()) {
			String token = st1.nextToken();
			expression.interpret(token);
		}
	}

	private void preprocess() {
		text = text.trim();
		text = text.replace(" ", "");
		text = text.replace("\n", "");
		//System.out.println(text);
	}
}