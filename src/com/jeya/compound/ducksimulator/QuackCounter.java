package com.jeya.compound.ducksimulator;

public class QuackCounter implements Quackable
{
  private Quackable quackable;

  private static int quackCount = 0;
  
  public QuackCounter(Quackable quackable)
  {
    this.quackable = quackable;
  }

  @Override
  public void quack()
  {
    quackable.quack();
    quackCount++; // not notified
  }

  public static int getQuacks()
  {
    return quackCount;
  }
  
  @Override
  public void registerObserver(Observer observer)
  {
    quackable.registerObserver(observer); // delegate methods
  }

  @Override
  public void notifyObservers()
  {
    quackable.notifyObservers();
  }
}