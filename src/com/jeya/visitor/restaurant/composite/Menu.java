package com.jeya.visitor.restaurant.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jeya.visitor.restaurant.IVisitor;

public class Menu extends MenuComponent {
	private List<MenuComponent> menuComponents = new ArrayList<>();

	private String name;

	public Menu(String name) {
		this.name = name;
	}

	@Override
	public void add(MenuComponent component) {
		menuComponents.add(component);
	}

	@Override
	public void remove(MenuComponent component) {
		menuComponents.remove(component);
	}

	@Override
	public MenuComponent getChild(int index) {
		return menuComponents.get(index);
	}

	public String getName() {
		return name;
	}

	@Override
	public void print() {
		System.out.println(getName() + ":");
		System.out.println("-----------------------------------------------");
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = iterator.next();
			menuComponent.print();
		}
	}

	@Override
	public Iterator createIterator() {
		return new CompositeIterator(menuComponents.iterator());
	}

	@Override
	public int accept(IVisitor visitor, int state) {
		return visitor.visitComposite(this, state);
	}

	@Override
	public int getCalories() {
		int calories = 0;
		for (MenuComponent menuComponentTemp : menuComponents) {
			calories += menuComponentTemp.getCalories();
		}
		return calories;
	}
}