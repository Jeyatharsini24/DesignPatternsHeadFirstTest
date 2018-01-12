package com.jeya.composite.restaurant;

import java.util.Iterator;

public class NullIterator implements Iterator
{
  @Override
  public boolean hasNext()
  {
    return false;
  }

  @Override
  public Object next()
  {
    return null;
  }
}