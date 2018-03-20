package com.jeya.visitor.restaurant;

import com.jeya.visitor.restaurant.composite.Menu;
import com.jeya.visitor.restaurant.composite.MenuItem;

public class RestaurantVisitor implements IVisitor {

	@Override
	public int visitComposite(Menu composite, int state) {
		return composite.getCalories();
	}

	@Override
	public int visitLeaf(MenuItem leaf, int state) {
		return leaf.getCalories();
	}
}