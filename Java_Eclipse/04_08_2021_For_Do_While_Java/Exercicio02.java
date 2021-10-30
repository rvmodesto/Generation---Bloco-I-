package br.com.generation.exercicios.repeticao;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) throws InterruptedException {
		
		/*La�os de Repeti��o - Java - Ex. 2:
		 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		 * Autor: Raquel Modesto
		 * Data: 04/08/2021
		 */

		Scanner in = new Scanner(System.in);
		
		int i, num, impar = 0, par = 0;
		
		for(i=0; i <= 10; i++) {
			System.out.println("Digite um n�mero: ");
			num = in.nextInt();
			
			if(num %2 != 0) {
				impar++;
			}
			else {
				par++;
			}
		}
		System.out.println("Voc� digitou "+ par + " n�meros pares e " + impar + " n�meros �mpares.");
				
		in.close();
	}
	
}
