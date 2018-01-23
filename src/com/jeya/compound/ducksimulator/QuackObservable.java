package com.jeya.compound.ducksimulator;

public interface QuackObservable
{
  void registerObserver(Observer observer);

  void notifyObservers();
}