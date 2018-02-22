package com.jeya.bridge.remote.withoutbridge;

public class RCAControlRemote extends RemoteControl
{
  private RCATV rcATV;
  private int channel;
  
  public RCAControlRemote(RCATV rcATV)
  {
    this.rcATV = rcATV;
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
    rcATV.tuneChannel(channel);
  }

  @Override
  int getCurrentChannel()
  {
    return channel;
  }
}