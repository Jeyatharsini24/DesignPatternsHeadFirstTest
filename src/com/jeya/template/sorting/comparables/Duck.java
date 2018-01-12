package com.jeya.template.sorting.comparables;

public class Duck implements Comparable
{
  private int weight;

  @Override
  public int compareTo(Object o)
  {
    if (o instanceof Duck)
    {
      if (weight > ((Duck) o).weight)
      {
        return 1;
      }
      else if (weight < ((Duck) o).weight)
      {
        return -1;
      }
      else
      {
        return 0;
      }
    }
    return -2;
  }

  public void setWeight(int weight)
  {
    this.weight = weight;
  }

  public int getWeight()
  {
    return weight;
  }
}