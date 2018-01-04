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
	public void update(double temp, double humidity, double pressure) {
		addToList(temp, humidity, pressure);
	}

	private void addToList(double temp, double humidity, double pressure) {
		temperatureList.add(temp);
		humidityList.add(humidity);
		pressureList.add(pressure);
	}

	private void statisticsCalculation() {
		double sumTemp = 0;
		minTemp = 1000;
		maxTemp = -1000;
		for (double temp : temperatureList) {
			if (minTemp > temp) {
				minTemp = temp;
			}
			if (maxTemp < temp) {
				maxTemp = temp;
			}
			sumTemp += temp;
		}
		aveTemp = sumTemp / temperatureList.size();
		double sumHum = 0;
		minHum = 1000;
		maxHum = -1000;
		for (double hum : humidityList) {
			sumHum += hum;
			if (minHum > hum) {
				minHum = hum;
			}
			if (maxHum < hum) {
				maxHum = hum;
			}
		}
		aveHum = sumHum / humidityList.size();
		double sumPres = 0;
		minPres = 1000;
		maxPres = -1000;
		for (double pres : pressureList) {
			sumPres += pres;
			if (minPres > pres) {
				minPres = pres;
			}
			if (maxPres < pres) {
				maxPres = pres;
			}
		}
		avePres = sumPres / pressureList.size();
	}

	@Override
	public void display() {
		statisticsCalculation();
		System.out.println("Humidity");
		System.out.println("------------------------------");
		System.out.println("Min Humidity : " + minHum);
		System.out.println("Max Humidity : " + maxHum);
		System.out.println("Average Humidity : " + aveHum);

		System.out.println("Temperature");
		System.out.println("------------------------------");
		System.out.println("Min Temperature : " + minTemp);
		System.out.println("Max Temperature : " + maxTemp);
		System.out.println("Average Temperature : " + aveTemp);

		System.out.println("Pressure");
		System.out.println("------------------------------");
		System.out.println("Min Pressure : " + minPres);
		System.out.println("Max Pressure : " + maxPres);
		System.out.println("Average Pressure : " + avePres);
	}
}