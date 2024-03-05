package models.entities;

import java.util.ArrayList;
import java.util.List;

import models.interfaces.Carro;
import models.interfaces.Observable;
import models.interfaces.Observer;

public class CarroSuspeito implements Carro, Observable{
	
	private List<Observer> observers = new ArrayList<>();
	private String placa;
	private Double km;
	private String name;
	
	
	public CarroSuspeito(String placa, Double km, String name) {
		this.placa = placa;
		this.km = km;
		this.name = name;
	}


	public List<Observer> getObservers() {
		return observers;
	}


	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public Double getKm() {
		return km;
	}


	public void setKm(Double km) {
		this.km = km;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void notifyObservers() {
		for(Observer obs: observers ) {
			obs.update(name);
		}
		
	}


	@Override
	public void multado() {
		System.out.println(" Fui multado ");
		
	}

	@Override
	public void estacionado() {
		System.out.println("Estou estacionado");
		
	}


	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		
	}



}
