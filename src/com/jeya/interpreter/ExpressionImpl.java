package com.jeya.interpreter;

public class ExpressionImpl implements Expression{
	@Override
	public void interpret(String token) {
		if(GrammarToolkit.isRepetition(token))
		{
			Expression repetition = new Repetition();
			repetition.interpret(token);
		}
		else if(GrammarToolkit.isSequence(token))
		{
			Expression repetition = new Sequence();
			repetition.interpret(token);
		}
		else if(GrammarToolkit.isCommand(token))
		{
			Expression repetition = new FlyCommand();
			repetition.interpret(token);
		}
	}
}