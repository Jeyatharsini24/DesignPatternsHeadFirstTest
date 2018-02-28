package com.jeya.flyweight.without;

public class TreeDemoWithoutFlyweight
{
  public static void main(String[] args)
  {
    Tree[] trees = new Tree[100];
    for(int i = 0; i < 100; i++)
    {
      trees[i] = new Tree(1*i, 2*i, 1*i);
      trees[i].display();
    }
  }
}