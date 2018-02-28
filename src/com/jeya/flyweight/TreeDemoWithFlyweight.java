package com.jeya.flyweight;

public class TreeDemoWithFlyweight
{
  public static void main(String[] args)
  {
    TreeManager treeManager = new TreeManager(100);
    for(int i = 0; i < 100; i++)
    {
      treeManager.addTree(1*i, 2*i, 1*i);
    }
    treeManager.displayTrees();
  }
}