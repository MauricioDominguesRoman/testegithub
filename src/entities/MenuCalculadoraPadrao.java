package entities;

import java.util.Scanner;

public class MenuCalculadoraPadrao {
	
	private int tipo;
	
	Scanner sc = new Scanner(System.in);
	
	public MenuCalculadoraPadrao() {
		
		System.out.println("Escolha o Tipo de Calculo:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Divisão");
		System.out.println("4 - Multiplicação");
		System.out.println("5 - Potenciação");
		System.out.println("6 - Sair");
		tipo = sc.nextInt();
		if (tipo == 6) {
			return;
		}
		
		CalculadoraPadrao cp = new CalculadoraPadrao();
		
		if (tipo == 5) {
			System.out.print("Entre com a base: ");
			double base = sc.nextDouble();
			System.out.print("Entre com a potencia: ");
			double potencia = sc.nextDouble();
			cp.setValor1(base);
			cp.setValor2(potencia);
			System.out.println("Resultado: " + cp.potencia());
			
		}
		else {
			System.out.print("Entre com o Primeiro Valor: ");
			double valor1 = sc.nextDouble();
			System.out.print("Entre com o Segundo Valor: ");
			double valor2 = sc.nextDouble();
			cp.setValor1(valor1);
			cp.setValor2(valor2);
			if (tipo == 1) {
				System.out.println("Resultado: " + cp.soma());
			}
			if (tipo == 2) {
				System.out.println("Resultado: " + cp.subtrai());
			}
			if (tipo == 3) {
				cp.divide();
			}
			if (tipo == 4) {
				System.out.println("Resultado: " + cp.multiplica());
			}
		}	
	}
		
}
