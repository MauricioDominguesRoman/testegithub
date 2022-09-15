package entities;

public class AreaCirculo extends Figuras{
	
	private double raio;
		
	public AreaCirculo(double raio) {
		this.raio = raio;
	}

	
	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}


	public double CalculaArea() {
		return Math.PI * this.raio * this.raio;
		
	}

	
}
