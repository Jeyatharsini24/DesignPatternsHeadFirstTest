package com.jeya.adapter.pool;

import com.jeya.adapter.pool.ducks.Duck;
import com.jeya.adapter.pool.ducks.MallardDuck;
import com.jeya.adapter.pool.turkeyasduck.TurkeyAdapter;
import com.jeya.adapter.pool.turkeys.WildTurkey;

public class TurkeyAsDuckTest
{
  public static void main(String[]args)
  {
    MallardDuck mallardDuck = new MallardDuck();
    
    WildTurkey wildTurkey = new WildTurkey();
    Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
    
    System.out.println("Turkey: ");
    wildTurkey.gobble();
    wildTurkey.fly();
    
    System.out.println("--------------------------");
    
    System.out.println("Duck: ");
    mallardDuck.quack();
    mallardDuck.fly();
    
    System.out.println("--------------------------");
    
    System.out.println("Turkey Adaper: ");
    testDuck(turkeyAdapter);
  }
  
  private static void testDuck(Duck duck)
  {
    duck.quack();
    duck.fly();
  }
}
