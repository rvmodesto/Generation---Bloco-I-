package br.com.generation.exercicios.repeticao;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) throws InterruptedException {
		
		/*Laços de Repetição - Java - Ex. 2:
		 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 * Autor: Raquel Modesto
		 * Data: 04/08/2021
		 */

		Scanner in = new Scanner(System.in);
		
		int i, num, impar = 0, par = 0;
		
		for(i=0; i <= 10; i++) {
			System.out.println("Digite um número: ");
			num = in.nextInt();
			
			if(num %2 != 0) {
				impar++;
			}
			else {
				par++;
			}
		}
		System.out.println("Você digitou "+ par + " números pares e " + impar + " números ímpares.");
				
		in.close();
	}
	
}
