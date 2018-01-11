package com.jeya.command.logrequests.invoker;

import com.jeya.command.logrequests.taskreceiver.Application;
import com.jeya.command.logrequests.tasks.MakeAnimateTask;
import com.jeya.command.logrequests.tasks.MakeBoldTask;
import com.jeya.command.logrequests.tasks.MakeItalicTask;

public class UserPC
{
  private Application app = new Application();

  public void doSomeWork()
  {
    MakeBoldTask makeBold = new MakeBoldTask(app);
    makeBold.execute();

    MakeItalicTask makeItalic = new MakeItalicTask(app);
    makeItalic.execute();

    MakeAnimateTask makeAnimate = new MakeAnimateTask(app);
    makeAnimate.execute();
  }

  public void crash()
  {
    app.crash();
  }
  
  public void recover()
  {
    app.recover();
  }
  
  public void print()
  {
    app.print();
  }
}