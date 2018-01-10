package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.Stereo;

public class StereoOnForCDCommand implements Command
{
  private Stereo cdPlayer;

  public StereoOnForCDCommand(Stereo cdPlayer)
  {
    this.cdPlayer = cdPlayer;
  }

  @Override
  public void execute()
  {
    cdPlayer.on();
    cdPlayer.setCD();
    cdPlayer.setVolume(11);
  }

  @Override
  public void undo()
  {
    cdPlayer.stop();
    cdPlayer.off();
  }
}