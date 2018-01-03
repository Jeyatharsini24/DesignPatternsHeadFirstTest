package com.jeya.observer.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements DisplayElement, Observer {
	private List<Double> temperatureList = new ArrayList<>();
	private List<Double> humidityList = new ArrayList<>();
	private List<Double> pressureList = new ArrayList<>();
	private double minTemp;
	private double minHum;
	private double minPres;
	private double maxTemp;
	private double maxHum;
	private double maxPres;
	private double aveTemp;
	private double avePres;
	private double aveHum;

	@Override
	public void update() {
		// addToList();
		statisticsCalculation();
	}

	private void statisticsCalculation() {

	}

	@Override
	public void display() {

	}
}