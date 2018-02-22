package com.jeya.chainofresponsibility;

public class Email
{
  private String message;

  private String sender;

  public Email(String message, String sender)
  {
    super();
    this.message = message;
    this.sender = sender;
  }

  public String getMessage()
  {
    return message;
  }

  public String getSender()
  {
    return sender;
  }
}