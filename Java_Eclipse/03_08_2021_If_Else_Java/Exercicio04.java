package br.com.generation.exercicios_03_08_21;

import java.util.Scanner;
import java.lang.*;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*La�o de decis�o - Java - Ex. 4:
		 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
		   n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
		   �mpar exiba o n�mero elevado ao quadrado.
		 */
		Scanner ler = new Scanner(System.in);
		
		double numero;
		
		System.out.println("Digite um n�mero: ");
		numero = ler.nextDouble();
		
		if(numero % 2 !=0){
				System.out.println("O n�mero " + numero + " � �mpar.\n");
				System.out.println(numero + "�: " + Math.pow(numero, 2));
				}
			else {
				System.out.println("O n�mero " + numero + " � par.");
				System.out.println("A raiz quadrada de: " + numero + " �: "+ Math.sqrt(numero));
			}			
		
			ler.close();
	
	}

}
