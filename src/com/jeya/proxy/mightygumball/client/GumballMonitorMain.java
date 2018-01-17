package com.jeya.proxy.mightygumball.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.jeya.proxy.mightygumball.remote.GumballMachineRemote;

public class GumballMonitorMain
{
  public static void main(String[] args)
  {
    String[] location = { "rmi://127.0.0.1/gumballMachineMachine1",
        "rmi://boulder.mightygumball.com/gumballmachine", "rmi://seattle.mightygumball.com/gumballmachine" };

    GumballMonitor[] monitors = new GumballMonitor[location.length];
    for (int i = 0; i < 1; i++)// should be for location.length
    {
      GumballMachineRemote machine;
      try
      {
        machine = (GumballMachineRemote) Naming.lookup(location[i]);
        monitors[i] = new GumballMonitor(machine);
        monitors[i].report();
      }
      catch (MalformedURLException e)
      {
        e.printStackTrace();
      }
      catch (RemoteException e)
      {
        e.printStackTrace();
      }
      catch (NotBoundException e)
      {
        e.printStackTrace();
      }
    }
  }
}