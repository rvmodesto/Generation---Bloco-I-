programa{
/*Programa: Ex.2 - Leia as variáveis C e N e calcule: 
 * 				- Salário - horas execendentes
 * Autor: Raquel Modesto
 * Data:26/07/2021
 */
	funcao inicio()
	{
	//Declaração de variáveis
	real C //código do funcionário
	real N // n° de horas trabalhadas/operário
	real E // execesso de pagamento
	real salario
	 
	 //Entrada de dados

	 escreva("Informe a matrícula do funcionário: ")
	 leia(C)

	 escreva("Informe a quantidade de horas trabalhadas: ")
	 leia(N)

	 //Processamento de dados

		
	 	se(N <= 50.0){
	 	salario =	N*10.00
	 	E = 0

	 	escreva("\nSalário: R$ " + salario +"." + "\nValor de horas excedentes: R$ " + E)
	 	escreva("\nSalário Total: R$ " + (salario + E))
	 	
	 	}
	 
	 	senao se(N >50.00) {
	 	salario = 50*10.00
	 	E =  (N - 50.00)*20
	 	

	 	escreva("Salário: R$ " + salario + "\nValor de horas excedentes: R$ " + E)
	 	escreva("\nSalário Total: R$ " + (salario + E))
	 
	 	}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 698; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */