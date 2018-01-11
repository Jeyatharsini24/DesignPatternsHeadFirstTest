package com.jeya.adapter.pool.turkeys;

public class WildTurkey implements Turkey
{
  @Override
  public void gobble()
  {
    System.out.println("Wild turkey is gobbling");
  }

  @Override
  public void fly()
  {
    System.out.println("Wild Turkey is flying a short distance");
  }
}