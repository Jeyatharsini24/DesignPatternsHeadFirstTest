package com.jeya.builder;

import java.util.Date;

public class HotelBooking implements Plan
{
  private Date bookingDate;

  private String hotelName;

  public HotelBooking(Date bookingDate, String hotelName)
  {
    this.bookingDate = bookingDate;
    this.hotelName = hotelName;
  }

  public Date getBookingDate()
  {
    return bookingDate;
  }

  public String getHotelName()
  {
    return hotelName;
  }
  
  public String toString()
  {
    return "Hotel Booking [Booking Date : " + bookingDate + ", Hotel Name : " + hotelName + "]";
  }
}