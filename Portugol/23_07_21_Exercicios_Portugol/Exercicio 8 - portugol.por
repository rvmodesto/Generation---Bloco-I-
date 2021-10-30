programa {
	/*Programa Sequêncial - 8.
	Escreva um algoritmo que leia os coeficientes de 
	valorConsumidor, valorFabrica, valorImposto
	e calcule e mostre o valor 
	*/

	funcao inicio() {
		
		real valorConsumidor, valorFabrica, valorImposto, valorDistribuidor

		escreva("Digite o custo de Fabrica de um carro novo: ")
		leia(valorFabrica)
	
		valorDistribuidor = valorFabrica*0.28
		valorImposto = valorFabrica*0.45

		valorConsumidor = valorFabrica + valorDistribuidor + valorImposto

		escreva("O custo ao consumidor é: " + valorConsumidor)
	
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 553; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */