package br.com.generation.exercicios02_08_21;

import java.util.Scanner;

public class Excercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Programa: Programa Sequ�ncial 1 - Leia a idade de uma pessoa expressa em:
					anos, meses, dias.Mostre-a apenas em dias
		Autor: Raquel Modesto
		Data: 23/07/2021 */
		
		//Declara��o de variaveis
		
				Scanner entrada = new Scanner(System.in);
				
				int idadeAnos;
				int idadeMeses;
				int idadeDias;
				int tda; //total de dias no ano
				int tdm;// total de dias no m�s
				int tdd; // total de dias
				

				System.out.println("Digite sua idade: \n");
				idadeAnos = entrada.nextInt() ;//21

				System.out.println("Ap�s o m�s do seu anivers�rio quantos meses j� se passaram: \n");
				idadeMeses = entrada.nextInt() ;//8

				System.out.println("E quantos dias do m�s: \n");
				idadeDias = entrada.nextInt(); //11

				tda = idadeAnos*365;
				tdm = idadeMeses*30;
				tdd = tda + tdm + idadeDias;

				System.out.println("Sua idade em dias �: " + tdd);
		
				entrada.close();
	}

}
		
		