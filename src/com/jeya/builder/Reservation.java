package com.jeya.builder;

public class Reservation implements Plan
{
  private String placeName;

  private int numberOfReservation;

  public Reservation(String placeName, int noOfReservation)
  {
    this.placeName = placeName;
    this.numberOfReservation = noOfReservation;
  }

  public String getPlaceName()
  {
    return placeName;
  }

  public int getNumberOfReservation()
  {
    return numberOfReservation;
  }
  
  public String toString()
  {
    return "Reservation [Place Name : " + placeName + ", Number of Reservation : " + numberOfReservation + "]";
  }
}