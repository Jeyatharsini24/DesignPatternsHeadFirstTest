package com.jeya.bridge.remote.withbridge;

public class WithBridgeMain
{
  public static void main(String[] args)
  {
    RemoteControl rcaControlRemote = new ConcreteRemote(new RCATV());
    RemoteControl sonyControlRemote = new ConcreteRemote(new SonyTV());

    rcaControlRemote.setChannel(5);
    sonyControlRemote.setChannel(15);
    
    rcaControlRemote.nextChannel();
    sonyControlRemote.nextChannel();
  }
}
// bridge allow to change either side of hierarchies independently (one for remote, other one for platform specific implementation)