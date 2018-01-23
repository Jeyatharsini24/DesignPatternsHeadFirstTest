package com.jeya.compound.ducksimulator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable
{
  private List<Quackable> quackers = new ArrayList<>();
  
  public Flock()
  {
    
  }

  @Override
  public void quack()
  {
    Iterator<Quackable>iterator = quackers.iterator();
    while(iterator.hasNext())
    {
      Quackable quacker = iterator.next();
      quacker.quack();
    }
  }

  public void add(Quackable quacker)
  {
    quackers.add(quacker);
  }
  
  @Override
  public void registerObserver(Observer observer)
  {
    Iterator<Quackable>iterator = quackers.iterator();
    while(iterator.hasNext())
    {
      Quackable quacker = iterator.next();
      quacker.registerObserver(observer);
    }
  }

  @Override
  public void notifyObservers()
  {
    
  }
}