programa{
	/*Programa Sequêncial 7 - 
 * Autor: Raquel Modesto
 * Data: 23/07/2021
 */
	/*7.Escreva um algoritmo que leia os coeficientes
	   a, b, c, d, j, f,
	   e calcule e mostre os valores de x e y
	*/

	funcao inicio() {
	
		real a, b, c, d, j, f, x, y

		escreva("Digite o valor de A: ")
		leia(a)
	
		escreva("Digite o valor de B: ")
		leia(b)
	
		escreva("Digite o valor de C: ")
		leia(c)
	
		escreva("Digite o valor de D: ")
		leia(d)

		escreva("Digite o valor de J: ")
		leia(j)
	
		escreva("Digite o valor de F: ")
		leia(f)
	
		x = ((c*j) - (b*f)) / ((a*j) - (b*d))
		y = ((a*f) - (c*d)) / ((a*j) - (b*d))

		escreva( "O valor de X é: " + x)
		escreva( "\n O valor de Y é: " + y)
	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 659; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */