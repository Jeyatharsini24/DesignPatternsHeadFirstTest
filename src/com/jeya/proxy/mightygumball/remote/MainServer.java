package com.jeya.proxy.mightygumball.remote;

import java.rmi.Naming;
import java.rmi.RemoteException;

import com.jeya.proxy.mightygumball.client.GumballMonitor;

public class MainServer
{
  public static void main(String[] args)
  {
    int count = 0;
    /* if(args.length < 2)
    {
      System.out.println("Gumball machine <name><inventory>");
      System.exit(1);
    }*/
    try
    {
      MyRemote service = new MyRemoteImpl();
      Naming.rebind("RemoteHello", service);
      System.out.println("Server is ready...");
    }
    catch (Exception e)
    {
      System.out.println("Server is not ready...");
    }

    count = 112;
    GumballMachine gumballMachine = null;
    try
    {
      gumballMachine = new GumballMachine("location1", count);
    }
    catch (RemoteException e)
    {
      e.printStackTrace();
    }
    GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);
    gumballMonitor.report();
    
    /**
     * generate stubs and skeletons
     * rmic MyRemoteImpl
     */
  }
}