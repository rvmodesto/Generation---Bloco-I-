package br.com.generation.exercicios02_08_21;

import java.util.Scanner;
public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa Sequêncial 2 - Leia a idade em dias. Mostre a 
		 * 						idade total em anos, meses e dias
		 * Autor: Raquel Modesto
		 * Data: 02/08/2021
		 */
		Scanner entrada = new Scanner(System.in);
		
		 int anos, meses, dias, resto, resto2, totaldedias;
	
		 	System.out.println("Digite Sua Idade em dias: ");
	        totaldedias = entrada.nextInt();

	        anos = totaldedias / 365;
	        resto = totaldedias % 365;
	        meses = resto / 30;
	        resto2 = resto % 30;

	        System.out.println("Você tem " + anos + " anos, " + meses 
	        					+ " meses e " + resto2 + " dia(s).");
	        
			entrada.close();
	}

}
