package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.GarageDoor;

public class GarageDoorOpenCommand implements Command
{
  private GarageDoor garage;

  public GarageDoorOpenCommand(GarageDoor garage)
  {
    this.garage = garage;
  }

  @Override
  public void execute()
  {
    garage.up();
    garage.stop();
    garage.lightOn();
  }
}