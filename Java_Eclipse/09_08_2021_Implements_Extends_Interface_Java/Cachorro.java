package br.com.generation.herança;

public class Cachorro extends Animal implements Som{

	
	public void movimentoCac() {
		System.out.println("correr e caçar");
	}

	@Override
	public void som() {
		System.out.println("Au au!");
		
	}
}
