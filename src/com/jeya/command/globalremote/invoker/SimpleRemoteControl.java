package com.jeya.command.globalremote.invoker;

import com.jeya.command.globalremote.commands.Command;

public class SimpleRemoteControl
{
  private Command slot;

  public SimpleRemoteControl()
  {

  }

  public void setCommand(Command command)
  {
    this.slot = command;
  }

  public void buttonWasPressed()
  {
    slot.execute();
  }
}
