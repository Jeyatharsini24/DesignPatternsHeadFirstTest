package com.jeya.command.queuerequests.requests;

import com.jeya.command.queuerequests.requestreceivers.StoryTeller4;

public class PrintStory4 implements Request
{
  private StoryTeller4 storyTeller4;
  
  public PrintStory4(StoryTeller4 storyTeller4)
  {
    super();
    this.storyTeller4 = storyTeller4;
  }

  @Override
  public void execute()
  {
    storyTeller4.showStory4();
  }
  
  @Override
  public String getName()
  {
    return "PrintStory4";
  }
}