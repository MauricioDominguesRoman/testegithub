package entities;

public class AreaQuadrado extends Figuras {

	private double valor1;
		
	public AreaQuadrado(double valor1) {
		this.valor1 = valor1;
	}
		
	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}


	public double CalculaArea() {
		return this.valor1 * this.valor1;
		
	}
}
