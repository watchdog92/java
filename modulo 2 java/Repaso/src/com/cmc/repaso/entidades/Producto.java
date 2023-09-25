package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	public double descuento;
	
	public Producto (String nombre,double precio) {
		this.nombre=nombre;	
		this.precio=precio;	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
		if(precio<0) {
			precio=precio*(-1);
		}
	}
	public double calcularPrecioPromo(double descuento) {
		this.descuento = descuento;
		descuento=descuento/100;
		precio=precio-(precio*descuento);
		return precio;
	}
	
	

	
}
