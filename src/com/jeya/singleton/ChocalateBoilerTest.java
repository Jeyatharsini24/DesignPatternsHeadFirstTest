package com.jeya.singleton;

import com.jeya.singleton.chocalatefactory.ChocoBoilerUser;

public class ChocalateBoilerTest
{
  public static void main(String[] args)
  {
    ChocoBoilerUser chocoBoilerUser = new ChocoBoilerUser();
    ChocoBoilerUser chocoBoilerUser2 = new ChocoBoilerUser();
    ChocoBoilerUser chocoBoilerUser3 = new ChocoBoilerUser();
    ChocoBoilerUser chocoBoilerUser4 = new ChocoBoilerUser();
    ChocoBoilerUser chocoBoilerUser5 = new ChocoBoilerUser();
    
    chocoBoilerUser.start();
    chocoBoilerUser2.start();
    chocoBoilerUser3.start();
    chocoBoilerUser4.start();
    chocoBoilerUser5.start();
  }
}