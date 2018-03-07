package com.jeya.mediator;

public class Calendar {
	public void onEvent() {
		// without mediator. with complicated steps
	}
	
	public void checkWeather() {
		System.out.println("Weather is being checked");
	}

	public void checkCalendar() {
		System.out.println("Calendar is being checked");
	}
}