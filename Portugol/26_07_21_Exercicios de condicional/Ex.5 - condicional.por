programa{
/*Programa: Ex.5 - leia um nº inteiro e diga se é par ou ímpar
 * 			  - e se é positivo ou negativo
 * 			  A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de
indústrias que são altamente poluentes do meio ambiente. O índice de poluição aceitável
varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a
suspenderem suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são
intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição
medido e emita a notificação adequada aos diferentes grupos de empresas.
 * 			  
 * Autor: Raquel Modesto
 * Data:26/07/2021 */

	funcao inicio()
	{
		real indicePoluicao, aceitavel, suspender, paralisar

	

		//Entrada de dados

		escreva("Insira o Índice de Poluição: ")
		leia(indicePoluicao)

		se(indicePoluicao >= 0 e indicePoluicao < 0.3) {
			escreva("O nível de poluição é Aceitável.")
			}

		senao se(indicePoluicao >= 0.3 e indicePoluicao < 0.4) {
			escreva("O nível de poluição está alto. As indústrias do 1º grupo devem suspender suas atividades imediatamente!")
			}

		senao se(indicePoluicao >= 0.4 e indicePoluicao < 0.5) {
			escreva("O nível de poluição está alto. As indústrias do 1º e 2º grupo devem suspender suas atividades imediatamente!")
			}

		 senao se(indicePoluicao >= 0.5) {
			escreva("O nível de poluição está MUITO alto. Todos os grupos das indústrias devem suspender suas atividades imediatamente!")
			}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1003; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */