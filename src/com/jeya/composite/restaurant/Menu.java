package com.jeya.composite.restaurant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent
{
  private List<MenuComponent> menuComponents = new ArrayList<>();

  private String name;

  public Menu(String name)
  {
    this.name = name;
  }

  @Override
  public void add(MenuComponent component)
  {
    menuComponents.add(component);
  }

  @Override
  public void remove(MenuComponent component)
  {
    menuComponents.remove(component);
  }

  @Override
  public MenuComponent getChild(int index)
  {
    return menuComponents.get(index);
  }

  public String getName()
  {
    return name;
  }

  @Override
  public void print()
  {
    System.out.println(getName() + ":");
    System.out.println("-----------------------------------------------");
    Iterator<MenuComponent> iterator = menuComponents.iterator();
    while (iterator.hasNext())
    {
      MenuComponent menuComponent = iterator.next();
      menuComponent.print();
    }
  }

  @Override
  public Iterator createIterator()
  {
    return new CompositeIterator(menuComponents.iterator());
  }
}