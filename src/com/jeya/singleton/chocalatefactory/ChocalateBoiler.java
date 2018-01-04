package com.jeya.singleton.chocalatefactory;

public class ChocalateBoiler
{
  private boolean empty;

  private boolean boiled;

  private static volatile ChocalateBoiler uniqueInstanceOfChocalateBoiler;

  public static ChocalateBoiler getInstance()
  {
    if (uniqueInstanceOfChocalateBoiler == null)
    {
      synchronized (ChocalateBoiler.class)
      {
        if (uniqueInstanceOfChocalateBoiler == null)
        {
          uniqueInstanceOfChocalateBoiler = new ChocalateBoiler();
        }
      }
    }
    return uniqueInstanceOfChocalateBoiler;
  }

  private ChocalateBoiler()
  {
    empty = true;
    boiled = false;
  }

  public void fill()
  {
    if (isEmpty())
    {
      System.out.println("Filling...");
      empty = false;
      boiled = false;
    }
    setBoiled();
  }
  
  private void setBoiled()
  {
    if(!isEmpty())
    {
      System.out.println("Boiling...");
      boiled = true;
    }
  }

  public void drain()
  {
    if (!isEmpty() && isBoiled())
    {
      System.out.println("Draining...");
      empty = true;
    }
  }

  private boolean isBoiled()
  {
    return boiled;
  }

  private boolean isEmpty()
  {
    return empty;
  }
}