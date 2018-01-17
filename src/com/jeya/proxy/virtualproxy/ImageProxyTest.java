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
      icon = new ImageProxy(new URL("https://cdn.pixabay.com/photo/2018/01/14/23/05/visa-3082813_960_720.jpg"));
      JLabel label = new JLabel();
      //label.setForeground(Color.BLUE);
      //label.setBackground(Color.PINK);
      //label.setOpaque(true);
      label.setIcon(icon);
      label.setPreferredSize(new Dimension(900, 700));
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
    frame.setSize(980, 700);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}