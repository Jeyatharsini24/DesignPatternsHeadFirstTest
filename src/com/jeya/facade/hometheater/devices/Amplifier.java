package com.jeya.facade.hometheater.devices;

public class Amplifier
{
  private Dvd dvd;

  private int volume;

  public void on()
  {
    System.out.println("Amplifier is on");
  }

  public void setDvd(Dvd dvd)
  {
    this.dvd = dvd;
  }

  public void setSurroundSound()
  {
    System.out.println("Amplifier surround sound is set");
  }

  public void setVolume(int i)
  {
    this.volume = i;
  }

  public void off()
  {
    System.out.println("Amplifier is off");
  }
}