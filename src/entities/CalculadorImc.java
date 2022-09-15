package entities;

public class CalculadorImc {
	
	private double altura;
	private double peso;
	
	public void CalculadoraImc() {
		
	}

	public CalculadorImc(double altura, double peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double CalculaImc() {
		return this.altura * this.altura / this.peso;
	}
	

}
