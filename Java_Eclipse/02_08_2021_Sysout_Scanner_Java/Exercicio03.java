package br.com.generation.exercicios02_08_21;

import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa Sequêncial 3 - Leia o tempo de duração de um evento
		 * 					Mostre-o em horas, minutos e segundos
		 * Autor: Raquel Modesto
		 * Data: 02/08/2021
		 */
		Scanner entrada = new Scanner(System.in);
		
		int horas, minutos, segundos;
		
		System.out.println("Digite a duração do evento em segundos: ");
		segundos = entrada.nextInt();

		minutos = segundos / 60;
		horas = minutos / 60;

		System.out.println("O tempo do evento expresso em: " 
		+ "horas é: " + horas +
		 "\n minutos é: " + minutos + 
		 "\n segundos é: " +segundos); //180000
		
		entrada.close();
	}

}
