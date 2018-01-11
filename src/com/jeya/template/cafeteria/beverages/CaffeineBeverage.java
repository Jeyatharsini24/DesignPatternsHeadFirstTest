package com.jeya.template.cafeteria.beverages;

public abstract class CaffeineBeverage
{
  // template method
  public final void prepareRecipe()
  {
    boilWater();
    brew();
    pourInCup();
    if(customerWantsCondiments())
    {
      addCondiments();
    }
  }

  boolean customerWantsCondiments() // hook : subclass can override this, but not must
  {
    return true;
  }

  abstract void addCondiments();

  abstract void brew();

  private void pourInCup()
  {
    System.out.println("Pouring into cup");
  }

  private void boilWater()
  {
    System.out.println("Boiling water");
  }
}