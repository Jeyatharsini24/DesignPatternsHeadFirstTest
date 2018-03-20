package com.jeya.visitor.restaurant;

import java.util.ArrayList;
import java.util.List;

import com.jeya.visitor.restaurant.composite.Ingredient;
import com.jeya.visitor.restaurant.composite.Menu;
import com.jeya.visitor.restaurant.composite.MenuItem;

public class VisitorTest {

	public static void main(String[] args) {
		Menu panCakeHouseMenu = new Menu("PANCAKE HOUSE MENU");
		Menu dinerMenu = new Menu("DINER MENU");
		Menu cafeMenu = new Menu("CAFE MENU");
		Menu dessertMenu = new Menu("DESSERT MENU");
		MenuItem dessertMenuMenuItem = new MenuItem("Apple Pie",
				"Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59);
		List<Ingredient> ingredientsForApplePie = new ArrayList<>();
		ingredientsForApplePie.add(new Ingredient("apple", 5));
		ingredientsForApplePie.add(new Ingredient("vanilla ice cream", 12));
		ingredientsForApplePie.add(new Ingredient("crust", 3));
		dessertMenuMenuItem.setIngredient(ingredientsForApplePie);
		dessertMenu.add(dessertMenuMenuItem);

		Menu allMenus = new Menu("ALL MENUS");
		allMenus.add(panCakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		MenuItem dinerMenuMenuItem = new MenuItem("Vegetarian BLT",
				"(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
		List<Ingredient> ingredientsForVegetarianBLT = new ArrayList<>();
		ingredientsForVegetarianBLT.add(new Ingredient("bacon", 15));
		ingredientsForVegetarianBLT.add(new Ingredient("lettuce", 6));
		ingredientsForVegetarianBLT.add(new Ingredient("tomato", 9));
		ingredientsForVegetarianBLT.add(new Ingredient("wheat", 8));
		dinerMenuMenuItem.setIngredient(ingredientsForVegetarianBLT);
		dinerMenu.add(dinerMenuMenuItem);
		dinerMenu.add(dessertMenu);

		IVisitor iVisitor = new RestaurantVisitor();
		System.out.println(iVisitor.visitComposite(dessertMenu, 0));
		System.out.println(iVisitor.visitLeaf(dinerMenuMenuItem, 0));
	}
}