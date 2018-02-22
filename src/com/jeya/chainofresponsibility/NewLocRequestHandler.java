package com.jeya.chainofresponsibility;

public class NewLocRequestHandler extends Handler
{
  @Override
  void handleRequest(Email email)
  {
    if(isThisNewLocationRequestMail(email))
    {
      sendToCEO(email);
    }
  }

  private void sendToCEO(Email email)
  {
    System.out.println("Email with sender " + email.getSender() + " is sent to improvement!!");
  }

  private boolean isThisNewLocationRequestMail(Email email)
  {
    if(email.getMessage().toLowerCase().contains("need new"))
    {
      return true;
    }
    return false;
  }
}