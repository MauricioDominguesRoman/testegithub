package entities;

import java.util.Scanner;

public class ContaEspecial extends ContaBancaria {
	
	private double chequeEspecial;
	
	Scanner sc = new Scanner(System.in);

	public ContaEspecial(String nomeCliente, int numeroConta) {
		super(nomeCliente, numeroConta);
		
		System.out.print("Qual o valor do Cheque Especial? ");
		double chequeEspecial = sc.nextDouble();
		
		System.out.print("Quanto deseja depositar?: ");
		double deposito = sc.nextDouble();
		
		this.chequeEspecial = chequeEspecial;
		Depositar(deposito);
		
		System.out.println("Saldo da Conta = R$ " + String.format("%.2f", this.saldoConta));
		
		System.out.print("Quanto deseja sacar?: ");
		double saque = sc.nextDouble();
		Sacar(saque);
		
		System.out.println("Saldo da Conta = R$ " + String.format("%.2f", this.saldoConta));
	}

	public ContaEspecial() {
		
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	@Override
	public void Sacar(double saque) {
		if (saque > this.saldoConta + this.chequeEspecial) {
			System.out.println("Saldo para Saque Insulficiente");
			return;
		}
		this.saldoConta = this.saldoConta - saque;
	}
	
	
	

}
