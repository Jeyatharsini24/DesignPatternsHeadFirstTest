package com.jeya.builder;

import java.util.Date;

public class VacationBuilder extends AbstractBuilder
{
  private Planner vacation;
  
  private Date currentDate;
  
  public VacationBuilder()
  {
    vacation = new Planner();
    currentDate = new Date();
  }

  @Override
  AbstractBuilder buildDay(Date date)
  {
    currentDate = date;
    return this;
  }
  
  private void addPlan(Plan plan)
  {
    vacation.addPlan(currentDate, plan);
  }

  @Override
  AbstractBuilder addHotel(HotelBooking hotelBooking)
  {
    vacation.addPlan(hotelBooking.getBookingDate(), hotelBooking);
    return this;
  }

  @Override
  AbstractBuilder addReservation(Reservation reservation)
  {
    addPlan(reservation);
    return this;
  }

  @Override
  AbstractBuilder addSpecialEvent(Event event)
  {
    addPlan(event);
    return this;
  }

  @Override
  AbstractBuilder addTickets(Ticket ticket)
  {
    addPlan(ticket);
    return this;
  }

  @Override
  Planner getVacationPlanner()
  {
    return vacation;
  }
}