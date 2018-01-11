package com.jeya.command.globalremote.commandreceivers;

public class TV
{
  private String location;

  public TV(String location)
  {
    this.location = location;
  }

  public void on()
  {
    System.out.println("TV in " + location + " is switched on");
  }
  
  public void off()
  {
    System.out.println("TV in " + location + " is switched off");
  }
}