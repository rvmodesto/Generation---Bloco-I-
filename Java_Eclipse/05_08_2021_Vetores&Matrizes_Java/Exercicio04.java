package br.com.generation.vetor.matriz;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Vetor & Matriz - Java - Ex. 4:
		 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
		 *em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
		 *diagonal, ou seja, diagonal principal.
		 * Autor: Raquel Modesto
		 * Data: 05/08/2021
		 */
		
		Scanner in = new Scanner(System.in);
		
		int[][] matriz = new int[3][3]; //[0]--> [4]
		int soma = 0, diagonal = 0;
		
		for(int l = 0; l < 3 ; l++) {
			for(int c = 0; c < 3; c++) {
				System.out.println("Digite os valores da matriz: ");
				matriz[l][c] = in.nextInt();
				
				soma += matriz[l][c];
				diagonal = matriz[0][0] + matriz[1][1] + matriz[2][2]; 
				
				}
			}
		
			System.out.print("\nA soma dos valores da matriz é: " + soma);
			System.out.print("\nA soma da diagonal: " + diagonal);

			in.close();
		}
		
	}

