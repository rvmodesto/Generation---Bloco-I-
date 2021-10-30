package br.com.generation.exercicios_03_08_21;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Laço de decisão - Java - Ex. 1:
		 * Faça um programa que receba três inteiros e diga qual deles é o maior.
		 */
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite três números: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("O maior número é: " + num1);
					}
		else if(num2 >= num1 && num2 >= num3) {
			System.out.println("O maior número é: " + num2);
					}
		else {
			System.out.println("O maior número é: " + num3);
				}
		ler.close();
	}

}
