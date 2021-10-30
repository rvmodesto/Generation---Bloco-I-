programa{
/* Programa: Ex. Vetores e Matrizes - 3 : 
 *  			Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 *  			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			
			b) Uma matriz M/2 cujos elementos serão as diferenças dos elementos de mesma
			posição das matrizes N1 e N2.
 * Autor: Raquel Modesto
 * Data:29/07/2021 */	
	funcao inicio(){
	
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], l, c

		para(l =0; l < 4; l++){ //pegar o valor 
			para(c=0; c<6; c++){
				escreva("Entre com N1: ")
				leia(n1[l][c])
				escreva("Entre com N2: ")
				leia(n2[l][c])

				m1[l][c] = n1[l][c] + n2[l][c]
				m2[l][c] = n1[l][c] - n2[l][c]
			}

		para(l=0; l<4; l++){ //resgatar valores e mostrar
			para(c=0;c<6; c++){
				escreva("\nMatriz M1: " + m1[l][c])
				escreva("\nMatriz M2: " + m2[l][c])

				}
			}
	    }
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 887; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {m2, 13, 40, 2}-{m1, 13, 30, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */