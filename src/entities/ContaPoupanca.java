package entities;

import java.util.Scanner;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;

	Scanner sc = new Scanner(System.in);
	
	public ContaPoupanca(String nomeCliente, int numeroConta) {
		super(nomeCliente, numeroConta);
				
		System.out.print("Qual o dia do Redimento? ");
		int diaRedimento = sc.nextInt();
		
		System.out.print("Qual o Percentual da taxa de Redimento? ");
		double taxaRendimento = sc.nextDouble();
		
		this.diaRendimento = diaRendimento;
		
		System.out.print("Quanto seja depositar?: ");
		double deposito = sc.nextDouble();		
				
		Depositar(deposito);
		calcularNovoSaldo(taxaRendimento);
		
		System.out.println("Saldo da Conta = R$ " + String.format("%.2f", this.saldoConta));
				
		System.out.print("Quanto deseja sacar?: ");
		double saque = sc.nextDouble();
		Sacar(saque);
		
		System.out.println("Saldo da Conta = R$ " + String.format("%.2f", this.saldoConta));
		
	}

	public ContaPoupanca() {
		  
	}


	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	public void calcularNovoSaldo(double taxaRendimento) {
		this.saldoConta = this.saldoConta + this.saldoConta * taxaRendimento / 100;
	}
	
	
}
