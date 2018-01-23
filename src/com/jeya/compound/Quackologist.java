package com.jeya.compound;

public class Quackologist implements Observer
{
  @Override
  public void update(QuackObservable duck)
  {
    System.out.println("Quackologist: " + duck + " just quacked");
  }
}