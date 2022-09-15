package aplication;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEspecial;
import entities.ContaPoupanca;

public class Banco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int esc = 0;
		
		System.out.print("Digite o Nome do Correntista: ");
		String nomeCliente = sc.next();
		System.out.print("Digite o Numero da Conta: ");
		int numeroConta = sc.nextInt();
		
		while (esc == 0) {
			System.out.println();
			System.out.println("Qual o tipo da sua Conta? ");
			System.out.println("1 - Conta Corrente");
			System.out.println("2 - Conta Poupança");
			System.out.println("3 - Conta Investimento");
			System.out.println("4 - Sair");
			int tipoConta = sc.nextInt();
			System.out.println();	
		
			if (tipoConta == 1) {
				ContaCorrente cc = new ContaCorrente(nomeCliente, numeroConta);
				
			}
			else
				if (tipoConta == 2) {
					ContaPoupanca cp = new ContaPoupanca(nomeCliente, numeroConta);
					
				}
				else
					if (tipoConta == 3) {
						ContaEspecial ce = new ContaEspecial(nomeCliente, numeroConta);
						
					}
					else
						if (tipoConta == 4) {
							esc = 1;
						}
						else
							System.out.println("Opção Invalida");	
		}
			
		System.out.println("Tchau");
		
		sc.close();

	}

}
