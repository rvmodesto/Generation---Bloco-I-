package br.com.generation.herança;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Som emitir = new Cachorro();
		
		int animal, som;
		
		
		Cachorro caramelo = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguiça preg = new Preguiça();
		
		caramelo.setNome("Chico");
		caramelo.setIdade(3);
		
		cav.setNome("Tobias");
		cav.setIdade(15);
		
		preg.setNome("Jaqueline");
		preg.setIdade(20);
		
		
		System.out.println("Escolha um animal: 1 - Cachorro | 2 - Cavalo | 3 - Preguiça");
		animal = in.nextInt();
		
		if(animal == 1) {
		System.out.println(caramelo.getNome() + ", o cachorro, tem: " + caramelo.getIdade() + " anos de idade."); }
		
			else if(animal == 2) {
			System.out.println(cav.getNome() + ", o cavalo, tem: " + cav.getIdade() + " anos de idade.");
				}
			else if(animal == 3) {
			System.out.println(preg.getNome() + ", a preguiça, tem: " + preg.getIdade() + " anos de idade.");
			}
		
		else {
			System.out.println("Opção inválida! Escolha uma opção: 1 - Cachorro | 2 - Cavalo | 3 - Preguiça");
			
			}

		
		System.out.println("\nGostaria de saber mais sobre este animal? Digite 1 - Sim, por favor! | 2 - Não, obrigad@!");
		som = in.nextInt();
		
		if(animal == 1 && som == 1) {
			System.out.println();
			emitir.som();
			System.out.println("\n" + caramelo.getNome() + " ama: ");
			caramelo.movimentoCac();
				}
			
			else if	(animal == 2 && som == 1) {
				System.out.println();
				emitir = new Cavalo();
				emitir.som();
				System.out.println("\n" + cav.getNome() + " ama: ");
				cav.movimentoCav();
				}
		
			else if(animal == 3 && som == 1) {
				System.out.println();
				emitir = new Preguiça();
				emitir.som();
				System.out.println("\n" + preg.getNome() + " ama: ");
				preg.movimentoPreg();
				}
		
			else if	(som == 2) {
				
				System.out.println("\nFim!");
				}
		else {
			System.out.println("Opção inválida! Escolha uma opção: 1 - Sim, por favor! | 2 - Não, obrigad@!");	
				}
	
		in.close();
	}

}
