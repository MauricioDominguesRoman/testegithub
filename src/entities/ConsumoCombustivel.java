package entities;

public class ConsumoCombustivel {
	
	private double velocidademedia;
	private double tempogasto;
	private double mediaporlitro;
	
	public ConsumoCombustivel() {
		
	}
	
	public ConsumoCombustivel(double velocidademedia, double tempogasto, double mediaporlitro) {
		this.velocidademedia = velocidademedia;
		this.tempogasto = tempogasto;
		this.mediaporlitro = mediaporlitro;
	}

	public double getVelocidademedia() {
		return velocidademedia;
	}

	public void setVelocidademedia(double velocidademedia) {
		this.velocidademedia = velocidademedia;
	}

	public double getTempogasto() {
		return tempogasto;
	}

	public void setTempogasto(double tempogasto) {
		this.tempogasto = tempogasto;
	}

	public double getMediaporlitro() {
		return mediaporlitro;
	}

	public void setMediaporlitro(double mediaporlitro) {
		this.mediaporlitro = mediaporlitro;
	}
	
	public double Consumo() {
		if (this.velocidademedia <= 0) {
			return 0;
		}
		return this.tempogasto * this.velocidademedia / this.mediaporlitro;
		
	
	}
	
	

}
