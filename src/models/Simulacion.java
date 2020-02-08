package models;

public class Simulacion {

	public Transporte transporte;
	public Persona persona;
	public Camion camion;

	public Simulacion() {
		this.transporte = new Transporte(1, 22222, 20);
		this.camion = new Camion("uhh32", Capacidad.MEDIO, true, 30, 500, Estado.NORMAL, Estado.NORMAL);
		
	}
	
	public void simular() {
		
		
	}

}
