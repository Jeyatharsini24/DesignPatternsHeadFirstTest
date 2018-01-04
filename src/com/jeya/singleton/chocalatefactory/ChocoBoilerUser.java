package com.jeya.singleton.chocalatefactory;

public class ChocoBoilerUser extends Thread
{
  public void run()
  {
    ChocalateBoiler chocalateBoiler = ChocalateBoiler.getInstance();
    int i = 0;
    while (i < 2)
    {
      chocalateBoiler.fill();
      chocalateBoiler.drain();
      i++;
    }
  }
}
