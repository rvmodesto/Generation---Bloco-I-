programa
{/*Programa Sequêncial 4 - leia o valor de A, B, C 
					- Calcule o valor de R, S, D 
 * Autor: Raquel Modesto
 * Data: 23/07/2021
 */

	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real a, b, c, r, d, s

		escreva("Digite o valor de A: ")
		leia(a)

		escreva("Digite o valor de B: ")
		leia(b)
		
		escreva("Digite o valor de C: ")
		leia(c)

		r = mat.potencia (a+b, 2.0)
		s = mat.potencia (b+c, 2.0)
		d = ((r + s)/2.0)

		escreva("o valor de R é: " + r + 
		"\n o valor de S é: " + s + 
		"\n O valor de D é: " + d)
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 145; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */