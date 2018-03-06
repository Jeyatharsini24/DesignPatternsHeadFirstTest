package com.jeya.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Sequence implements Expression {
	private List<Expression> expressions;

	public Sequence() {
		expressions = new ArrayList<>();
	}

	@Override
	public void interpret(String context) {
	}
}