package br.com.generation.herança;

public class Cavalo extends Animal implements Som {

	public void movimentoCav() {
		System.out.println("correr e trotar");
	}
	
	@Override
	public void som() {
		System.out.println("hiin in in hinir");
		
	}
}
