package models.interfaces;

public interface Observable {
	
	public void notifyObservers();
	public void addObserver(Observer observer);
}
