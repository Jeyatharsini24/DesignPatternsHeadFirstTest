package com.jeya.iterator.objectvillerestaurant.util;

import com.jeya.iterator.objectvillerestaurant.menu.DinnerMenu;
import com.jeya.iterator.objectvillerestaurant.menu.MenuItem;
import com.jeya.iterator.objectvillerestaurant.menu.PancakeHouseMenu;

public class Waitress
{
  private PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();

  private DinnerMenu dinnerMenu = new DinnerMenu();

  public void printMenu()
  {
    Iterator<MenuItem> breakfastIterator = pancakeHouseMenu.createIterator();
    printMenu(breakfastIterator);
    Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
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