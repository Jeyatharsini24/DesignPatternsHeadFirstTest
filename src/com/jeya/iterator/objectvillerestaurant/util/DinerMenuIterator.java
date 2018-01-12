package com.jeya.iterator.objectvillerestaurant.util;

import com.jeya.iterator.objectvillerestaurant.menu.MenuItem;

public class DinerMenuIterator implements Iterator<MenuItem>
{

  private MenuItem[] items;

  private int position = 0;

  public DinerMenuIterator(MenuItem[] items)
  {
    super();
    this.items = items;
  }

  @Override
  public boolean hasNext()
  {
    if (position >= items.length || items[position] == null)
    {
      return false;
    }
    else
    {
      return true;
    }
  }

  @Override
  public MenuItem next()
  {
    MenuItem menuItem = items[position];
    position++;
    return menuItem;
  }
}