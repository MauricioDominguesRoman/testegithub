package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.MenuCalculadoraArea;
import entities.MenuCalculadoraImc;
import entities.MenuCalculadoraPadrao;

public class Calculadora {
	
	  public static void main(String[] args) {

	        Locale.setDefault(Locale.US);

	        Scanner sc = new Scanner(System.in);
	        int calc;
	        int esc = 0;
	        
	        while (esc == 0) {
	        	System.out.println();
	        	System.out.println("Escolha o tipo de Calculadora");
	        	System.out.println("1 - Padrão");
	        	System.out.println("2 - IMC");
	        	System.out.println("3 - Area");
	        	System.out.println("4 - Sair");
	        
	        	calc = sc.nextInt();
 	        
	        	if (calc == 1){
	        		MenuCalculadoraPadrao mp = new MenuCalculadoraPadrao();
	        	}
	        	else
	        		if (calc == 2) {
	        			MenuCalculadoraImc mc = new MenuCalculadoraImc();
	        		}
	        		else 
	        			if (calc == 3) {
	        				MenuCalculadoraArea ma = new MenuCalculadoraArea();
	        			}
	        			else
	        				if (calc == 4) {
	        					esc = 1;
	        				}
	        				else
	        					System.out.println("Opção Invalida");
	        	}
	        
	        System.out.println("Tchau");
	        
	        sc.close();

	  }
}

