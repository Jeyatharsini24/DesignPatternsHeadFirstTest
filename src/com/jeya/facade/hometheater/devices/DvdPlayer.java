package com.jeya.facade.hometheater.devices;

public class DvdPlayer
{
  public void on()
  {
    System.out.println("Dvd player is on");
  }

  public void play(String movie)
  {
    System.out.println(movie + " is playing now");
  }

  public void stop()
  {
    System.out.println("DvdPlayer is stopped now");
  }

  public void eject()
  {
    System.out.println("DvdPlayer is ejected now");
  }

  public void off()
  {
    System.out.println("DvdPlayer is off now");
  }
}