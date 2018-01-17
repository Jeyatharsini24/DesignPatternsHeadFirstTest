package com.jeya.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;

import javax.swing.Icon;

// MarkerIconInterface is dummy. does nothing. just to demonstrate virtual proxy
public interface MarkerIconInterface extends Icon
{
  @Override
  public abstract void paintIcon(Component c, Graphics g, int x, int y);

  @Override
  public abstract int getIconWidth();

  @Override
  public abstract int getIconHeight();
}