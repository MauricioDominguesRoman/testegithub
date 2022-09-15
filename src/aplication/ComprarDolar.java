package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.ConversorCorrente;

public class ComprarDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o Pre�o do Dolar: ");
		double valorDolar = sc.nextDouble();
		System.out.print("Quantos Dolares voc� ir� comprar: ");
		double dolar = sc.nextDouble();
		
		double valorEmReais = ConversorCorrente.valorEmReais(valorDolar, dolar);	
		System.out.printf("Voc� ir� gastar em Reais: %.2f%n", valorEmReais);
		
		sc.close();
		
	}

}
