package com.jeya.proxy.mightygumball.client;

import java.rmi.RemoteException;

import com.jeya.proxy.mightygumball.remote.GumballMachineRemote;

public class GumballMonitor
{
  private GumballMachineRemote gumballMachine;

  public GumballMonitor(GumballMachineRemote machine)
  {
    this.gumballMachine = machine;
  }

  public void report()
  {
    try
    {
      System.out.println("Gumball Machine: " + gumballMachine.getLocation());
      System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
      System.out.println("Current state: " + gumballMachine.getCurrentState());
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
  }
}