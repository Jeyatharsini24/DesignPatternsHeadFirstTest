package com.jeya.proxy.mightygumball.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote
{
  public MyRemoteImpl() throws RemoteException
  {
    super();
  }

  @Override
  public String sayHello() throws RemoteException
  {
    return "Server says, Hey";
  }
}