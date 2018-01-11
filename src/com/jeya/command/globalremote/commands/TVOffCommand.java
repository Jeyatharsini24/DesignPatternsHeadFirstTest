package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.TV;

public class TVOffCommand implements Command
{
  private TV tv;

  public TVOffCommand(TV tv)
  {
    this.tv = tv;
  }

  @Override
  public void execute()
  {
    tv.off();
  }

  @Override
  public void undo()
  {
    tv.on();
  }
}