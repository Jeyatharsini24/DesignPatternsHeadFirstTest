package com.jeya.chainofresponsibility;

public class EmailDemo
{
  public static void main(String[] args)
  {
    Handler spamHandler = new SpamHandler();
    Email email1 = new Email("Gift is for you. please click here", "Mary");
    Email email2 = new Email("Thank you. I am really happy with game", "Nisha");
    Email email3 = new Email("My child's studies affecting because of you", "Suseela");
    Email email4 = new Email("We need new machine in our area also", "Hema");
    
    spamHandler.handleRequest(email1);
    spamHandler.handleRequest(email2);
    spamHandler.handleRequest(email3);
    spamHandler.handleRequest(email4);
  }
}