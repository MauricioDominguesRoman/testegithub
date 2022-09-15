package entities;

import java.util.Scanner;

public class MenuCalculadoraImc {
	
	Scanner sc = new Scanner(System.in);
	
	public MenuCalculadoraImc() {
		
		System.out.print("Informe a altura: ");	
		double altura = sc.nextDouble();
		System.out.print("Informe o peso: ");	
		double peso = sc.nextDouble();
		CalculadorImc ci = new CalculadorImc(altura, peso);
		System.out.print("IMC: " + ci.CalculaImc());
		System.out.println();	
		
	}
	
	

}
