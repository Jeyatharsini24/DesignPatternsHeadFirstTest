package com.jeya.bridge.remote.withoutbridge;

public class SonyControlRemote extends RemoteControl
{
  private SonyTV sonyTV;
  private int channel;
  
  public SonyControlRemote(SonyTV sonyTV)
  {
    this.sonyTV = sonyTV;
  }

  @Override
  public void on()
  {
    System.out.println("on");
  }

  @Override
  public void off()
  {
    System.out.println("off");
  }

  @Override
  public void setChannel(int channel)
  {
    this.channel = channel;
    tuneChannel(channel);
  }

  private void tuneChannel(int channel)
  {
    sonyTV.tuneChannel(channel);
  }

  @Override
  int getCurrentChannel()
  {
    return channel;
  }
}