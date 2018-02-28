package com.jeya.flyweight.without;

public class Tree
{
  private int age;

  private int xCoord;
  
  private int yCoord;

  public Tree(int age, int xCoord, int yCoord)
  {
    super();
    this.age = age;
    this.xCoord = xCoord;
    this.yCoord = yCoord;
  }

  public int getAge()
  {
    return age;
  }

  public void setAge(int age)
  {
    this.age = age;
  }

  public int getxCoord()
  {
    return xCoord;
  }

  public void setxCoord(int xCoord)
  {
    this.xCoord = xCoord;
  }

  public int getyCoord()
  {
    return yCoord;
  }

  public void setyCoord(int yCoord)
  {
    this.yCoord = yCoord;
  }

  public void display()
  {
    System.out.println("age: " + age + ", (xCoord : " + xCoord + ", yCoord : " + yCoord + ")");
  }
}
