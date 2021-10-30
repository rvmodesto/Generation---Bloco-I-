package br.com.generation.vetor.matriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Vetor & Matriz - Java - Ex. 2:
		 * Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
		 *que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
		 *imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
		 *quantas foram as ocorr�ncias da maior pontua��o.
		 * Autor: Raquel Modesto
		 * Data: 05/08/2021
		 */
		Scanner in =  new Scanner(System.in);

		int[] lancamento = new int[10];
		int maiorPontuacao = 0, soma = 0;
		double media;
		
		for(int i = 0; i < lancamento.length; i++) {
			System.out.println("Digite o valor do lan�amento:  ");
			lancamento[i] = in.nextInt();
			soma+= lancamento[i];
			
			if(lancamento[i] >= 6) {
				maiorPontuacao++;
					}
		}
		
		media = soma / 10;
		
		System.out.println("\nM�dia dos lan�amentos: " + media);
		System.out.println("Quantidade de vezes que a maior pontua��o (6) apareceu: " + maiorPontuacao);
		in.close();
	}

}
