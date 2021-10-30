programa{
/* 7) Receber valores de base e altura de um triângulo
e verificar se são valores válidos
(positivos maiores que zero) 
 * Autor: Raquel Modesto
 * Data:26/07/2021 */


funcao inicio() {

	real base, altura, area

	escreva("Entre com a base do Triangulo: ")
	leia(base)

	escreva("Entre com a altura do Triangulo: ")
	leia(altura)

	se(base > 0 e altura >0){
		area = (base*altura) /2

		escreva("\nA área do triangulo é: " + area)
			}
	senao{
		escreva("\nValores Inválidos!")
			}

		}
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 468; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */