package com.jeya.template.myframe;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame
{
  public MyFrame(String title)
  {
    super(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(300, 300);
    this.setVisible(true);
  }
  
  // Jframe's update algorithm calls paint which does nothing : a hook
  public void paint(Graphics graphics)
  {
    super.paint(graphics);
    String msg = "I rule";
    graphics.drawString(msg, 100, 100);
  }

  public static void main(String[] args)
  {
    MyFrame f = new MyFrame("Oops");
  }
}