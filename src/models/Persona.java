package models;

public class Persona {
	private int cedula;
	private String nombre;
	private TipoPersona tipoPersona;

	public Persona(int cedula, String nombre, TipoPersona tipoPersona) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.tipoPersona = tipoPersona;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

}
