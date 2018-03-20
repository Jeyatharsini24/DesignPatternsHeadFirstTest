package com.jeya.visitor.htmltag;

public interface Element {
	public void accept(Visitor visitor);
}