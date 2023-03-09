package org.giveawaydognation;

public class Dog{
	
	private String raca;
	private String idade;
	private String local;
	
	public Dog(String raca, String idade, String local) {
		this.idade = idade;
		this.raca = raca;
		this.local = local;
	}
	
	public String getRaca() {
		return this.raca;
	}
	
	public String getIdade() {
		return this.idade;
	}
	
	public String getLocal() {
		return this.local;
	}
	
}