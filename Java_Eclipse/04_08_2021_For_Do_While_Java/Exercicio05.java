package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*Laços de Repetição - Java - Ex. 5:
		 * Crie um programa que leia um número do teclado até que encontre um
		 * número igual a zero. No final, mostre a soma dos números
		 * digitados.(DO...WHILE)
		 */
		
		Scanner in = new Scanner(System.in);
		
		int num =  0, soma = 0 ;
		
		do {
			System.out.println("Digite um número: ");
			num = in.nextInt();
			soma = soma + num;
			}
		
		while(num != 0);
	
	
		System.out.println("A soma é: " + soma);
		
		in.close();
	}
	
}
