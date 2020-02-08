package models;

public class Transporte {

	private int id;
	private double precio;
	private int cantidadBultos;

	public Transporte(int id, double precio, int cantidadBultos) {
		super();
		this.id = id;
		this.precio = precio;
		this.cantidadBultos = cantidadBultos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidadBultos() {
		return cantidadBultos;
	}

	public void setCantidadBultos(int cantidadBultos) {
		this.cantidadBultos = cantidadBultos;
	}

}
