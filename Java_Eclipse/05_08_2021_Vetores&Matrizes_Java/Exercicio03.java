package br.com.generation.vetor.matriz;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*Vetor & Matriz - Java - Ex. 3:
		 * Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
		 * 
		 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		 * das matrizes N1 e N2;
		 * 
		 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		 * posição das matrizes N1 e N2.
		 * Autor: Raquel Modesto
		 * Data: 05/08/2021
		 */
		
		Scanner in = new Scanner(System.in);
	
		int[][] n1 = new int[4][6], n2 = new int[4][6];
		int[][] m1 = new int[4][6], m2 = new int[4][6];
		
		
				for(int l = 0; l < 4; l++) {
					for(int c = 0; c < 6; c++) {
						
						System.out.println("Digite os valores de N1: ");
						n1[l][c] = in.nextInt();
						
						System.out.println("Digite os valores de N2: 1");
						n2[l][c] = in.nextInt();
						
						m1[l][c] = n1[l][c] + n2[l][c];
						m2[l][c] = n1[l][c] - n2[l][c];		
						
					}
				
				System.out.println("Matriz M1: \n");				
				for(int l1 = 0; l1 < 4; l1++) {
					for(int c = 0; c < 6; c++) {
						System.out.printf(" [ " + m1[l1][c] + " ] ");
					}
				}
				
				System.out.println("Matriz M2: \n");				
				for(int l1 = 0; l1 < 4; l1++) {
					for(int c = 0; c < 6; c++) {
						System.out.println(" [" + m2[l1][c] + "] ");
					}
				}
				System.out.println("");
				}
		in.close();
		
	}

}
