package com.jeya.command.logrequests;

import com.jeya.command.logrequests.invoker.UserPC;

public class RecoveryMechTest
{
  public static void main(String[] args)
  {
    UserPC userPC = new UserPC();
    System.out.println("Print initially:");
    System.out.println("-------------------------------------");
    userPC.print();
    System.out.println("Do some work:");
    System.out.println("-------------------------------------");
    userPC.doSomeWork();
    userPC.print();
    System.out.println("Crash:");
    System.out.println("-------------------------------------");
    userPC.crash();
    userPC.print();
    System.out.println("Recover:");
    System.out.println("-------------------------------------");
    userPC.recover();
    userPC.print();
  }
}