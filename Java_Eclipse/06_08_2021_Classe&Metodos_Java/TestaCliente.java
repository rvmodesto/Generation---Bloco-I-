package br.com.generation.cliente.ex1;

import java.util.Scanner;

public class TestaCliente {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		Clientes cliente1 = new Clientes();
		 cadastroCliente();
		 
		System.out.println("\t ======  Cadastro de Cliente  ======");
		System.out.println("Nome: ");
		cliente1.nome = in.next();
		
		System.out.println("RG: ");
		cliente1.rg = in.next();
		
		System.out.println("CPF: ");
		cliente1.cpf = in.next();
		
		System.out.println("Idade: ");
		cliente1.idade= in.next();
		
		System.out.println("E-mail: ");
		cliente1.email = in.next();
		
		System.out.println("Telefone: ");
		cliente1.telefone = in.next();

	
		
		System.out.println("\n\n\n\n\n\n\n");
	
		
		System.out.println("\t ======Cadastro de Cliente======");
		
		System.out.println("Nome: " + cliente1.nome);
		System.out.println("E-mail: " + cliente1.email);
		System.out.println("Telefone: " + cliente1.telefone);
		System.out.println("RG: " + cliente1.rg);
		System.out.println("CPF: " + cliente1.cpf);
		System.out.println("Data de Nascimento: " + cliente1.idade);
	
	
	
	}

	private static void cadastroCliente() {
	
		
	}

}
