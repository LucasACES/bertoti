package models.entities;


import models.interfaces.Carro;
import models.interfaces.Observer;

public class AgenteDeTransito implements Carro, Observer{
	
	private CarroSuspeito carroSuspeito;
	
	private String placa;
	private Double km;
	private String name;
	
	


	public AgenteDeTransito(CarroSuspeito carroSuspeito, String placa, Double km, String name) {
		this.carroSuspeito = carroSuspeito;
		this.placa = placa;
		this.km = km;
		this.name = name;
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
	public void multado() {
		System.out.println("o fulano levou multa");
		
	}

	@Override
	public void estacionado() {
		System.out.println("Cicrano está estacionado");
		
	}




	@Override
	public void update(String str) {
		System.out.println("mudança no estado");
		
	}



}
