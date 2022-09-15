package entities;

public class CalculadoraPadrao {

	private double valor1;
	private double valor2;
	
	public CalculadoraPadrao() {
		
	}
	
		
	public CalculadoraPadrao(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public double getValor1() {
		return this.valor1;
	}


	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}


	public double getValor2() {
		return valor2;
	}


	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}


	public double soma() {
		return this.valor1 + this.valor2;				
	}
	public double subtrai() {
		return this.valor1 - this.valor2;
				
	}
	
	public void divide() {
		if (this.valor2 == 0) {
			System.out.println("Segundo Valor não pode ser Zeros");
			return;
		}
		System.out.println("Resultado: " + this.valor1 / this.valor2);
		return;
				
	}
	public double multiplica() {
		return this.valor1 * this.valor2;
		
		
	}
	public double potencia() {
		return Math.pow(this.valor2, this.valor1);
		
	}
	
}
