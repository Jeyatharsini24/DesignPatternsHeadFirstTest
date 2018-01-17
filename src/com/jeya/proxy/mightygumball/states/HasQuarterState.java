package com.jeya.proxy.mightygumball.states;

import java.rmi.RemoteException;
import java.util.Random;

import com.jeya.proxy.mightygumball.remote.GumballMachine;

public class HasQuarterState implements State
{
  private transient GumballMachine gumballMachine; // don't serialize this

  private Random randomWinner = new Random(System.currentTimeMillis());

  public HasQuarterState(GumballMachine gumballMachine)
  {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter()
  {
    System.out.println("You can't insert another quarter");
  }

  @Override
  public void ejectQuarter()
  {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank()
  {
    System.out.println("You turned...");
    int winner = randomWinner.nextInt(10);
    try
    {
      if (winner == 0 && gumballMachine.getCount() > 1)
      {
        gumballMachine.setState(gumballMachine.getWinnerState());
      }
      else
      {
        gumballMachine.setState(gumballMachine.getSoldState());
      }
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }

  @Override
  public void dispense()
  {
    System.out.println("No gumball dispensed");
  }
}