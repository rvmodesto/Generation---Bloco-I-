package br.com.generation.exercicios02_08_21;

import java.util.Scanner;

import java.lang.Math;

public class Exercicio04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Programa Sequêncial 4 - leia o valor de A, B, C 
								- Calcule o valor de R, S, D 
		 * Autor: Raquel Modesto
		 * Data: 02/08/2021
		 */
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c, r, d, s;

		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();

		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();

		r = Math.pow (a+b, 2.0);
		s = Math.pow (b+c, 2.0);
		d = ((r + s)/2.0);

		System.out.println("O valor de R é: " + r + 
		"\nO valor de S é: " + s + 
		"\nO valor de D é: " + d);
		
		entrada.close();
	}

}
