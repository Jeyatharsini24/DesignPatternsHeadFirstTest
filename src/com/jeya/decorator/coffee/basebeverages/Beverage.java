package com.jeya.decorator.coffee.basebeverages;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	protected Size size = Size.SMALL;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public enum Size {
		SMALL, MEDIUM, LARGE
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return size;
	}
}