package com.jeya.visitor.htmltag;

public class StyleVisitor implements Visitor {

	@Override
	public void visit(HtmlElement htmlElement) {
		htmlElement.setStartTag(htmlElement.getStartTag().replace(">", " style='width:46px;'>"));
	}

	@Override
	public void visit(HtmlParentElement htmlParentElement) {
		htmlParentElement.setStartTag(htmlParentElement.getStartTag().replace(">", " style='width:58px;'>"));
	}
}