package br.com.generation.exercicios02_08_21;
 
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Programa Sequêncial - 8.Escreva um algoritmo que leia os coeficientes de 
								valorConsumidor, valorFabrica, valorImposto
								e calcule e mostre o valor 
		Autor: Raquel Modesto
		Data: 02/08/2021
		*/
		Scanner entrada = new Scanner(System.in);
		
		double valorConsumidor, valorFabrica, valorImposto, valorDistribuidor;;

		System.out.println("Digite o custo de Fabrica de um carro novo: ");
		valorFabrica = entrada.nextDouble();
	
		valorDistribuidor = valorFabrica*0.28;
		valorImposto = valorFabrica*0.45;

		valorConsumidor = valorFabrica + valorDistribuidor + valorImposto;

		System.out.println("O custo ao consumidor é: " + valorConsumidor);
		
		entrada.close();
	}

}
