package com.jeya.template.cafeteria.beverages;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverage
{
  @Override
  void addCondiments()
  {
    System.out.println("Adding sugar and milk");
  }

  @Override
  void brew()
  {
    System.out.println("Dripping coffee through filter");
  }

  public boolean customerWantsCondiments()
  {
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    if (userInput.startsWith("y"))
    {
      return true;
    }
    else
    {
      return false;
    }
  }
}