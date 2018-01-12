package com.jeya.template.sorting;

import com.jeya.template.sorting.comparables.Duck;
import com.jeya.template.sorting.mergesort.MergeSort;

public class MergeSortTest
{
  public static void main(String[] args)
  {
    Duck[]ducks = {new Duck(), new Duck(), new Duck(), new Duck()};
    ducks[0].setWeight(25);
    ducks[1].setWeight(12);
    ducks[2].setWeight(42);
    ducks[3].setWeight(30);
    System.out.println("Before sorting: ");
    for(Duck duck : ducks)
    {
      System.out.println("Duck: " + duck.getWeight());
    }
    MergeSort.sort(ducks);
    System.out.println("After sorting: ");
    for(Duck duck : ducks)
    {
      System.out.println("Duck: " + duck.getWeight());
    }
  }
}