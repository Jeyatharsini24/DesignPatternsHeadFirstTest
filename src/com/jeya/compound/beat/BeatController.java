package com.jeya.compound.beat;

public class BeatController implements ControllerInterface
{
  private BeatModelInterface model;

  private DJView view;

  public BeatController(BeatModelInterface model)
  {
    this.model = model;
    view = new DJView(this, model);
    view.createView();
    view.createControls();
    view.disableStartMenuItem();
    view.enableStartMenuItem();
    model.initialize();
  }

  @Override
  public void start()
  {
    model.on();
    view.disableStartMenuItem();
    view.enableStopMenuItem();
  }

  @Override
  public void stop()
  {
    model.off();
    view.disableStopMenuItem();
    view.enableStartMenuItem();
  }

  @Override
  public void setBPM(int bpm)
  {
    model.setBPM(bpm);
  }

  @Override
  public void increaseBPM()
  {
    int bpm = model.getBPM();
    model.setBPM(bpm + 1);
  }

  @Override
  public void decreaseBPMButton()
  {
    int bpm = model.getBPM();
    model.setBPM(bpm - 1);
  }
}