package com.jeya.command.globalremote.commandreceivers;

public class CDPlayer
{
  private String name;

  public CDPlayer(String name)
  {
    this.name = name;
  }

  public void play()
  {
    System.out.println(name + " is playing");
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
}