package util;

public class ConversorCorrente {

	public static final double IOF = 1.06;
	
	public static double valorEmReais(double valorDolar, double dolar) {
		return valorDolar * dolar * IOF;	
	}
}
