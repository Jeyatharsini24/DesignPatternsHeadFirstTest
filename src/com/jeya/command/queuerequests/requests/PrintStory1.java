package com.jeya.command.queuerequests.requests;

import com.jeya.command.queuerequests.requestreceivers.StoryTeller1;

public class PrintStory1 implements Request
{
  private StoryTeller1 storyTeller1;
  
  public PrintStory1(StoryTeller1 storyTeller1)
  {
    super();
    this.storyTeller1 = storyTeller1;
  }

  @Override
  public void execute()
  {
    storyTeller1.showStory1();
  }

  @Override
  public String getName()
  {
    return "PrintStory1";
  }
}