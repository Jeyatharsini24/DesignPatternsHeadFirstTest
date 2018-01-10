package com.jeya.command.globalremote.commandreceivers;

public class Stereo
{
  private String name;

  public Stereo(String name)
  {
    this.name = name;
  }

  public void setVolume(int volume)
  {
    System.out.println(name + "'s volume is " + volume);
  }

  public void on()
  {
    System.out.println(name + " is switched on");
  }

  public void stop()
  {
    System.out.println(name + " is stopped");
  }

  public void off()
  {
    System.out.println(name + " is switched off");
  }

  public void setCD()
  {
    System.out.println("CD is set to " + name);
  }
}