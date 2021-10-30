package br.com.generation.herança;

public class Preguiça extends Animal implements Som{

	public void movimentoPreg() {
		System.out.println("subir em árvores");
	}
	
	@Override
	public void som() {
		System.out.println("zzzzzzzz");
		
	}
}
