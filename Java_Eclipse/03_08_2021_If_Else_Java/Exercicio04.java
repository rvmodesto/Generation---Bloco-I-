package br.com.generation.exercicios_03_08_21;

import java.util.Scanner;
import java.lang.*;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Laço de decisão - Java - Ex. 4:
		 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
		   número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		   ímpar exiba o número elevado ao quadrado.
		 */
		Scanner ler = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um número: ");
		numero = ler.nextDouble();
		
		if(numero % 2 !=0){
				System.out.println("O número " + numero + " é ímpar.\n");
				System.out.println(numero + "²: " + Math.pow(numero, 2));
				}
			else {
				System.out.println("O número " + numero + " é par.");
				System.out.println("A raiz quadrada de: " + numero + " é: "+ Math.sqrt(numero));
			}			
		
			ler.close();
	
	}

}
