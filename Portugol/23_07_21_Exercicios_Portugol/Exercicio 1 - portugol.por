programa{
/*Programa: Programa Sequêncial 1 - Leia a idade de uma pessoa expressa em:
 * 							anos, meses, dias
 * 							Mostre-a apenas em dias
 * Autor: Raquel Modesto
 * Data: 23/07/2021
*/
	funcao inicio(){
		
		//Declaração de variaveis
		inteiro idadeAnos
		inteiro idadeMeses
		inteiro idadeDias 
		inteiro tda //total de dias no ano
		inteiro tdm // total de dias no mês
		inteiro tdd // total de dias
		

		escreva("Digite sua idade: \n")
		leia(idadeAnos) //21

		escreva("Após o mês do seu aniversário quantos meses já se passaram: \n")
		leia(idadeMeses) //8

		escreva("E quantos dias do mês: \n")
		leia(idadeDias) //11

		tda = idadeAnos*365
		tdm = idadeMeses*30
		tdd = tda + tdm + idadeDias

		escreva("Sua idade em dias é: " + tdd)

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 140; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */