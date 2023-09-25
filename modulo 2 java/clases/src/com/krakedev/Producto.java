package com.krakedev;

public class Producto {
	private String nombre;
	private String descripcion;
	private int StockActual;
	private double precio;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getStockActual() {
		return StockActual;
	}
	public void setStockActual(int stockActual) {
		StockActual = stockActual;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
