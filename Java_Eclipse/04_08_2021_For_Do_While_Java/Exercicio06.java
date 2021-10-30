package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*Laços de Repetição - Java - Ex. 6:
		 *Escrever um programa que receba vários números inteiros no teclado. E no
		 *final imprimir a média dos números múltiplos de 3. Para sair digitar
		 *0(zero).(DO...WHILE)
		 * Autor: Raquel Modesto
		 * Data: 04/08/2021 */
		
			Scanner in = new Scanner(System.in);
			
			int num = 0, soma = 0;
			double media = 0;
			
			do {
				System.out.println("Digite um número: " );
				num = in.nextInt();

				if(num % 3 == 0) {
					media = media + num;
					soma++;
				}
			}while(num != 0);
			
			media = media / soma;
			
			System.out.println("A média dos números multiplos de 3 inseridos é: " + media);
		
		in.close();
	}

}
