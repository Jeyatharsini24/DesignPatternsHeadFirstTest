package com.jeya.iterator.objectvillerestaurant.menu;

import java.util.Iterator;

public interface Menu
{
  Iterator<MenuItem> createIterator();
}