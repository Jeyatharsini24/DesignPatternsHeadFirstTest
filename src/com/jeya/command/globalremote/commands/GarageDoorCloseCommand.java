package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.GarageDoor;

public class GarageDoorCloseCommand implements Command
{
  private GarageDoor garage;

  public GarageDoorCloseCommand(GarageDoor garage)
  {
    this.garage = garage;
  }

  @Override
  public void execute()
  {
    garage.down();
    garage.stop();
    garage.lightOff();
  }

  @Override
  public void undo()
  {
    garage.up();
    garage.stop();
    garage.lightOn();
  }
}