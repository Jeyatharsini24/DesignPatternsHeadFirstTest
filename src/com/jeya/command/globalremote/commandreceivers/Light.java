package com.jeya.command.globalremote.commandreceivers;

public class Light
{
  private String name;
  public Light(String name)
  {
    this.name = name;
  }

  public void on()
  {
    System.out.println(name + " light is switched on!!");
  }
}