package com.jeya.compound;

public class MallardDuck implements Quackable
{
  private Observable observable; // strategy

  public MallardDuck()
  {
    observable = new Observable(this);
  }

  @Override
  public void quack()
  {
    System.out.println("MallardDuck Quack");
    notifyObservers();
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
}