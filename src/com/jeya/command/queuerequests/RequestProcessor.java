package com.jeya.command.queuerequests;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import com.jeya.command.queuerequests.invoker.WorkingThread;
import com.jeya.command.queuerequests.requests.Request;

public class RequestProcessor extends Thread
{
  private RequestReceiver requestReceiver;

  private ExecutorService executor = Executors.newFixedThreadPool(2);

  public RequestProcessor(RequestReceiver requestReceiver)
  {
    this.requestReceiver = requestReceiver;
  }

  public void run()
  {
    int stop = 0;
    while (stop < 100000000)
    {
      Request request = null;
      if ((request = requestReceiver.dispatchRequest()) != null)
      {
        WorkingThread wt = new WorkingThread();
        wt.setCommand(request);
        executor.execute(wt);
      }
     /* Scanner scanner = new Scanner(System.in);
      stop = scanner.nextInt();*/
      stop++;
    }
    executor.shutdown();
    try
    {
      if (!executor.awaitTermination(100, TimeUnit.MICROSECONDS))
      {
        System.out.println("Still waiting after 100ms: calling System.exit(0)...");
        System.exit(0);
      }
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println("Exiting normally...");
  }
}
