package com.jeya.bridge.shapes;

public class ShapeMain
{
  public static void main(String[] args)
  {
    Shape s1 = new Circle(new ShapeColorRedImpl());
    Shape s2 = new Triangle(new ShapeColorBlueImpl());
    
    s1.draw();
    s2.draw();
  }
}