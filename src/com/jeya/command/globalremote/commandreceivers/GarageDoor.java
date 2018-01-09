package com.jeya.command.globalremote.commandreceivers;

public class GarageDoor
{
  private String name;

  public GarageDoor(String name)
  {
    this.name = name;
  }

  public void up()
  {
    System.out.println(name + " is upped");
  }

  public void down()
  {
    System.out.println(name + " is downed");
  }

  public void stop()
  {
    System.out.println(name + " is stopped");
  }

  public void lightOn()
  {
    System.out.println(name + "'s light is switched on");
  }

  public void lightOff()
  {
    System.out.println(name + "'s light is switched off");
  }
}
