package com.jeya.mediator;

public class Mediator {
	private boolean alarmEvent;
	private boolean weekend;
	private boolean trashDay;
	private CoffeePot coffeePot;
	private Calendar calendar;
	private Alarm alarm;
	private Sprinkler sprinkler;

	public Mediator() {
		coffeePot = new CoffeePot();
		calendar = new Calendar();
		alarm = new Alarm();
		sprinkler = new Sprinkler();
	}

	public void setAlarmEvent(boolean alarmEvent) {
		this.alarmEvent = alarmEvent;
		process();
	}

	public void setWeekend(boolean weekend) {
		this.weekend = weekend;
		process();
	}

	public void setTrashDay(boolean trashDay) {
		this.trashDay = trashDay;
		process();
	}

	public void process() {
		System.out.println("-----------------------------------------------");
		if (alarmEvent) {
			System.out.println("Alarm event is true");
			checkCalendar();
			checkShower();
			checkTemp();
			System.out.println("**************************************");
		}
		if (weekend) {
			System.out.println("Weekend is true");
			checkWeather();
			System.out.println("**************************************");
		}
		if (trashDay) {
			System.out.println("Trashday is true");
			resetAlarm();
			System.out.println("**************************************");
		}
		System.out.println("-----------------------------------------------");
	}

	private void resetAlarm() {
		alarm.resetAlarm();
	}

	private void checkWeather() {
		calendar.checkWeather();
	}

	private void checkTemp() {
		coffeePot.checkTemp();
	}

	private void checkShower() {
		sprinkler.checkShower();
	}

	private void checkCalendar() {
		calendar.checkCalendar();
	}
}