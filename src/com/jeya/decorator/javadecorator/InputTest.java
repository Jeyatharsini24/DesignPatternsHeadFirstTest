package com.jeya.decorator.javadecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputTest
{
  public static void main(String[] args) throws FileNotFoundException
  {
    int c;
    InputStream in = new LowerCaseInputStream(
        new BufferedInputStream(new FileInputStream("src\\com\\jeya\\decorator\\javadecorator\\test.txt")));
    try
    {
      while ((c = in.read()) >= 0)
      {
        System.out.print((char) c);
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}