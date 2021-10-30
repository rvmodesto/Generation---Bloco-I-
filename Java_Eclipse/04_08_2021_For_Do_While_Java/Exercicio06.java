package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*La�os de Repeti��o - Java - Ex. 6:
		 *Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
		 *final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
		 *0(zero).(DO...WHILE)
		 * Autor: Raquel Modesto
		 * Data: 04/08/2021 */
		
			Scanner in = new Scanner(System.in);
			
			int num = 0, soma = 0;
			double media = 0;
			
			do {
				System.out.println("Digite um n�mero: " );
				num = in.nextInt();

				if(num % 3 == 0) {
					media = media + num;
					soma++;
				}
			}while(num != 0);
			
			media = media / soma;
			
			System.out.println("A m�dia dos n�meros multiplos de 3 inseridos �: " + media);
		
		in.close();
	}

}
