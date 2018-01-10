package com.jeya.command.globalremote.invoker;

import com.jeya.command.globalremote.commands.Command;
import com.jeya.command.globalremote.commands.NoCommand;

public class RemoteControl
{
  private Command[] onCommands;

  private Command[] offCommands;
  
  private Command undoCommand;

  public RemoteControl()
  {
    onCommands = new Command[7];
    offCommands = new Command[7];

    Command noCommand = new NoCommand();
    for (int i = 0; i < 7; i++)
    {
      onCommands[i] = noCommand;
      offCommands[i] = noCommand;
    }
    undoCommand = noCommand;
  }

  public void setCommand(int slot, Command onCommand, Command offCommand)
  {
    onCommands[slot] = onCommand;
    offCommands[slot] = offCommand;
  }

  public void onButtonWasPushed(int slot)
  {
    onCommands[slot].execute();
    undoCommand = onCommands[slot];
  }

  public void offButtonWasPushed(int slot)
  {
    offCommands[slot].execute();
    undoCommand = offCommands[slot];
  }
  
  public void undoButtonWasPushed()
  {
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Undo button is pressed:");
    undoCommand.undo();
    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
  }

  public String toString()
  {
    StringBuffer stringBuff = new StringBuffer();
    stringBuff.append("\n---------- Remote Control -------------\n");
    for (int i = 0; i < onCommands.length; i++)
    {
      stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "  "
          + offCommands[i].getClass().getName() + "\n");
    }
    return stringBuff.toString();
  }
}