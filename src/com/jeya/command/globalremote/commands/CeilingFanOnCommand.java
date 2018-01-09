package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.CeilingFan;

public class CeilingFanOnCommand implements Command
{
  private CeilingFan ceilingFan;

  public CeilingFanOnCommand(CeilingFan ceilingFan)
  {
    this.ceilingFan = ceilingFan;
  }

  @Override
  public void execute()
  {
    ceilingFan.on();
  }
}