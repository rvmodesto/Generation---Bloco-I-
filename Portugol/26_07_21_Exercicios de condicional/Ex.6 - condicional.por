programa{
/*Programa: Ex.6 - Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes
categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos
 * Autor: Raquel Modesto
 * Data:26/07/2021 */
	
	funcao inicio()
	{
	// Variáveis
	inteiro  idade


	//Entrada de dados

	escreva("Qual a idade do nadador: ")
	leia(idade)

	
		se(idade >= 5 e  idade < 8)
		
		{
			escreva("A categoria do nadador é: Infantil A")
			}

		senao se(idade >= 7 e  idade < 12)
		{
		escreva("A categoria do nadador é: Infantil B")
		}
		
		senao se(idade >= 12 e  idade < 13)
		{
		escreva("A categoria do nadador é: Juvenil A")
		}
		
		senao se(idade >= 13 e  idade < 17)
		{
		escreva("A categoria do nadador é: Juvenil B")
		}
		
		senao se(idade >= 18)
		{
		escreva("A categoria do nadador é: Adulto")
		}

	senao 
		escreva("Não existe turma para a sua idade!")
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 964; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */