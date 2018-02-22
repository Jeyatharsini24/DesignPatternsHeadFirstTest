package com.jeya.bridge.shapes;

public class ShapeColorBlueImpl implements IShapeColor
{
  private String color;
  
  public ShapeColorBlueImpl()
  {
    this.color = "Blue";
  }
  
  @Override
  public String getShapeColor()
  {
    return this.color;
  }
}