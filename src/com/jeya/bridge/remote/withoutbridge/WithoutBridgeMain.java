package com.jeya.bridge.remote.withoutbridge;

public class WithoutBridgeMain
{
  public static void main(String[] args)
  {
    RemoteControl rcaControlRemote = new RCAControlRemote(new RCATV());
    RemoteControl sonyControlRemote = new SonyControlRemote(new SonyTV());
    
    rcaControlRemote.setChannel(5);
    sonyControlRemote.setChannel(15);
  }
}
