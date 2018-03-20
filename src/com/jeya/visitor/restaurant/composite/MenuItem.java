package com.jeya.visitor.restaurant.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jeya.visitor.restaurant.IVisitor;

public class MenuItem extends MenuComponent {
	private String name;

	private String description;

	private boolean vegetarian;

	private double price;

	private List<Ingredient> ingredient;

	public MenuItem(String name, String description, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
		ingredient = new ArrayList<>();
	}

	public List<Ingredient> getIngredient() {
		return ingredient;
	}

	public void setIngredient(List<Ingredient> ingredient) {
		this.ingredient = ingredient;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void print() {
		System.out.print(getName() + " ");
		System.out.println(getPrice() + " ");
		System.out.println(getDescription());
	}

	@Override
	public Iterator createIterator() {
		return new NullIterator();
	}

	@Override
	public int accept(IVisitor visitor, int state) {
		return visitor.visitLeaf(this, state);
	}

	@Override
	public int getCalories() {
		int calories = 0;
		for (Ingredient ingredientTemp : ingredient) {
			calories += ingredientTemp.getCalories();
		}
		return calories;
	}
}