package com.jeya.chainofresponsibility;

public class ComplaintHandler extends Handler
{
  public ComplaintHandler()
  {
    this.successor = new NewLocRequestHandler();
  }
  
  @Override
  void handleRequest(Email email)
  {
    if(isThisComplaintMail(email))
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
    System.out.println("Email with sender " + email.getSender() + " is sent to legal!!");
  }

  private boolean isThisComplaintMail(Email email)
  {
    if(email.getMessage().toLowerCase().contains("studies affecting"))
    {
      return true;
    }
    return false;
  }
}