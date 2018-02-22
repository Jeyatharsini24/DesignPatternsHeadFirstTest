package com.jeya.bridge.remote.withbridge;

public class ConcreteRemote extends RemoteControl
{
  public ConcreteRemote(TV tv)
  {
    super(tv);
  }
  
  @Override
  void on()
  {
    implementor.on();
  }

  @Override
  void off()
  {
    implementor.off();
  }

  @Override
  void setChannel(int channel)
  {
    implementor.tuneChannel(channel);
  }
}