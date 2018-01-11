package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.TV;

public class TVOnCommand implements Command
{
  private TV tv;

  public TVOnCommand(TV tv)
  {
    this.tv = tv;
  }

  @Override
  public void execute()
  {
    tv.on();
  }

  @Override
  public void undo()
  {
    tv.off();
  }
}