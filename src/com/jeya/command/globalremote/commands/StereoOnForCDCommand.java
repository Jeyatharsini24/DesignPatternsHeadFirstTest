package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.CDPlayer;

public class StereoOnForCDCommand implements Command
{
  private CDPlayer cdPlayer;

  public StereoOnForCDCommand(CDPlayer cdPlayer)
  {
    this.cdPlayer = cdPlayer;
  }

  @Override
  public void execute()
  {
    cdPlayer.on();
    cdPlayer.play();
  }
}