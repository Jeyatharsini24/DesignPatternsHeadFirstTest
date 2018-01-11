package com.jeya.command.queuerequests;

import com.jeya.command.queuerequests.requests.Request;

public class DummyClient
{
  private RequestFactory requestFactory = null;

  private String name;

  DummyClient(String name, RequestFactory requestFactory)
  {
    this.requestFactory = requestFactory;
    this.name = name;
  }

  public Request dispatchRequest()
  {
    return requestFactory.createRequest(name);
  }
}