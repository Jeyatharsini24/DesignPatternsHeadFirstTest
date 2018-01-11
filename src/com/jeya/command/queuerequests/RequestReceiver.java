package com.jeya.command.queuerequests;

import java.util.ArrayDeque;
import java.util.Queue;

import com.jeya.command.queuerequests.requests.Request;

public class RequestReceiver
{
  private Queue<Request> requestsList = new ArrayDeque<>();

  public void addARequest(Request request)
  {
    requestsList.add(request);
  }

  public synchronized Request dispatchRequest()
  {
    if (requestsList != null && !requestsList.isEmpty())
    {
      return requestsList.remove();
    }
    return null;
  }
}