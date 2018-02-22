package com.jeya.bridge.remote.withbridge;

public class RCATV extends TV
{
  private int channel;

  public void tuneChannel(int channel)
  {
    this.channel = channel;
    System.out.println(channel + " is set now to RCA TV");
  }

  @Override
  void on()
  {
    System.out.println("RCA TV is switched on");
  }

  @Override
  void off()
  {
    System.out.println("");
  }

  @Override
  int getCurrentChannel()
  {
    return channel;
  }
}