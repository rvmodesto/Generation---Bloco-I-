package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Laços de Repetição - Java - Ex. 3:
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		 * idade for =-99. (WHILE)
		 */
		
		Scanner in = new Scanner(System.in);
		
		int idade = 0, menos21 = 0, mais50 = 0;
		
		System.out.println("Digite sua idade (PARA ENCERRAR, DIGITE '-99':");
		
		while(idade != -99) {
			idade = in.nextInt();
			
			if(idade <= 21) {
				menos21++;
			}
			if(idade >= 50) {
				mais50++;
			}
		}

		System.out.println("Total de pessoas com menos de 21 anos: " + menos21);
		System.out.println("Total de pessoas com mais de 50 anos: " + mais50);
		
		in.close();
	}

}
