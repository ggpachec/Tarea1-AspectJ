package tarea1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;


public class Subject {
	private List<Observer> Observers = new ArrayList<>();
	private Color backgroundColor;
	
	public void addObserver(Observer observer) {
		Observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		Observers.remove(observer);
	}
	
	public void notifyObservers() {
        for (Observer observer : Observers) {
            observer.update(backgroundColor.toString());
        }
    }
	
	public void setBackgroundColor(Color color) {
        backgroundColor = color;
        notifyObservers();
    }
		
}
