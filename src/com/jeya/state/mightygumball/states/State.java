package com.jeya.state.mightygumball.states;

public interface State
{
  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();
}