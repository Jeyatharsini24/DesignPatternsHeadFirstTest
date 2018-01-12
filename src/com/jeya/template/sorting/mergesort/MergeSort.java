package com.jeya.template.sorting.mergesort;

public class MergeSort
{
  public static void sort(Object[] a)
  {
    mergeSort(a, 0, a.length - 1);
  }

  private static void mergeSort(Object[] src, int low, int high)
  {
    if (low < high)
    {
      int middle = low + (high - low) / 2;
      mergeSort(src, low, middle);
      mergeSort(src, middle + 1, high);
      merge(src, low, middle, high);
    }
  }

  private static void merge(Object[] src, int low, int middle, int high)
  {
    Object[] obj = new Object[src.length];
    for (int i = low; i <= high; i++)
    {
      obj[i] = src[i];
    }
    int i = low;
    int j = middle + 1;
    int k = low;

    while (i <= middle && j <= high)
    {
      if (((Comparable) obj[i]).compareTo((Comparable) obj[j]) < 0)
      {
        src[k] = obj[i];
        i++;
      }
      else
      {
        src[k] = obj[j];
        j++;
      }
      k++;
    }
    while (i <= middle)
    {
      src[k] = obj[i];
      k++;
      i++;
    }
  }
}