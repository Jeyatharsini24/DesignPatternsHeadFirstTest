package com.jeya.command.queuerequests.invoker;

import com.jeya.command.queuerequests.requests.Request;

public class WorkingThread implements Runnable
{
  private Request command;

  public void setCommand(Request command)
  {
    this.command = command;
  }

  @Override
  public void run()
  {
    command.execute();
  }

  public Request getCommand()
  {
    return command;
  }
}