programa
{/*Programa Sequêncial 2 - Leia a idade em dias
					Mostre a idade total em anos, meses e dias
 * Autor: Raquel Modesto
 * Data: 23/07/2021
 */
	
	funcao inicio()
	{
        inteiro anos
        inteiro meses
        inteiro dias
        inteiro resto
        inteiro resto2
        inteiro totaldedias


        escreva("Digite Sua Idade em dias: ")
        leia(totaldedias)

        anos = totaldedias / 365
        resto = totaldedias % 365
        meses = resto / 30
        resto2 = resto % 30

        escreva("Você tem " + anos + " anos, " + meses + " meses e " + resto2 + " dia(s).")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 158; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */