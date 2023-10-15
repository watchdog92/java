package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		System.out.println(celda.getProducto().getNombre());

		System.out.println("CELDA:" + celda.getProducto());
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");
		// el nullPointerException se encuentra en la clase TestCelda en la linea 8, y
		// la variable que ocasiona es getProducto, ya que no tienen ningun valor y el
		// programa lo toma como nulo
		
	}
}
