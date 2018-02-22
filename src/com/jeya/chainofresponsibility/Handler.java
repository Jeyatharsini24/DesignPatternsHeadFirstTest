package com.jeya.chainofresponsibility;

public abstract class Handler
{
  protected Handler successor;

  abstract void handleRequest(Email email);
}