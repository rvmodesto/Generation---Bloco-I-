package br.com.generation.exercicios_03_08_21;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*La�o de decis�o - Java - Ex. 2:
		 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
		 */
		Scanner ler = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.println("Digite tr�s n�meros: ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if(num1 <= num2 && num2 <= num3) {
			System.out.println("\nOrdem crescente: " + num1 + num2 + num3);//ok
		}
			
			else if(num1 <= num3 && num3 <= num2) {
				System.out.println("\nOrdem crescente: " + num1 + num3 + num2);//ok
					}
		
			else if(num2 <= num1 && num1<= num3) {
				System.out.println("\nOrdem crescente: " + num2 + num1 + num3);//ok
						}
		
			else if(num2 <= num3 && num3<= num1) {
				System.out.println("\nOrdem crescente: " + num2 + num3 + num1);//ok
						}
		
			else if(num3 <= num1 && num1<= num2) {
					System.out.println("\nOrdem crescente: " + num3 + num1 + num2);
						}

		else {
			System.out.println("Ordem crescente: " + num3 + num2 + num1);
			}
		
		ler.close();
	}

}
