package com.jeya.command.globalremote.commandreceivers;

public class Hottub
{
  private String location;

  public Hottub(String location)
  {
    super();
    this.location = location;
  }

  public void on()
  {
    System.out.println("Hottub in " + location + " is switched on");
  }
  
  public void off()
  {
    System.out.println("Hottub in " + location + " is switched off");
  }
}