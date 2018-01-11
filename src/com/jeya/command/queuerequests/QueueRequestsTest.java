package com.jeya.command.queuerequests;

public class QueueRequestsTest
{
  public static void main(String[] args)
  {
    RequestFactory requestFactory = new RequestFactory();
    DummyClient dummyClient1 = new DummyClient("1", requestFactory);
    DummyClient dummyClient2 = new DummyClient("2", requestFactory);
    DummyClient dummyClient3 = new DummyClient("3", requestFactory);
    DummyClient dummyClient4 = new DummyClient("4", requestFactory);
    DummyClient dummyClient5 = new DummyClient("5", requestFactory);
    DummyClient[] dummyClients = { dummyClient1, dummyClient2, dummyClient3, dummyClient4, dummyClient5 };

    RequestReceiver requestReceiver = new RequestReceiver();
    RequestProcessor requestProcessor = new RequestProcessor(requestReceiver);
    requestProcessor.start();
    for(int j = 0; j < 2; j++)
    {
      for (int i = 0; i < dummyClients.length; i++)
      {
        requestReceiver.addARequest(dummyClients[i].dispatchRequest());
      }
    }
  }
}