package com.jeya.command.logrequests.dummydb;

import java.util.ArrayList;
import java.util.List;

import com.jeya.command.logrequests.tasks.Task;

public class DummyDBTable
{
  private List<Task> tasksStored = new ArrayList<>();
  
  private static DummyDBTable instance;
  
  private DummyDBTable()
  {
    
  }
  
  public static DummyDBTable getInstance()
  {
    if(instance == null)
    {
      instance = new DummyDBTable();
    }
    return instance;
  }

  public void store(Task task)
  {
    tasksStored.add(task);
  }

  public List<Task> getTasksStored()
  {
    return tasksStored;
  }
}