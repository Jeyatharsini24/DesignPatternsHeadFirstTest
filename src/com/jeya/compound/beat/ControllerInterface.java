package com.jeya.compound.beat;

public interface ControllerInterface
{
  public void start();

  public void stop();

  public void setBPM(int bpm);

  public void increaseBPM();

  public void decreaseBPMButton();
}