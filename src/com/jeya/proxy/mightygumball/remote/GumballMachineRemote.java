package com.jeya.proxy.mightygumball.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.jeya.proxy.mightygumball.states.State;

public interface GumballMachineRemote extends Remote
{
  public int getCount() throws RemoteException;

  public String getLocation() throws RemoteException;

  public State getCurrentState() throws RemoteException;
}