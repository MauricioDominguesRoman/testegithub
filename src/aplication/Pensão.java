package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;

public class Pensão {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    Estudante[] estudante = new Estudante[10];
	    
	    System.out.print("Quantos quartos serão alugado?: ");
	    int quantidade = sc.nextInt();
	    sc.nextLine();
	    
	   	for (int i=1; i<=quantidade; i++) {
	   		System.out.print("nome: ");
	   		String nome = sc.nextLine();
	   		System.out.print("e-mail: ");
	   		String email = sc.nextLine();
	   		System.out.print("quarto: ");
	   		int quarto = sc.nextInt();
	   		sc.nextLine();
	   		estudante[quarto] = new Estudante(nome, email);  	
	   			   	
	   	}
	   	System.out.println();
	   	System.out.println("Quartos Ocupados");
	   	for (int i=0; i<10; i++) {
	   		if (estudante[i] != null) {
	   			System.out.println(i + " : " + estudante[i]);
	   				   			   			
	   		}
	   	}
	   	System.out.println();
	   	int quarto = 0;
	   	System.out.println("Quartos Ocupados");
	   	for (Estudante est : estudante) {
	   		if (est != null) {
	   			System.out.println(quarto + " : " + est);
	   				   			   			
	   		}
	   		quarto++;
	   	}
		sc.close();
		

	}

}

	