package com.jeya.command.logrequests.tasks;

public interface Task
{
  void execute();

  void store();
  
  void executeWhenRecovery();
}