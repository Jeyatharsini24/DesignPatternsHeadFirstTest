package com.jeya.bridge.shapes;

public class Triangle extends Shape
{
  public Triangle(IShapeColor color)
  {
    this.name = "Triangle";
    this.color = color.getShapeColor();
  }
}