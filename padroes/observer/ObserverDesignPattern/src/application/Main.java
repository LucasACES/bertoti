package application;

import models.entities.AgenteDeTransito;
import models.entities.CarroSuspeito;

public class Main {

	public static void main(String[] args) {
		CarroSuspeito carSus = new CarroSuspeito("ABC123", 55.52, "Geovani");
		AgenteDeTransito agt = new AgenteDeTransito(carSus, "KKK124", 30.00, "Cleiton");
		
		carSus.addObserver(agt);
		carSus.multado();
		carSus.estacionado();
		carSus.notifyObservers();
	}

}
