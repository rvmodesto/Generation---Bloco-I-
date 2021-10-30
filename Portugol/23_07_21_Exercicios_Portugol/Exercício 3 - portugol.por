programa{
/*Programa Sequêncial 3 - Leia o tempo de duração de um evento
 * 					Mostre-o em horas, minutos e segundos
 * Autor: Raquel Modesto
 * Data: 23/07/2021
 */
	funcao inicio()
	{
		inteiro horas, minutos, segundos
		
		escreva("Digite a duração do evento em segundos: ")
		leia(segundos)

		minutos = segundos / 60
		horas = minutos / 60

		escreva("O tempo do evento expresso em: " 
		+ "horas é: " + horas +
		 "\n minutos é: " + minutos + 
		 "\n segundos é: " +segundos) //180000
		 
		 }
				
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 511; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */