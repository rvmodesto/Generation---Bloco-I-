package br.com.generation.exercicios_03_08_21;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Laço de decisão - Java - Ex. 3:
		 * Faça um programa que receba a idade de uma pessoa e
		 *  mostre na saída em qual categoria ela se encontra:
				- 10-14 infantil
				- 15-17 juvenil
				- 18-25 adulto
		 * 
		 */
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = ler.nextInt();
		
		if(idade >= 10 && idade <= 15) {
			System.out.println("Sua categoria é: Infantil.");
				}
		
				else if(idade >=15 && idade <= 18) {
						System.out.println("Sua categoria é: Juvenil.");
						}
		
				else if(idade >= 18 && idade <= 25) {
						System.out.println("Sua categoria é: Adulto.");
						}
		
				else {
					System.out.println("Não existe categoria para esta idade.");
				}
		
		ler.close();
		
  }

}
