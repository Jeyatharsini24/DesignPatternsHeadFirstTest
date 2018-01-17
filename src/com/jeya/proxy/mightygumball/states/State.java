package com.jeya.proxy.mightygumball.states;

public interface State
{
  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();
}