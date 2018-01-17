package com.jeya.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.ImageIcon;

//ImageIconMarker is dummy. does nothing. just to demonstrate virtual proxy. extends ImageIcon is not actually needed in actual proxy
public class ImageIconMarker extends ImageIcon implements MarkerIconInterface
{
  public ImageIconMarker(URL imageURL, String description)
  {
    super(imageURL, description);
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y)
  {
    super.paintIcon(c, g, x, y);
  }

  @Override
  public int getIconWidth()
  {
    return super.getIconWidth();
  }

  @Override
  public int getIconHeight()
  {
    return super.getIconHeight();
  }
}