package com.jeya.proxy.mightygumball.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote // Remote is a marker interface: no methods
{
  String sayHello() throws RemoteException; // arguments and return values are primitives or serializable
}