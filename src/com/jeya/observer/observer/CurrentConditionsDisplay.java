package com.jeya.observer.observer;

public class CurrentConditionsDisplay implements DisplayElement, Observer {
	private double currentTemperature;
	private double currentHumidity;
	private double currentPressure;

	@Override
	public void update(double temp, double humidity, double pressure) {
		this.currentTemperature = temp;
		this.currentHumidity = humidity;
		this.currentPressure = pressure;
	}

	@Override
	public void display() {
		System.out.println("Next Humidity : " + currentHumidity);
		System.out.println("Next Temperature : " + currentTemperature);
		System.out.println("Next Pressure : " + currentPressure);
	}
}
