package br.com.generation.exercicios02_08_21;

import java.util.Scanner;
import java.lang.Math;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double nota1, nota2, nota3, mediaFinal;

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da Primeira Nota: ");
		nota1 = entrada.nextDouble();

		System.out.println("Digite o valor da Segunda Nota: ");
		nota2 = entrada.nextDouble();

		System.out.println("Digite o valor da Terceira Nota: ");
		nota3 = entrada.nextDouble();

		mediaFinal = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;

		System.out.println("A Média Final é: " + mediaFinal);
		
		entrada.close();
	}

}
