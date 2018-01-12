package com.jeya.composite;

import com.jeya.composite.restaurant.Menu;
import com.jeya.composite.restaurant.MenuComponent;
import com.jeya.composite.restaurant.MenuItem;
import com.jeya.composite.restaurant.Waitress;

public class RestaurantTest
{
  public static void main(String[] args)
  {
    MenuComponent panCakeHouseMenu = new Menu("PANCAKE HOUSE MENU");
    MenuComponent dinerMenu = new Menu("DINER MENU");
    MenuComponent cafeMenu = new Menu("CAFE MENU");
    MenuComponent dessertMenu = new Menu("DESSERT MENU");
    dessertMenu.add(new MenuItem("Apple Pie", "Apple pie with a flakey crust, topped with vanilla icecream", true, 1.59));

    MenuComponent allMenus = new Menu("ALL MENUS");
    allMenus.add(panCakeHouseMenu);
    allMenus.add(dinerMenu);
    allMenus.add(cafeMenu);
    
    dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
    dinerMenu.add(dessertMenu);
    
    Waitress waitress = new Waitress(allMenus);
    waitress.printMenu();
    
    System.out.println("-------------------------------------------------------------------------------------");
    waitress.printVegetarianMenu();
  }
}