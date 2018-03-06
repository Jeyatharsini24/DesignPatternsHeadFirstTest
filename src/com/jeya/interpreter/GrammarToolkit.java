package com.jeya.interpreter;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

class GrammarToolkit {
	static boolean isFlyCommand(String context) {
		return "fly".equals(context);
	}

	static boolean isCommand(String context) {
		return isFlyCommand(context) || isQuackCommand(context) || isRightCommand(context);
	}

	static boolean isQuackCommand(String context) {
		return "quack".equals(context);
	}

	static boolean isRightCommand(String context) {
		return "right".equals(context);
	}

	static boolean isVariable(String context) {
		Pattern p = Pattern.compile("[A-Z,a-z]+");
		boolean hasSpecialChar = p.matcher(context).find();
		return hasSpecialChar;
	}

	static boolean isRepetition(String context) {
		boolean isRepetition = false;
		boolean containsKeyword = context.trim().contains("while");
		if (!containsKeyword) {
			return false;
		}
		StringTokenizer st1 = new StringTokenizer(context.trim(), "()");

		int i = 0;
		String keyword;
		String variable = null;
		String command = null;
		while (st1.hasMoreTokens()) {
			switch (i) {
			case 0:
				keyword = st1.nextToken();
				break;
			case 1:
				variable = st1.nextToken();
				break;
			case 2:
				command = st1.nextToken();
				break;
			}
			i++;
		}
		if (!isVariable(variable)) {
			return false;
		}
		if (!isCommand(command)) {
			return false;
		}
		isRepetition = true;
		return isRepetition;
	}

	public static boolean isSequence(String token) {
		return false;
	}
}