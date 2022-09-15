package entities;

import java.util.Scanner;

public class ContaCorrente extends ContaBancaria{
	
		
	Scanner sc = new Scanner(System.in);
	
	public ContaCorrente(String nomeCliente, int numeroConta) {
		super(nomeCliente, numeroConta);
					
		System.out.print("Quanto deseja depositar?: ");
		double deposito = sc.nextDouble();
		Depositar(deposito);
		
		System.out.println("Saldo da Conta = R$ " + String.format("%.2f", this.saldoConta));
		
		System.out.print("Quanto deseja sacar?: ");
		double saque = sc.nextDouble();
		Sacar(saque);	
		
		System.out.println("Saldo da Conta = R$ " + String.format("%.2f", this.saldoConta));
		
	}

	public ContaCorrente() {
		
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
}
