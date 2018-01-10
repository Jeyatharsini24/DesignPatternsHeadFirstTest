package com.jeya.command.globalremote.commandreceivers;

public class CeilingFan
{
  private String location;
  public static final int HIGH = 3;
  public static final int MEDIUM = 2;
  public static final int LOW = 1;
  public static final int OFF = 0;
  private int speed;

  public CeilingFan(String location)
  {
    this.location = location;
    this.speed = OFF;
  }

  public void on()
  {
    System.out.println(location + "'s fan is switched on");
  }
  
  public int getSpeed()
  {
    return speed;
  }

  public void off()
  {
    speed = OFF;
    displaySpeed();
  }
  
  public void high()
  {
    speed = HIGH;
    displaySpeed();
  }
  
  public void medium()
  {
    speed = MEDIUM;
    displaySpeed();
  }
  
  public void low()
  {
    speed = LOW;
    displaySpeed();
  }
  
  private void displaySpeed()
  {
    System.out.println("Speed is set to " + speed);
  }
}