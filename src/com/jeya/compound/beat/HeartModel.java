package com.jeya.compound.beat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HeartModel implements HeartModelInterface, Runnable
{
  private List<BeatObserver> beatObservers = new ArrayList<>();

  private List<BPMObserver> bpmObservers = new ArrayList<>();

  private int time = 1000;

  private int bpm = 90;

  private Random random = new Random(System.currentTimeMillis());

  private Thread thread;

  public HeartModel()
  {
    thread = new Thread(this);
    thread.start();
  }

  @Override
  public void run()
  {
    int lastrate = -1;
    for (;;)
    {
      int change = random.nextInt(10);
      if (random.nextInt(2) == 0)
      {
        change = 0 - change;
      }
      int rate = 60000 / (time + change);
      if (rate < 120 && rate > 50)
      {
        time += change;
        notifyBeatObservers();
        if (rate != lastrate)
        {
          lastrate = rate;
          notifyBPMObservers();
        }
      }
      try
      {
        Thread.sleep(time);
      }
      catch (Exception e)
      {

      }
    }
  }

  @Override
  public int getHeartRate()
  {
    return 60000 / time;
  }

  @Override
  public void registerObserver(BeatObserver o)
  {
    beatObservers.add(o);
  }

  @Override
  public void removeObserver(BeatObserver o)
  {
    int i = beatObservers.indexOf(o);
    if(i >= 0)
    {
      beatObservers.remove(i);
    }
  }

  @Override
  public void registerObserver(BPMObserver o)
  {
    bpmObservers.add(o);
  }

  @Override
  public void removeObserver(BPMObserver o)
  {
    int i = bpmObservers.indexOf(o);
    if(i >= 0)
    {
      bpmObservers.remove(i);
    }
  }
  

  private void notifyBPMObservers()
  {
    for(int i = 0; i < bpmObservers.size(); i++)
    {
      BPMObserver observer = bpmObservers.get(i);
      observer.updateBPM();
    }
  }

  private void notifyBeatObservers()
  {
    for(int i = 0; i < beatObservers.size(); i++)
    {
      BeatObserver observer = beatObservers.get(i);
      observer.updateBeat();
    }
  }
}