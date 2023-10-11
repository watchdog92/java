package com.cmc.directorio.entidades;

public class Contacto {
	private String apellido;
	private boolean activo;	
	private Telefono telefono;
	private double peso;
	public Contacto(String apellido, Telefono telefono, double peso) {
		this.apellido = apellido;
		this.telefono = telefono;
		this.peso = peso;
	}
	public Contacto() {
	}

	
	public Contacto(String apellido, boolean activo, Telefono telefono, double peso) {
		super();
		this.apellido = apellido;
		this.activo = activo;
		this.telefono = telefono;
		this.peso = peso;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	public Telefono getTelefono() {
		return telefono;
	}
	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Contacto [apellido=" + apellido + ", activo=" + activo + ", telefono=" + telefono + ", peso=" + peso
				+ "]";
	}
	
	
}
