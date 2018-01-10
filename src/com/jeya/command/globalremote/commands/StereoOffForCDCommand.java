package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.Stereo;

public class StereoOffForCDCommand implements Command
{
  private Stereo cdPlayer;

  public StereoOffForCDCommand(Stereo cdPlayer)
  {
    this.cdPlayer = cdPlayer;
  }

  @Override
  public void execute()
  {
    cdPlayer.stop();
    cdPlayer.off();
  }

  @Override
  public void undo()
  {
    cdPlayer.on();
    cdPlayer.setCD();
    cdPlayer.setVolume(11);
  }
}