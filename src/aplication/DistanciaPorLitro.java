package aplication;

import java.util.Scanner;

import entities.ConsumoCombustivel;

public class DistanciaPorLitro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char escolha = 'S';
		
		while(escolha == 'S') {
			
			System.out.println();
        	System.out.print("Quantos Km/litro faz o veículo?: ");
        	double mediaporlitro = sc.nextDouble();
        	
        	System.out.print("Qual a velocidade média do veículo?: ");
        	double velocidademedia = sc.nextDouble();
        	
        	System.out.print("Quanto tempo até o destino?: ");
        	double tempogasto = sc.nextDouble();
        	
        	ConsumoCombustivel cc = new ConsumoCombustivel();
        	cc.setMediaporlitro(mediaporlitro);
        	cc.setTempogasto(tempogasto);
        	cc.setVelocidademedia(velocidademedia);
        	
        	double consumo = cc.Consumo();
        	
        	System.out.println();
        	System.out.println("Litros de Combustivel gasto: " + String.format("%.3f", consumo));     	

        	System.out.println("Dejesa Continuar S/N: ");
        	escolha = sc.next().charAt(0);
				
		}
		
		System.out.println("Tchau");
		
		sc.close();

	}

}
