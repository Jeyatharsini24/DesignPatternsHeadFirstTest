package com.jeya.iterator.objectvillerestaurant.util;

import java.util.Iterator;

import com.jeya.iterator.objectvillerestaurant.menu.CafeMenu;
import com.jeya.iterator.objectvillerestaurant.menu.DinerMenu;
import com.jeya.iterator.objectvillerestaurant.menu.Menu;
import com.jeya.iterator.objectvillerestaurant.menu.MenuItem;
import com.jeya.iterator.objectvillerestaurant.menu.PancakeHouseMenu;

public class Waitress
{
  private Menu pancakeHouseMenu = new PancakeHouseMenu();

  private Menu dinnerMenu = new DinerMenu();
  
  private Menu cafeMenu = new CafeMenu();

  public void printMenu()
  {
    System.out.println("Breakfast Menu: ");
    Iterator<MenuItem> breakfastIterator = pancakeHouseMenu.createIterator();
    printMenu(breakfastIterator);
    System.out.println("-------------------------------------------");
    System.out.println("Lunch Menu: ");
    Iterator<MenuItem> dinerIterator = dinnerMenu.createIterator();
    printMenu(dinerIterator);
    System.out.println("-------------------------------------------");
    System.out.println("Dinner Menu: ");
    Iterator<MenuItem> dinnerIterator = cafeMenu.createIterator();
    printMenu(dinnerIterator);
  }
  
  private void printMenuItem(MenuItem menuItem)
  {
    System.out.print(menuItem.getName() + " ");
    System.out.println(menuItem.getPrice() + " ");
    System.out.println(menuItem.getDescription());
  }

  public void printBreakfastMenu()
  {
    Iterator<MenuItem> breakfastIterator = pancakeHouseMenu.createIterator();
    printMenu(breakfastIterator);
  }

  public void printDinnerMenu()
  {
    Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
    printMenu(dinnerIterator);
  }
  
  private void printMenu(Iterator<MenuItem> iterator)
  {
    while (iterator.hasNext())
    {
      MenuItem menuItem = iterator.next();
      printMenuItem(menuItem);
    }
  }

  public void printVegetarianMenu()
  {

  }

  private void isItemVegetarian(String name)
  {
    
  }
}