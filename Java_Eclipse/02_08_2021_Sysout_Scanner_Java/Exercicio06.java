package br.com.generation.exercicios02_08_21;

import java.util.Scanner;

import java.lang.Math;

public class Exercicio06 {

public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Programa Sequêncial 6 - 
		 * Autor: Raquel Modesto
		 * Data: 02/08/2021
		 */

				double x1, x2, y1, y2, p1, p2, d;
				
				Scanner entrada = new Scanner(System.in);
				
				System.out.println("Digite o valor de X do Primeiro Ponto: \n");
				x1 = entrada.nextDouble();

				System.out.println("Digite o valor de Y do Primeiro Ponto: \n");
				y1 = entrada.nextDouble();

				System.out.println("Digite o valor de X do Segundo Ponto: \n");
				x2 = entrada.nextDouble();

				System.out.println("Digite o valor de Y do Segundo Ponto: \n");
				y2 = entrada.nextDouble();

				p1 = Math.pow((x2-x1), 2.0);
				p2 = Math.pow((y2-y1), 2.0);
				d = Math.sqrt((p1 + p2));

				System.out.println("A distância entre os pontos é: " + d);
				
				entrada.close();
	}

}
