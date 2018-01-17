package com.jeya.proxy.mightygumball;

import com.jeya.proxy.mightygumball.states.HasQuarterState;
import com.jeya.proxy.mightygumball.states.NoQuarterState;
import com.jeya.proxy.mightygumball.states.SoldOutState;
import com.jeya.proxy.mightygumball.states.SoldState;
import com.jeya.proxy.mightygumball.states.State;
import com.jeya.proxy.mightygumball.states.WinnerState;

public class GumballMachine
{
  private State soldOutState;

  private State noQuarterState;

  private State hasQuarterState;

  private State soldState;

  private State currentState = soldOutState;

  private State winnerState;

  private int count = 0;

  private String location;

  public GumballMachine(String location, int numberOfGumballs)
  {
    soldOutState = new SoldOutState(this);
    noQuarterState = new NoQuarterState(this);
    hasQuarterState = new HasQuarterState(this);
    soldState = new SoldState(this);
    winnerState = new WinnerState(this);
    this.count = numberOfGumballs;
    if (numberOfGumballs > 0)
    {
      currentState = noQuarterState;
    }
    this.location = location;
  }

  public void insertQuarter()
  {
    currentState.insertQuarter();
  }

  public void ejectQuarter()
  {
    currentState.ejectQuarter();
  }

  public void turnCrank()
  {
    currentState.turnCrank();
    currentState.dispense();
  }

  public void releaseBall()
  {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0)
    {
      count = count - 1;
    }
  }

  public State getWinnerState()
  {
    return winnerState;
  }

  public State getHasQuarterState()
  {
    return hasQuarterState;
  }

  public State getSoldOutState()
  {
    return soldOutState;
  }

  public State getNoQuarterState()
  {
    return noQuarterState;
  }

  public State getSoldState()
  {
    return soldState;
  }

  public void setState(State state)
  {
    currentState = state;
  }

  public int getCount()
  {
    return count;
  }

  public void refill(int count)
  {
    this.count = count;
    currentState = noQuarterState;
  }

  public String getLocation()
  {
    return location;
  }

  public State getCurrentState()
  {
    return currentState;
  }
}