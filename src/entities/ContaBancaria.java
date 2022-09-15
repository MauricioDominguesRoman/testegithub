package entities;

import java.util.Locale;
import java.util.Scanner;


public class ContaBancaria {
	
	protected String nomeCliente;
	protected int numeroConta;
	protected double saldoConta;
		
	public ContaBancaria() {
		
	}

	public ContaBancaria(String nomeCliente, int numeroConta, double saldoConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		
	}
	
	public ContaBancaria(String nomeCliente, int numeroConta) {
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		
		
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
	
	public void Sacar(double saque) {
		if (saque > this.saldoConta) {
			System.out.println("Saldo para Saque Insulficiente");
			return;
			
		}
		this.saldoConta -= saque;
	}
	
	public void Depositar(double deposito) {
		this.saldoConta += deposito;
	}

}
