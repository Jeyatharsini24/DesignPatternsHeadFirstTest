package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.CDPlayer;

public class StereoOffForCDCommand implements Command
{
  private CDPlayer cdPlayer;

  public StereoOffForCDCommand(CDPlayer cdPlayer)
  {
    this.cdPlayer = cdPlayer;
  }

  @Override
  public void execute()
  {
    cdPlayer.stop();
    cdPlayer.off();
  }
}