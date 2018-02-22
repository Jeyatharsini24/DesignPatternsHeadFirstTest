package com.jeya.builder;

public class Ticket implements Plan
{
  private double price;

  private int ticketCount;

  public Ticket(double price, int ticketCount)
  {
    this.price = price;
    this.ticketCount = ticketCount;
  }

  public double getPrice()
  {
    return price;
  }

  public int getTicketCount()
  {
    return ticketCount;
  }
  
  public String toString()
  {
    return "Ticket [Price : " + price + ", Number of ticket : " + ticketCount + "]";
  }
}