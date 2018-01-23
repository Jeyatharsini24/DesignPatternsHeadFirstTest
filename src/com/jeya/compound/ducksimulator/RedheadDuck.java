package com.jeya.compound.ducksimulator;

public class RedheadDuck implements Quackable
{
  private Observable observable;

  public RedheadDuck()
  {
    observable = new Observable(this);
  }

  @Override
  public void registerObserver(Observer observer)
  {
    observable.registerObserver(observer);
  }

  @Override
  public void notifyObservers()
  {
    observable.notifyObservers();
  }

  @Override
  public void quack()
  {
    System.out.println("RedheadDuck Quack");
    notifyObservers();
  }
}