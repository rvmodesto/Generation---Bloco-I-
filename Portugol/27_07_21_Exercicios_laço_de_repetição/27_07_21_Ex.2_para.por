programa{
/* Programa: Ex. Laços de Repetição 2 - PARA: Desenvolver um sistema que efetue a soma de todos os números ímpares que são
								múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 * Autor: Raquel Modesto
 * Data:27/07/2021 */
	funcao inicio()
	{
	 //Variáveis

	 inteiro num =0, x = 1

		para(x = 1; x <= 500; x++){
	
	 		se(x % 2 != 0 e x % 3 == 0){ 
 				num = num + x	
				}
	
			}

		escreva("A soma  de todos os números ímpares, \n múltiplos de 3 e que estão entre 1 e 500 são:" + num)
			
   }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 491; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */