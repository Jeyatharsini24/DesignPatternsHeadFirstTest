package com.jeya.command.logrequests.tasks;

import com.jeya.command.logrequests.dummydb.DummyDBTable;
import com.jeya.command.logrequests.taskreceiver.Application;

public class MakeBoldTask implements Task
{
  private Application app;

  public MakeBoldTask(Application app)
  {
    this.app = app;
  }

  @Override
  public void execute()
  {
    app.doATask("+made bold now;");
    app.storeTasksToTable(this);
  }

  @Override
  public void store()
  {
    DummyDBTable.getInstance().store(this);
  }
  
  @Override
  public void executeWhenRecovery()
  {
    app.doATask("+made bold now;");
  }
}