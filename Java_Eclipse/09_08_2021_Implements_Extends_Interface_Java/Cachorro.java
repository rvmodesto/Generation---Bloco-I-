package br.com.generation.heran�a;

public class Cachorro extends Animal implements Som{

	
	public void movimentoCac() {
		System.out.println("correr e ca�ar");
	}

	@Override
	public void som() {
		System.out.println("Au au!");
		
	}
}
