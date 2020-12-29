package models;

public class Car {
	////////// ATRIBUTOS //////////
	private String marca, modelo, cilindrada;
	private double precio;
	private int puertas;
	
	
	////////// CONSTRUCTOR //////////
	public Car(String marca, String modelo, String cilindrada, double precio, int puertas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.precio = precio;
		this.puertas = puertas;
	}
	
	////////// GETTERS & SETTERS //////////
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	
}
