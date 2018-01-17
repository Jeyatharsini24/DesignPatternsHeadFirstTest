package com.jeya.proxy.mightygumball.states;

import java.rmi.RemoteException;

import com.jeya.proxy.mightygumball.remote.GumballMachine;

public class SoldState implements State
{
  private transient GumballMachine gumballMachine; // don't serialize this

  public SoldState(GumballMachine gumballMachine)
  {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter()
  {
    System.out.println("Please wait, we're already giving you a gumball");
  }

  @Override
  public void ejectQuarter()
  {
    System.out.println("Sorry, you already turned the crank");
  }

  @Override
  public void turnCrank()
  {
    System.out.println("Turning twice doesn't get you another gumball");
  }

  @Override
  public void dispense()
  {
    gumballMachine.releaseBall();
    try
    {
      if (gumballMachine.getCount() > 0)
      {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
      }
      else
      {
        System.out.println("Oops, out of gumballs!");
        gumballMachine.setState(gumballMachine.getSoldOutState());
      }
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }
}