package com.jeya.chainofresponsibility;

public class FanHandler extends Handler
{
  public FanHandler()
  {
    this.successor = new ComplaintHandler();
  }
  
  @Override
  void handleRequest(Email email)
  {
    if(isThisFanMail(email))
    {
      sendToCEO(email);
    }
    else
    {
      this.successor.handleRequest(email);
    }
  }

  private void sendToCEO(Email email)
  {
    System.out.println("Email with sender " + email.getSender() + " is sent to CEO!!");
  }

  private boolean isThisFanMail(Email email)
  {
    if(email.getMessage().toLowerCase().contains("thank you"))
    {
      return true;
    }
    return false;
  }
}