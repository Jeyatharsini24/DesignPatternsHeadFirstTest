package com.jeya.bridge.remote.withbridge;

public abstract class RemoteControl
{
  protected TV implementor;

  protected RemoteControl(TV implementor)
  {
    this.implementor = implementor;
  }

  abstract void on();

  abstract void off();

  abstract void setChannel(int channel);
  
  public void nextChannel()
  {
    setChannel(implementor.getCurrentChannel() + 1);
  }
  // need to add new method : nextChannel
  // adding an abstract method here will not be problematic for TV
}