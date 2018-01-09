package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.Light;

public class LightOnCommand implements Command
{
  private Light light;

  public LightOnCommand(Light light)
  {
    this.light = light;
  }

  @Override
  public void execute()
  {
    light.on();
  }
}