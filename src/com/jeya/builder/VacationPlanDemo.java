package com.jeya.builder;

import java.sql.Time;
import java.util.Date;

public class VacationPlanDemo
{
  public static void main(String[] args)
  {
    AbstractBuilder builder = new VacationBuilder();
    builder.buildDay(new Date(2018, 3, 12));
    builder.addHotel(new HotelBooking(new Date(2018, 3, 12), "Hari Piorko"));
    builder.addReservation(new Reservation("Delhi Park", 2));
    builder.addSpecialEvent(new Event("Elephant riding", new Time(10, 15, 0), "Delhi Park"));
    builder.addTickets(new Ticket(200, 2));
    
    Planner planner = builder.getVacationPlanner();
    planner.print();
  }
}