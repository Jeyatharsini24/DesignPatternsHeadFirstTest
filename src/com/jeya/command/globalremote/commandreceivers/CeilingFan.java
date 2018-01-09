package com.jeya.command.globalremote.commandreceivers;

public class CeilingFan
{
  private String name;

  public CeilingFan(String name)
  {
    this.name = name;
  }

  public void on()
  {
    System.out.println(name + " is switched on");
  }

  public void off()
  {
    System.out.println(name + " is switched off");
  }
}
