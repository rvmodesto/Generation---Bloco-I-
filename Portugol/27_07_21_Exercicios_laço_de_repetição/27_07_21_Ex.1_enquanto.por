programa{
/* Programa: Ex. Laços de Repetição 1 - Enquanto: 
 *  				Elaborar um programa que efetue a leitura sucessiva de valores numéricos e					
 *  				a presente no final o total do somatório, a média e o total de valores lidos. 
 *  				O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
				positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo. 
 * Autor: Raquel Modesto
 * Data:27/07/2021 */

	funcao inicio() {
		
		inteiro num, somaNum = 0, contNum = 0

		escreva("Entre com um número: ")
		leia(num)

		enquanto(num >= 0){
			
			somaNum = somaNum + num
			contNum++
			
			escreva("Leia um número:")
			leia(num0

		}

		mediaNum = somaNum / contNum

		escreva("\nSomatório de números: " + somaNum)
		escreva("\nMédia dos Números: " + mediaNum)
		escreva("\nQuantidade de números lidos: " + contNum)

   }

}
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */