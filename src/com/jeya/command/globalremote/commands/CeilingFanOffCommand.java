package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.CeilingFan;

public class CeilingFanOffCommand implements Command
{
  private CeilingFan ceilingFan;

  public CeilingFanOffCommand(CeilingFan ceilingFan)
  {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute()
  {
    ceilingFan.off();
  }
}