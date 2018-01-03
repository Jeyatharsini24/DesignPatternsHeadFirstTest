package com.jeya.observer.observer;

public class ForecastDisplay implements DisplayElement, Observer {
	private double currentTemperature;
	private double currentHumidity;
	private double currentPressure;
	private double nextTemperature;
	private double nextHumidity;
	private double nextPressure;

	@Override
	public void update() {

		foreCast();
	}

	@Override
	public void display() {
		System.out.println("Next Humidity : " + nextHumidity);
		System.out.println("Next Temperature : " + nextTemperature);
		System.out.println("Next Pressure : " + nextPressure);
	}

	private void foreCast() {
		// for simplicity forecast algorithm is +1
		nextHumidity = currentHumidity + 1;
		nextTemperature = currentTemperature + 1;
		nextPressure = currentPressure + 1;
	}
}
