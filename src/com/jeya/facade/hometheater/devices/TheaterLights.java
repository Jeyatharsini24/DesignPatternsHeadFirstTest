package com.jeya.facade.hometheater.devices;

public class TheaterLights
{
  public void dim(int i)
  {
    System.out.println("Lights are dimmed as " + i);
  }

  public void on()
  {
    System.out.println("Lights are on");
  }
}