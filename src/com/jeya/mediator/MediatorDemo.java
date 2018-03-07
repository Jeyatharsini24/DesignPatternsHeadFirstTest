package com.jeya.mediator;

public class MediatorDemo {

	public static void main(String[] args) {
		Mediator mediator = new Mediator();
		mediator.setAlarmEvent(true);
		mediator.setTrashDay(true);
		mediator.setWeekend(true);
	}
}