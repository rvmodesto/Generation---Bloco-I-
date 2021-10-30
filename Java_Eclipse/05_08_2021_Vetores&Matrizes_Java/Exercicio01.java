package br.com.generation.vetor.matriz;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Vetor & Matriz - Java - Ex. 1:
		 * Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
		 *atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
		 * Autor: Raquel Modesto
		 * Data: 05/08/2021
		 */

		Scanner in = new Scanner(System.in);
		
		double[] pontuacao = new double[5]; //[0]--> [4]
		double maior = 0;
		System.out.println("Insira o valor da pontua��o: ");
		
		for(int i = 0; i <= 4; i++) {
			pontuacao[i] = in.nextDouble();
			if(pontuacao[i] > maior) {
				maior = pontuacao[i];
			}
		}
	
		System.out.println("\nA maior pontua��o  �: " + maior);		
		
		in.close();
	}

}
