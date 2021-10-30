package br.com.generation.vetor.matriz;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*Vetor & Matriz - Java - Ex. 2:
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		 *que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		 *imprima a média aritmética dos lançamentos, contabilize e apresente também
		 *quantas foram as ocorrências da maior pontuação.
		 * Autor: Raquel Modesto
		 * Data: 05/08/2021
		 */
		Scanner in =  new Scanner(System.in);

		int[] lancamento = new int[10];
		int maiorPontuacao = 0, soma = 0;
		double media;
		
		for(int i = 0; i < lancamento.length; i++) {
			System.out.println("Digite o valor do lançamento:  ");
			lancamento[i] = in.nextInt();
			soma+= lancamento[i];
			
			if(lancamento[i] >= 6) {
				maiorPontuacao++;
					}
		}
		
		media = soma / 10;
		
		System.out.println("\nMédia dos lançamentos: " + media);
		System.out.println("Quantidade de vezes que a maior pontuação (6) apareceu: " + maiorPontuacao);
		in.close();
	}

}
