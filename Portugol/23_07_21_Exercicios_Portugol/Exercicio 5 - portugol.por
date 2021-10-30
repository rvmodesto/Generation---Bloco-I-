programa {
/*Programa Sequêncial 5 - Leia 3 notas de um aluno
 * 					Calcule a média ponderada deste aluno
 * Autor: Raquel Modesto
 * Data: 23/07/2021
 */
 
	funcao inicio()
	{
	real nota1, nota2, nota3, mediaFinal

	escreva("Digite o valor da Primeira Nota: ")
	leia(nota1)

	escreva("Digite o valor da Segunda Nota: ")
	leia(nota2)

	escreva("Digite o valor da Terceira Nota: ")
	leia(nota3)

	mediaFinal = ((nota1*2) + (nota2*3) + (nota3*5)) / 10

	escreva("A Média Final é: " + mediaFinal)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */