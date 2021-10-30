programa{
/*Programa: Ex.1 - Controle de Rendimento diário - Seu João
 * Autor: Raquel Modesto
 * Data:26/07/2021
 */
	funcao inicio()
	{
		//Declaração de Variáveis
		real P //peso dos tomates
		real E //valor do excesso 
		real M //valor da multa
		//Entrada de dados
		escreva("Insira a quantidade em kilos do tomate: ")
		leia(P)

		E = P - 50.0
		M = (E*4)
		
		//Processamento de dados

		se(P > 50.00){
			escreva("Você excedeu o limite em " + E + "kg")
			escreva("\nO valor da multa é de R$" + M)		
		}
		senao {
			escreva("Você excedeu o limite em 0 kg. " + "\nO valor da multa é: R$0,00") 
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 576; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */