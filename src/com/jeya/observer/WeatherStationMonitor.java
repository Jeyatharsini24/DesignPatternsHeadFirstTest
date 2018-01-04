package com.jeya.observer;

import com.jeya.observer.observer.CurrentConditionsDisplay;
import com.jeya.observer.observer.ForecastDisplay;
import com.jeya.observer.observer.StatisticsDisplay;
import com.jeya.observer.source.WeatherData;

public class WeatherStationMonitor {
	public static void main(String[] args) {
		WeatherData dataFromSensors = new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
		ForecastDisplay forecastDisplay = new ForecastDisplay();
		dataFromSensors.registerObserver(currentConditionsDisplay);
		dataFromSensors.registerObserver(forecastDisplay);
		dataFromSensors.registerObserver(statisticsDisplay);
		dataFromSensors.setHumidity(10);
		dataFromSensors.setPressure(20);
		dataFromSensors.setTemperature(30);
		System.out.println("Current Conditions: ");
		currentConditionsDisplay.display();
		System.out.println("-----------------------------------");
		System.out.println("Statistics: ");
		statisticsDisplay.display();
		System.out.println("-----------------------------------");
		System.out.println("Forecast: ");
		forecastDisplay.display();
		System.out.println("-----------------------------------");
	}
}
