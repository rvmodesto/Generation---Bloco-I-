package br.com.generation.exercicios.repeticao;

public class Exercicio01 {

	public static void main(String[] args) {
		/*Laços de Repetição - Java - Ex. 1:
		 * Informar todos os números de 1000 a 1999 que quando divididos por 11
		 * obtemos resto = 5. (FOR)
		 * Autor: Raquel Modesto
		 * Data: 04/08/2021
		 */
		int i;
		
		for(i = 1000; i <= 1999; i++) {
			if(i % 11 == 5) {
				System.out.println(i);
			}
		}
	}
}
