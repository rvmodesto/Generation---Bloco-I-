programa{
/*Programa: Ex.3 -Leia 4 (quatro) números;
	- Calcule o quadrado de cada um;
	- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	- Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 * Autor: Raquel Modesto
 * Data:26/07/2021 */

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
	//Declaração de variáveis
	inteiro num1, num2, num3, num4
	
		//Entrada de dados

		escreva("Insira o 1º número: ")
		leia(num1)
	
		escreva("Insira o 2º número: ")
		leia(num2)

		escreva("Insira o 3º número: ")
		leia(num3)

		escreva("Insira o 4º número: ")
		leia(num4)

		limpa()
		//Processamento de dados
		
		mat.potencia(num1, 2)
		mat.potencia(num2, 2)
		mat.potencia(num3, 2)
		mat.potencia(num4, 2)

			se(mat.potencia(num3, 2) >= 1000){ 
	
			escreva(num3 + "² é: " + mat.potencia(num3, 2))
			}
		
			senao{
			escreva("O valor de " + num1 + "² é: " + mat.potencia(num1, 2))
			escreva("\nO valor de " + num2 + "² é: " + mat.potencia(num2, 2))
			escreva("\nO valor de " + num3 + "² é: " + mat.potencia(num3, 2))
			escreva("\nO valor de " + num4 + "² é: " + mat.potencia(num4, 2))
			}
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 640; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */