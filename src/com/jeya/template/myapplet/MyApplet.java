package com.jeya.template.myapplet;

import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet
{
  private String message;
  
  public void init()
  {
    message = "Hello, I am Alive";
    System.out.println(message);
    repaint();
  }
  
  public void start()
  {
    message = "I am starting up";
    repaint();
  }
  
  public void stop()
  {
    message = "I am being stopped";
    System.out.println(message);
    repaint();
  }
  
  public void destroy()
  {
    message = "I am going away";
    System.out.println(message);
  }
  
  public void paint(Graphics g)
  {
    g.drawString(message, 5, 15);
  }
}