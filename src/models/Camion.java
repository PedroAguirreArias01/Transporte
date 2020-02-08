package models;

public class Camion {

	private String Placa;
	private Capacidad capacidad;
	private boolean estadoCarro;
	private int velocidad;
	private int potencia;
	private Estado estadoMotor;
	private Estado estadoLlantas;

	public Camion(String placa, Capacidad capacidad, boolean estadoCarro, int velocidad, int potencia,
			Estado estadoMotor, Estado estadoLlantas) {
		super();
		Placa = placa;
		this.capacidad = capacidad;
		this.estadoCarro = estadoCarro;
		this.velocidad = velocidad;
		this.potencia = potencia;
		this.estadoMotor = estadoMotor;
		this.estadoLlantas = estadoLlantas;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
	}

	public Capacidad getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Capacidad capacidad) {
		this.capacidad = capacidad;
	}

	public boolean getEstadoCarro() {
		return estadoCarro;
	}

	public void setEstadoCarro(boolean estadoCarro) {
		this.estadoCarro = estadoCarro;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public Estado getEstadoMotor() {
		return estadoMotor;
	}

	public void setEstadoMotor(Estado estadoMotor) {
		this.estadoMotor = estadoMotor;
	}

	public Estado getEstadoLlantas() {
		return estadoLlantas;
	}

	public void setEstadoLlantas(Estado estadoLlantas) {
		this.estadoLlantas = estadoLlantas;
	}

}
