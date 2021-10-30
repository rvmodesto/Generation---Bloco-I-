programa{
/* Programa: Ex. Vetores e Matrizes - 2: 
 *  				Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
				que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
				imprima a média aritmética dos lançamentos, contabilize e apresente também
				quantas foram as ocorrências da maior pontuação.
 * Autor: Raquel Modesto
 * Data:29/07/2021 */	
 
 	inclua biblioteca Util --> u
	funcao inicio(){
	inteiro lancamento[10]/*[0][1]...[9]*/, x, soma = 0, maiorPontuacao = 0, maior = 0
	real mediaLancamento

	para(x=0; x <= 9; x++){
		//escreva("Entre com o lançamento: ")
		//leia(lancamento[x])//6 5
		lancamento[x] = u.sorteia(1,6)

		soma = soma + lancamento[x]//6 5
		se(lancamento[x] == 6){
			maiorPontuacao++
		}
		se(maior < lancamento[x]){
		   maior = lancamento[x]
		}
	  }
	  para(x=0; x <=9; x++){
	  	escreva("\nLançamento: " + (x+1)/*tirar da posição 0 */ + "º " + lancamento[x])
	  }
	  
	  mediaLancamento = soma / 10.0
	  escreva("\nMédia lançamentos: " + mediaLancamento) 
	  escreva("\nQuantidade da maior pontuação: " + maiorPontuacao 
	           + " e o maior lançamento foi de: " + maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1047; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */