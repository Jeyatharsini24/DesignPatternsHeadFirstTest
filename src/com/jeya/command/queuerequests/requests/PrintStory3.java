package com.jeya.command.queuerequests.requests;

import com.jeya.command.queuerequests.requestreceivers.StoryTeller3;

public class PrintStory3 implements Request
{
  private StoryTeller3 storyTeller3;
  
  public PrintStory3(StoryTeller3 storyTeller3)
  {
    super();
    this.storyTeller3 = storyTeller3;
  }

  @Override
  public void execute()
  {
    storyTeller3.showStory3();
  }
  
  @Override
  public String getName()
  {
    return "PrintStory3";
  }
}