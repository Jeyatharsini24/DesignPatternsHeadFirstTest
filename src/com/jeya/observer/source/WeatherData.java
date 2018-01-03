package com.jeya.observer.source;

import java.util.ArrayList;
import java.util.List;

import com.jeya.observer.observer.Observer;

public class WeatherData implements Subject {
	List<Observer> observers = new ArrayList<>();
	private double temperature;
	private double humidity;
	private double pressure;

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).notify();
		}
	}

	public double getTemperature() {
		return temperature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}
}