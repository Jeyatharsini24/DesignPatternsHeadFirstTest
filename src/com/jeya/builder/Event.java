package com.jeya.builder;

import java.sql.Time;

public class Event implements Plan
{
  private String eventName;

  private Time eventTime;

  private String placeName;

  public Event(String eventName, Time eventTime, String placeName)
  {
    this.eventName = eventName;
    this.eventTime = eventTime;
    this.placeName = placeName;
  }

  public String getEventName()
  {
    return eventName;
  }

  public Time getEventTime()
  {
    return eventTime;
  }

  public String getPlaceName()
  {
    return placeName;
  }
  
  public String toString()
  {
    return "Event [Place Name : " + placeName + ", Place Name : " + placeName + ", Event Time : " + eventTime + "]";
  }
}