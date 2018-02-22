package com.jeya.bridge.shapes;

public abstract class Shape
{
  protected String name;
  protected String color;
  
  protected Shape()
  {
    this.name = "no name";
    this.color = "no color";
  }
  
  public void draw()
  {
    System.out.println("I am " + this.name + " and my color is " + this.color);
  }
}