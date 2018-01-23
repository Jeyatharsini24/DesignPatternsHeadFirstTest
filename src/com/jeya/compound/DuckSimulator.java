package com.jeya.compound;

public class DuckSimulator
{
  public static void main(String[] args)
  {
    DuckSimulator simulator = new DuckSimulator();
    AbstractDuckFactory abstractDuckFactory = new CountingDuckFactory();
    simulator.simulate4(abstractDuckFactory);
  }
  
  private void simulate4(AbstractDuckFactory duckFactory)
  {
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());
    
    Flock flockOfDucks = new Flock();
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);
    
    Flock flockOfMallards = new Flock();
    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();
    
    flockOfMallards.add(mallardOne);
    flockOfMallards.add(mallardTwo);
    flockOfMallards.add(mallardThree);
    flockOfMallards.add(mallardFour);
    
    flockOfDucks.add(flockOfMallards);
    
    System.out.println("Duck Simulator: With Observer");
    Quackologist quackologist = new Quackologist();
    flockOfDucks.registerObserver(quackologist);
    
    simulate(flockOfDucks);
    System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
  }
  
  private void simulate3(AbstractDuckFactory duckFactory)
  {
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());
    
    System.out.println("Duck Simulator: With Composite - Flocks");
    
    Flock flockOfDucks = new Flock();
    flockOfDucks.add(redheadDuck);
    flockOfDucks.add(duckCall);
    flockOfDucks.add(rubberDuck);
    flockOfDucks.add(gooseDuck);
    
    Flock flockOfMallards = new Flock();
    Quackable mallardOne = duckFactory.createMallardDuck();
    Quackable mallardTwo = duckFactory.createMallardDuck();
    Quackable mallardThree = duckFactory.createMallardDuck();
    Quackable mallardFour = duckFactory.createMallardDuck();
    
    flockOfMallards.add(mallardOne);
    flockOfMallards.add(mallardTwo);
    flockOfMallards.add(mallardThree);
    flockOfMallards.add(mallardFour);
    
    flockOfDucks.add(flockOfMallards);
    System.out.println("-------------------------------------------");

    System.out.println("Duck Simulator: Whole Flock Simulation");
    simulate(flockOfDucks);
    System.out.println("-------------------------------------------");
    
    System.out.println("Duck Simulator: Mallard Flock Simulation");
    simulate(flockOfMallards);
    System.out.println("-------------------------------------------");
    System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
  }
  
  private void simulate2(AbstractDuckFactory duckFactory)
  {
    Quackable mallardDuck = duckFactory.createMallardDuck();
    Quackable redheadDuck = duckFactory.createRedheadDuck();
    Quackable duckCall = duckFactory.createDuckCall();
    Quackable rubberDuck = duckFactory.createRubberDuck();
    Quackable gooseDuck = new GooseAdapter(new Goose());
    
    System.out.println("\nDuck Simulator: With Abstract Factory");
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
    simulate(gooseDuck);
    
    System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
  }

  private void simulate()
  {
    Quackable mallardDuck = new QuackCounter(new MallardDuck());
    Quackable redHeadDuck = new QuackCounter(new RedheadDuck());
    Quackable duckCall = new QuackCounter(new DuckCall());
    Quackable rubberDuck = new QuackCounter(new RubberDuck());
    Goose goose = new Goose();
    // need to show goose as a duck
    Quackable gooseDuck = new GooseAdapter(goose);
    
    System.out.println("Duck Simulator");
    System.out.println("----------------------------");
    
    simulate(mallardDuck);
    simulate(redHeadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
    simulate(gooseDuck);
    
    System.out.println("----------------------------");
    
    System.out.println("Ducks quacked : " + QuackCounter.getQuacks() + " times");
    // if there is no wrapper to decorate wrong result: need to have quality control ==> need factory
  }

  private void simulate(Quackable duck)
  {
    duck.quack();
  }
}