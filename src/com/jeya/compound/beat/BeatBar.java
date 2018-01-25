package com.jeya.compound.beat;

import javax.swing.JProgressBar;

public class BeatBar extends JProgressBar implements Runnable
{
  private JProgressBar progressBar;

  private Thread thread;

  public BeatBar()
  {
    thread = new Thread(this);
    setMaximum(100);
    thread.start();
  }

  public void run()
  {
    for(;;)
    {
      int value = getValue();
      value = (int)(value * 0.75);
      setValue(value);
      repaint();
      try
      {
        Thread.sleep(50);
      }
      catch(Exception e)
      {
        
      }
    }
  }
}