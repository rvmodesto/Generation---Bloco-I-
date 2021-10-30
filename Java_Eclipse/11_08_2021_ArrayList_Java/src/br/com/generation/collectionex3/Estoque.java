package br.com.generation.collectionex3;

import java.util.ArrayList;

public class Estoque {

	public static void main(String[] args) {
		
		String estoque1 = "7 Belo";
		String estoque2 = "Babaloo";
		String estoque3 = "Mentos";
		String estoque4 = "Trident";
		String estoque5 = "Bala de Coca";
		
		ArrayList<String> bala = new ArrayList<>();
		bala.add(estoque1);
		bala.add(estoque2);
		bala.add(estoque3);
		bala.add(estoque4);
		bala.add(estoque5);
		
		System.out.println(bala);
	
		bala.remove(4);
		
		System.out.println(bala);
		
		for(String i: bala) {
			System.out.println("\nMarcas em estoque: "+ i);
		}
			
	}
}