package com.jeya.flyweight;

public class TreeManager
{
  private int[] ageArray;

  private int[][] coordinate;

  private int currentIndex;

  private int numberOfTrees;

  private Tree tree;

  public TreeManager(int numberOfTrees)
  {
    ageArray = new int[numberOfTrees];
    coordinate = new int[numberOfTrees][2];
    currentIndex = 0;
    this.numberOfTrees = numberOfTrees;
    tree = new Tree();
  }

  public void addTree(int age, int xcoord, int ycoord)
  {
    if (currentIndex < numberOfTrees)
    {
      ageArray[currentIndex] = age;
      coordinate[currentIndex][0] = xcoord;
      coordinate[currentIndex][1] = ycoord;
      currentIndex++;
    }
  }

  public void displayTrees()
  {
    for (int i = 0; i < numberOfTrees; i++)
    {
      tree.display(coordinate[i][0], coordinate[i][1], ageArray[i]);
    }
  }
}