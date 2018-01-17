package com.jeya.proxy.mightygumball.remote;

import java.rmi.Naming;

public class GumballMachineServer
{
  public static void main(String[] args)
  {
    GumballMachineRemote gumballMachine = null;
    int count = 0;
    /* if(args.length < 2)
    {
      System.out.println("Gumball machine <name><inventory>");
      System.exit(1);
    }*/
    count = 112;
    try
    {
      gumballMachine = new GumballMachine("location1", count);
      Naming.rebind("gumballMachineMachine1", gumballMachine);
      System.out.println("Server is ready...");
    }
    catch (Exception e)
    {
      e.printStackTrace();
      System.out.println("Server is not ready...");
    }
  }
}