package com.jeya.bridge.remote.withbridge;

public abstract class TV
{
  abstract void on();

  abstract void off();

  abstract void tuneChannel(int channel);

  abstract int getCurrentChannel();
}