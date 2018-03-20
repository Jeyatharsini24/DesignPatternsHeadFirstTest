package com.jeya.visitor.restaurant;

import com.jeya.visitor.restaurant.composite.Menu;
import com.jeya.visitor.restaurant.composite.MenuItem;

public interface IVisitor {
	int visitComposite(Menu composite, int state);

	int visitLeaf(MenuItem leaf, int state);
}