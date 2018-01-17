package com.jeya.proxy.virtualproxy;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

public class ImageProxy implements MarkerIconInterface
{
  private ImageIconMarker imageIconMarker;

  private URL imageURL;

  private Thread retrievalThread;

  private boolean retrieving = false;

  public ImageProxy(URL url)
  {
    imageURL = url;
  }

  @Override
  public void paintIcon(Component c, Graphics g, int x, int y)
  {
    if (imageIconMarker != null)
    {
      imageIconMarker.paintIcon(c, g, x, y);
    }
    else
    {
      g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
      if (!retrieving)
      {
        retrieving = true;
        retrievalThread = new Thread(new Runnable()
        {
          @Override
          public void run()
          {
            try
            {
              imageIconMarker = new ImageIconMarker(imageURL, "CD Cover");
              c.repaint();
            }
            catch(Exception e)
            {
              e.printStackTrace();
            }
          }
        });
        retrievalThread.start();
      }
    }
  }

  @Override
  public int getIconWidth()
  {
    if (imageIconMarker != null)
    {
      return imageIconMarker.getIconWidth();
    }
    return 800;
  }

  @Override
  public int getIconHeight()
  {
    if (imageIconMarker != null)
    {
      return imageIconMarker.getIconHeight();
    }
    return 600;
  }
}