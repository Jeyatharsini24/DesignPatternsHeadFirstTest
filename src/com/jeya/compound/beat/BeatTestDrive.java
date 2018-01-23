package com.jeya.compound.beat;

public class BeatTestDrive
{
  public static void main(String[] args)
  {
    BeatModelInterface model = new BeatModel();
    ControllerInterface controller = new BeatController(model);
  }
}