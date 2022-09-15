package entities;

import java.util.Scanner;

public class MenuCalculadoraArea {
	
	Scanner sc = new Scanner(System.in);
	
	public MenuCalculadoraArea() {
		
		System.out.println("Escolha o Tipo de Area:");
		System.out.println("1 - Circulo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Retangulo");
		System.out.println("4 - Sair");
		int tipo = sc.nextInt();
		if (tipo == 4) {
			return;
		}
		else
			if (tipo == 1) {
				System.out.print("Informe o Raio: ");
				double valor1 = sc.nextDouble();			
				Figuras ac = new AreaCirculo(valor1);
				System.out.println("Área: " + ac.CalculaArea());				
			}
			else
				if (tipo == 2) {
					System.out.print("Informe a Largura/Altura: ");
					double valor1 = sc.nextDouble();
					Figuras aq = new AreaQuadrado(valor1);
					System.out.println("Área: " + aq.CalculaArea());
					
				}
				else
					if (tipo == 3) {
						System.out.print("informe a altura: ");
						double altura = sc.nextDouble();
						System.out.print("informe a largura: ");
						double largura = sc.nextDouble();
						Figuras ar = new AreaRetangulo(altura, largura);
						System.out.println("Área: " + ar.CalculaArea());
					}
			
	}

	

	
}
