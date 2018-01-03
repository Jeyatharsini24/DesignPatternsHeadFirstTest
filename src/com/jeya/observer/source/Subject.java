package com.jeya.observer.source;

import com.jeya.observer.observer.Observer;

public interface Subject {
	void registerObserver(Observer observer);

	void removeObserver(Observer observer);

	void notifyObservers();
}
