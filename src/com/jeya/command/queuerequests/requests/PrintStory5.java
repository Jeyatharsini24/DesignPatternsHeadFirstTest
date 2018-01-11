package com.jeya.command.queuerequests.requests;

import com.jeya.command.queuerequests.requestreceivers.StoryTeller5;

public class PrintStory5 implements Request
{
  private StoryTeller5 storyTeller5;
  
  public PrintStory5(StoryTeller5 storyTeller5)
  {
    super();
    this.storyTeller5 = storyTeller5;
  }

  @Override
  public void execute()
  {
    storyTeller5.showStory5();
  }
  
  @Override
  public String getName()
  {
    return "PrintStory5";
  }
}