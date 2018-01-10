package com.jeya.command.globalremote;

import com.jeya.command.globalremote.commandreceivers.GarageDoor;
import com.jeya.command.globalremote.commandreceivers.Light;
import com.jeya.command.globalremote.commands.Command;
import com.jeya.command.globalremote.commands.GarageDoorOpenCommand;
import com.jeya.command.globalremote.commands.LightOnCommand;
import com.jeya.command.globalremote.invoker.SimpleRemoteControl;

public class SimpleRemoteTest
{
  public static void main(String[] args)
  {
    SimpleRemoteControl remote = new SimpleRemoteControl();
    Light kitchenLight = new Light("Kitchen Light");
    Command lightOnCommand = new LightOnCommand(kitchenLight);
    remote.setCommand(lightOnCommand);
    remote.buttonWasPressed();
    
    GarageDoor garageDoor = new GarageDoor("Guest House");
    Command garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
    remote.setCommand(garageDoorOpenCommand);
    remote.buttonWasPressed();
  }
}