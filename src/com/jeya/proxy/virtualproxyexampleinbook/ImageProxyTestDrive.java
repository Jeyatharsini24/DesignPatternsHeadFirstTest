package com.jeya.proxy.virtualproxyexampleinbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.jeya.proxy.virtualproxy.ImageProxy;

public class ImageProxyTestDrive
{
  private ImageComponent imageComponent;

  private JFrame frame = new JFrame("CD Cover Viewer");

  private JMenuBar menuBar;

  private JMenu menu;

  private Hashtable<String, String> cds = new Hashtable<>();

  public static void main(String[] args) throws MalformedURLException
  {
    ImageProxyTestDrive imageProxyTestDrive = new ImageProxyTestDrive();
  }

  private ImageProxyTestDrive() throws MalformedURLException
  {
    cds.put("Ambient: Music for Airports","http://images.amazon.com/images/P/B000003S2K.01.LZZZZZZZ.jpg");
    cds.put("Buddha Bar","http://images.amazon.com/images/P/B00009XBYK.01.LZZZZZZZ.jpg");
    cds.put("Ima","http://images.amazon.com/images/P/B000005IRM.01.LZZZZZZZ.jpg");
    cds.put("Karma","http://images.amazon.com/images/P/B000005DCB.01.LZZZZZZZ.gif");
    cds.put("MCMXC A.D.","http://images.amazon.com/images/P/B000002URV.01.LZZZZZZZ.jpg");
    cds.put("Northern Exposure","http://images.amazon.com/images/P/B000003SFN.01.LZZZZZZZ.jpg");
    cds.put("Selected Ambient Works, Vol. 2","http://images.amazon.com/images/P/B000002MNZ.01.LZZZZZZZ.jpg");
    URL initiateURL = new URL(cds.get("Ambient: Music for Airports"));
    menuBar = new JMenuBar();
    menu = new JMenu("Favorite CDs");
    menuBar.add(menu);
    frame.setJMenuBar(menuBar);

    for (Enumeration e = cds.keys(); e.hasMoreElements();)
    {
      String name = (String) e.nextElement();
      JMenuItem menuItem = new JMenuItem(name);
      menu.add(menuItem);
      menuItem.addActionListener(new ActionListener()
      {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
          frame.repaint();
        }
      });
    }

    Icon icon = new ImageProxy(initiateURL);
    imageComponent = new ImageComponent(icon);
    frame.getContentPane().add(imageComponent);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setVisible(true);
  }

  private URL getCDUrl(String name)
  {
    try
    {
      return new URL(cds.get(name));
    }
    catch (MalformedURLException e)
    {
      e.printStackTrace();
      return null;
    }
  }
}