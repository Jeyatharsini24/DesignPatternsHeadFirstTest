package com.jeya.visitor.htmltag;

public class CssClassVisitor implements Visitor {

	@Override
	public void visit(HtmlElement htmlElement) {
		htmlElement.setStartTag(htmlElement.getStartTag().replace(">", " class='visitor'>"));
	}

	@Override
	public void visit(HtmlParentElement htmlParentElement) {
		htmlParentElement.setStartTag(htmlParentElement.getStartTag().replace(">", " class='visitor'>"));
	}
}