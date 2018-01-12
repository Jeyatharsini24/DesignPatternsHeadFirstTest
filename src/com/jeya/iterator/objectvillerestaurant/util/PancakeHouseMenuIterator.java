package com.jeya.iterator.objectvillerestaurant.util;

import java.util.List;

import com.jeya.iterator.objectvillerestaurant.menu.MenuItem;

public class PancakeHouseMenuIterator implements Iterator<MenuItem>
{
  private int position;

  private List<MenuItem> menuItems;

  public PancakeHouseMenuIterator(List<MenuItem> menuItems)
  {
    super();
    this.menuItems = menuItems;
  }

  @Override
  public boolean hasNext()
  {
    if (position >= menuItems.size() || menuItems.get(position) == null)
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
    MenuItem item = menuItems.get(position);
    position++;
    return item;
  }
}