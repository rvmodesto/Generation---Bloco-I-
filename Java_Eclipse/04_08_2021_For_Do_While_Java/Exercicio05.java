package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*La�os de Repeti��o - Java - Ex. 5:
		 * Crie um programa que leia um n�mero do teclado at� que encontre um
		 * n�mero igual a zero. No final, mostre a soma dos n�meros
		 * digitados.(DO...WHILE)
		 */
		
		Scanner in = new Scanner(System.in);
		
		int num =  0, soma = 0 ;
		
		do {
			System.out.println("Digite um n�mero: ");
			num = in.nextInt();
			soma = soma + num;
			}
		
		while(num != 0);
	
	
		System.out.println("A soma �: " + soma);
		
		in.close();
	}
	
}
