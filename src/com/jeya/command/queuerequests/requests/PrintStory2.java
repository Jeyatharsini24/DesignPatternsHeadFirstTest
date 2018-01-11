package com.jeya.command.queuerequests.requests;

import com.jeya.command.queuerequests.requestreceivers.StoryTeller2;

public class PrintStory2 implements Request
{
  private StoryTeller2 storyTeller2;
  
  public PrintStory2(StoryTeller2 storyTeller2)
  {
    super();
    this.storyTeller2 = storyTeller2;
  }

  @Override
  public void execute()
  {
    storyTeller2.showStory2();
  }
  
  @Override
  public String getName()
  {
    return "PrintStory2";
  }
}