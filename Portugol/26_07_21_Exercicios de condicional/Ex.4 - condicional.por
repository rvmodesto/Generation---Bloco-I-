programa{
/*Programa: Ex.4 - leia um nº inteiro e diga se é par ou ímpar
 * 			  - e se é positivo ou negativo
 * Autor: Raquel Modesto
 * Data:26/07/2021 */

	inclua biblioteca Matematica --> mat
	 
	funcao inicio()
	{
		//declaração de variáveis
		inteiro num

		//entrada de dados

		escreva("Digite um número: ")
		leia(num)

			se(num > 0) {
				escreva("O número é positivo")}
				
			senao{ 
				escreva("O número é negativo")
	
				}
	
			se(num % 2 != 0){ 
				escreva(" e ímpar.")
				}
	
			senao{
				escreva(" e par.")
				}
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 529; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */