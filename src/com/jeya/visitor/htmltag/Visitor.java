package com.jeya.visitor.htmltag;

public interface Visitor {
	void visit(HtmlElement htmlElement);

	void visit(HtmlParentElement htmlParentElement);
}