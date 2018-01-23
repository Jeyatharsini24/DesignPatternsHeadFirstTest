package com.jeya.proxy.virtualproxy;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImageProxyTest
{
  public static void main(String[] args)
  {
    JFrame frame = new JFrame();
    frame.setTitle("Virtual Proxy Demo");
    MarkerIconInterface icon;
    try
    {
      icon = new ImageProxy(new URL("http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg"));
      JLabel label = new JLabel();
      label.setIcon(icon);
      label.setPreferredSize(new Dimension(600, 500));
      JPanel p = new JPanel();
      p.setLayout(new GridLayout(1, 1));
      p.add(label);
      frame.getContentPane().add(p);
      p.repaint();
    }
    catch (MalformedURLException e)
    {
      e.printStackTrace();
    }
    frame.setSize(600, 500);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}