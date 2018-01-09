package com.jeya.command.globalremote.commands;

import com.jeya.command.globalremote.commandreceivers.Light;

public class LightOffCommand implements Command
{
  private Light light;

  public LightOffCommand(Light light)
  {
    this.light = light;
  }

  @Override
  public void execute()
  {
    light.on();
  }
}