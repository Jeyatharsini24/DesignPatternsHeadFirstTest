package com.jeya.builder;

import java.util.Date;

public abstract class AbstractBuilder
{
  abstract AbstractBuilder buildDay(Date date);

  abstract AbstractBuilder addHotel(HotelBooking hotelBooking);

  abstract AbstractBuilder addReservation(Reservation reservation);

  abstract AbstractBuilder addSpecialEvent(Event event);

  abstract AbstractBuilder addTickets(Ticket ticket);

  abstract Planner getVacationPlanner();
}