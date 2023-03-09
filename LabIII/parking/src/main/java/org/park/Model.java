package org.park;


import java.util.List;
import java.util.LinkedList;


public class Model {
	
	private List<Carro> carros = new LinkedList<Carro>();

	public Model() {
		addCarro(new Carro("AAA1111", new Especificacao("gol", "vw", "verde")));
		addCarro(new Carro("AAA1113", new Especificacao("gol", "vw", "vermelho")));
		addCarro(new Carro("AAA1112", new Especificacao("fox", "vw", "vermelho")));
	}
	
	public void addCarro(Carro carro){
		carros.add(carro);
	}
	
	public Carro buscarPlaca(String placa){
		for(Carro carro:carros){
			if(carro.getPlaca().equals(placa)) return carro;
		}
		
		return null;
	}
	
	
	public List<Carro> buscarEspecificacao(Especificacao esp){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		
		for(Carro carro:carros){
			 if(esp.comparar(carro.getEspc())) carrosEncontrados.add(carro);
		}
		
		return carrosEncontrados;
		
	}
	
	
	public List<Carro> buscarModelo(String modelo){
		List<Carro> carrosEncontrados = new LinkedList<Carro>();
		for(Carro carro:carros) {
			if(carro.getEspc().getModelo().equals(modelo)) carrosEncontrados.add(carro);
		}
		return carrosEncontrados;
	}
	
	public List<Carro> getCarros(){
		return carros;
	}

}
