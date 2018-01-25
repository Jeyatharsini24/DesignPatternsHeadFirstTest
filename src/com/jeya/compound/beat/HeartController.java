package com.jeya.compound.beat;

public class HeartController implements ControllerInterface
{
  private HeartModelInterface model;

  private DJView view;

  public HeartController(HeartModelInterface model)
  {
    this.model = model;
    view = new DJView(this, new HeartAdapter(model));
    view.createView();
    view.createControls();
    view.disableStartMenuItem();
    view.disableStopMenuItem();
  }

  @Override
  public void start(){}

  @Override
  public void stop(){}

  @Override
  public void setBPM(int bpm){}

  @Override
  public void increaseBPM(){}

  @Override
  public void decreaseBPM(){}
}