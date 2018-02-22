package com.jeya.chainofresponsibility;

public class SpamHandler extends Handler
{
  public SpamHandler()
  {
    this.successor = new FanHandler();
  }
  
  @Override
  void handleRequest(Email email)
  {
    if(isThisSpam(email))
    {
      delete(email);
    }
    else
    {
      this.successor.handleRequest(email);
    }
  }

  private void delete(Email email)
  {
    System.out.println("Email with sender " + email.getSender() + " is deleted!!");
  }

  private boolean isThisSpam(Email email)
  {
    if(email.getMessage().toLowerCase().contains("gift"))
    {
      return true;
    }
    return false;
  }
}