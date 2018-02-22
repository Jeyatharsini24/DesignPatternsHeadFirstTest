package com.jeya.bridge.remote.withoutbridge;

public abstract class RemoteControl
{
  abstract int getCurrentChannel();

  abstract void on();

  abstract void off();

  abstract void setChannel(int channel);
  
  // can change only TV, not remote.
  // need to add new method : nextChannel
  // adding an abstract method here will be problematic. needed to make changes
  // in all implementation of remote as well. changes don't affect client
}