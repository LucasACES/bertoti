package org.giveawaydognation;


import java.util.List;

import org.park.Carro;

import java.util.LinkedList;



public class Model{
	
	private List<Dog> dogs = new LinkedList<Dog>();
	
	public Model() {
		addDog(new Dog("catioro","1","sjc"));
		addDog(new Dog("catiorinho","2","sjc"));
		addDog(new Dog("catiorao","3","sjc"));
	}
	
	public void addDog(Dog dog) {
		dogs.add(dog);
	}
	
	public List<Dog> buscarDog(String raca, String idade){
		List<Dog> dogsEncontrados = new LinkedList<Dog>();
		for(Dog dog:dogs) {
			if(dog.getRaca().equals(raca)) dogsEncontrados.add(dog);
		}
		return dogsEncontrados;}
}
















