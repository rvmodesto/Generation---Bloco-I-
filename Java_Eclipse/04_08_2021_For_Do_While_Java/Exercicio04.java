package br.com.generation.exercicios.repeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*Laços de Repetição - Java - Ex. 4:
		 * 
		 * Autor: Raquel Modesto
		 * Data: 04/08/2021
		 */
		
		int idade, sexo, fP, numpessoas = 0, contPC = 0, contMN = 0,
			contHA = 0, contPN40 = 0, contPC18 = 0, contOC = 0;
		
		Scanner in = new Scanner(System.in);
		
		while(numpessoas <= 150) { 
			System.out.println("Digite sua idade: ");
			idade = in.nextInt();
			
			while(idade <= 0 || idade >= 130) {
				System.out.println("Você provavelmente digitou sua idade errada.");
				System.out.println("Por favor informe sua idade novamente: ");
				idade = in.nextInt();
			}
			
			System.out.println("Digite o sexo: 1 - Fem. | 2- Masc. | 3 - Outro");
			sexo = in.nextInt();
			
			while(sexo <=0 || sexo >3) {
				System.out.println("Opção inválida! Digite o número correspondente ao sexo");
				System.out.println(" 1 - Feminino | 2 -  Masculino | 3 - Outros:");
				sexo = in.nextInt();
			}
			
			System.out.println("Entre com o Fator psicológico.");
			System.out.println("1 - Calma | 2 - Nervosa | 3 - Agressiva");
			fP = in.nextInt();
			
			while(fP <=0 || fP >3) {
				System.out.println("Opção inválida! Digite o número correspondente ao Fator Psicológico.");
				System.out.println("1 - Calma | 2 - Nervosa | 3 - Agressiva");
				fP = in.nextInt();
			}
			
			if(fP == 1) {
				contPC++;
			}
			
			if(sexo == 1 && fP == 2) {
				contMN++;
			}
			
			if(sexo == 2 && fP == 3) {
				contHA++;
			}
			
			if(sexo == 3 && fP == 1) {
				contOC++;
			}
			
			if(fP == 2 && idade > 40) {
				contPN40++;
			}
			
			if(fP == 1 && idade < 18) {
				contPC18++;
			}
			numpessoas++;
		}
		in.close();
		
		System.out.println("Pessoas Calmas: " + contPC);
		System.out.println("Mulheres Nervosas: " + contMN);
		System.out.println("Homens Agressivos: " + contHA);
		System.out.println("Outros Calmos: " + contOC);
		System.out.println("Pessoas Nervosas com mais de 40 anos: " + contPN40);
		System.out.println("Pessoas Calmas com menos de 18 anos: " + contPC18);
		
	}

}
