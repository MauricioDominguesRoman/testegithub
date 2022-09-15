package entities;

public class AreaRetangulo extends Figuras {
	
	private double altura;
	private double largura;
	
	
	public AreaRetangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double CalculaArea() {
		return this.altura * this.largura;
		
	}
	
}
