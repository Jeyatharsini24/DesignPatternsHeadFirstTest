package com.jeya.visitor.restaurant.composite;

import java.util.Iterator;

import com.jeya.visitor.restaurant.IVisitor;

public abstract class MenuComponent {
	public abstract Iterator createIterator();

	public abstract int accept(IVisitor visitor, int state);

	public abstract int getCalories();

	public String getName() {
		throw new UnsupportedOperationException("GetDescription not supported");
	}

	public String getDescription() {
		throw new UnsupportedOperationException("GetDescription not supported");
	}

	public double getPrice() {
		throw new UnsupportedOperationException("GetPrice not supported");
	}

	public boolean isVegetarian() {
		throw new UnsupportedOperationException("IsVegetarian not supported");
	}

	public void print() {
		throw new UnsupportedOperationException("Print not supported");
	}

	public void add(MenuComponent component) {
		throw new UnsupportedOperationException("Add not supported");
	}

	public void remove(MenuComponent component) {
		throw new UnsupportedOperationException("Remove not supported");
	}

	public MenuComponent getChild(int index) {
		throw new UnsupportedOperationException("GetChild not supported");
	}
}