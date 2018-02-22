package com.jeya.bridge.shapes;

public class Circle extends Shape
{
  public Circle(IShapeColor color)
  {
    this.name = "Circle";
    this.color = color.getShapeColor();
  }
}