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
    System.out.println(name + "'s garage door is upped");
  }

  public void down()
  {
    System.out.println(name + "'s garage door is downed");
  }

  public void stop()
  {
    System.out.println(name + "'s garage door is stopped");
  }

  public void lightOn()
  {
    System.out.println(name + "'s garage door's light is switched on");
  }

  public void lightOff()
  {
    System.out.println(name + "'s garage door's light is switched off");
  }
}
