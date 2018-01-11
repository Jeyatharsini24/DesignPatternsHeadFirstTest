package com.jeya.command.queuerequests;

import com.jeya.command.queuerequests.requestreceivers.StoryTeller1;
import com.jeya.command.queuerequests.requestreceivers.StoryTeller2;
import com.jeya.command.queuerequests.requestreceivers.StoryTeller3;
import com.jeya.command.queuerequests.requestreceivers.StoryTeller4;
import com.jeya.command.queuerequests.requestreceivers.StoryTeller5;
import com.jeya.command.queuerequests.requests.PrintStory1;
import com.jeya.command.queuerequests.requests.PrintStory2;
import com.jeya.command.queuerequests.requests.PrintStory3;
import com.jeya.command.queuerequests.requests.PrintStory4;
import com.jeya.command.queuerequests.requests.PrintStory5;
import com.jeya.command.queuerequests.requests.Request;

public class RequestFactory
{
  public Request createRequest(String name)
  {
    Request request = null;
    int random = (int) (Math.random() * 10000) % 5;
    switch (random)
    {
      case 0:
        StoryTeller1 storyTeller1 = new StoryTeller1();
        request = new PrintStory1(storyTeller1);
        break;
      case 1:
        StoryTeller2 storyTeller2 = new StoryTeller2();
        request = new PrintStory2(storyTeller2);
        break;
      case 2:
        StoryTeller3 storyTeller3 = new StoryTeller3();
        request = new PrintStory3(storyTeller3);
        break;
      case 3:
        StoryTeller4 storyTeller4 = new StoryTeller4();
        request = new PrintStory4(storyTeller4);
        break;
      case 4:
        StoryTeller5 storyTeller5 = new StoryTeller5();
        request = new PrintStory5(storyTeller5);
        break;
    }
    displayRequest(request, name);
    return request;
  }

  private void displayRequest(Request request, String name)
  {
    System.out.println("Request from client : " + name + ": " + request.getName());
  }
}