programa{
/* Programa: Ex. Laços de Repetição 1 - Para: A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
				coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
				a) média do salário da população;
				b) média do número de filhos;
				c) maior salário;
				d) percentual de pessoas com salário até R$100,00.
 * Autor: Raquel Modesto
 * Data:27/07/2021 */
	funcao inicio()
	{
		real sal, somaSal = 0.0, somaF = 0.0,
		mediaSal, mediaF, maiorSal =0.0, 
		perc100, cont100 = 0.0
		
		inteiro numF, hab = 20, x

		para(x=1; x <= hab;x++){
			escreva("Digite o Salário: ")
			leia(sal)

			escreva("Digite o Número de Filhos: ")
			leia(numF)
			
			somaSal = somaSal + sal
			somaF = somaF + numF
			
			se(sal > maiorSal){
				maiorSal = sal
				}
			
			se(sal >= 100.00){
				cont100++
				}	

		}


		mediaSal = somaSal / hab
		mediaF = somaF / hab
		perc100 = (cont100*100) / hab

		escreva("M´dia Salarial da Cidade:" + mediaSal)
		escreva("\nMédia de Filhos dos Habitantes: " + mediaF)
		escreva("\nO maior Salário da Cidade: " + maiorSal)
		escreva("\nPorcentagem de Pessoas até R$ 100,00: " + perc100 ,"%")
		escreva("\nQuantidade de Pessoas até R$ 100,00: " + cont100)
		
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */