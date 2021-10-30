package br.com.generation.exercicios02_08_21;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa Sequêncial 7 - 	Escreva um algoritmo que leia os coeficientes
			   						a, b, c, d, j, f,
			  						e calcule e mostre os valores de x e y
		 * Autor: Raquel Modesto
		 * Data: 02/08/2021
		 */
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c, d, j, f, x, y;

		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
	
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
	
		System.out.println("Digite o valor de D: ");
		d = entrada.nextDouble();

		System.out.println("Digite o valor de J: ");
		j = entrada.nextDouble();
	
		System.out.println("Digite o valor de F: ");
		f = entrada.nextDouble();
	
		x = ((c*j) - (b*f)) / ((a*j) - (b*d));
		y = ((a*f) - (c*d)) / ((a*j) - (b*d));

		System.out.println( "O valor de X é: " + x);
		System.out.println( "\n O valor de Y é: " + y);
		
		entrada.close();
	}

}
