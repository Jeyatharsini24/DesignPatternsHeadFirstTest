package com.jeya.bridge.shapes;

public class ShapeColorRedImpl implements IShapeColor
{
  private String color;
  
  public ShapeColorRedImpl()
  {
    this.color = "Red";
  }
  
  @Override
  public String getShapeColor()
  {
    return this.color;
  }
}