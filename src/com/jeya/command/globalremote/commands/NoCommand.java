package com.jeya.command.globalremote.commands;

public class NoCommand implements Command
{
  @Override
  public void execute()
  {
    System.out.println("No command to execute: dummy");
  }

  @Override
  public void undo()
  {
    
  }
}