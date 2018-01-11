package com.jeya.command.logrequests.taskreceiver;

import java.util.List;

import com.jeya.command.logrequests.dummydb.DummyDBTable;
import com.jeya.command.logrequests.tasks.Task;

public class Application
{
  private String text = "Miyaav";

  public void doATask(String task)
  {
    text += task;
  }
  
  public void crash()
  {
    text = "Miyaav";
  }
  
  public void print()
  {
    System.out.println(text);
  }

  public void recover()
  {
    List<Task> tasks = DummyDBTable.getInstance().getTasksStored();
    for(Task task : tasks)
    {
      task.executeWhenRecovery();
    }
  }

  public void storeTasksToTable(Task task)
  {
    DummyDBTable.getInstance().store(task);
  }
}