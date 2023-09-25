package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		productoA = new Producto();
		Producto productoB;
		productoB = new Producto();
		Producto productoC;
		productoC = new Producto();
		
		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Dolor general");
		productoA.setStockActual(10);
		productoA.setPrecio(3.80);
		productoB.setNombre("Ibuprofeno");
		productoB.setDescripcion("Dolor de cabeza");
		productoB.setStockActual(20);
		productoB.setPrecio(5.00);
		productoC.setNombre("Mebocaina");
		productoC.setDescripcion("Dolor de garganta");
		productoC.setStockActual(100);
		productoC.setPrecio(6.37);
		
		System.out.println("--------------");
		// 5. Acceder a los atributos
		System.out.println("PRODUCTO A");
		System.out.println("nombre:" + productoA.getNombre());
		System.out.println("descripcion:" + productoA.getDescripcion());
		System.out.println("StockActual:" + productoA.getStockActual());
		System.out.println("precio:" + productoA.getPrecio());
		System.out.println("PRODUCTO B");
		System.out.println("nombre:" + productoB.getNombre());
		System.out.println("descripcion:" + productoB.getDescripcion());
		System.out.println("StockActual:" + productoB.getStockActual());
		System.out.println("precio:" + productoB.getPrecio());
		System.out.println("PRODUCTO C");
		System.out.println("nombre:" + productoC.getNombre());
		System.out.println("descripcion:" + productoC.getDescripcion());
		System.out.println("StockActual:" + productoC.getStockActual());
		System.out.println("precio:" + productoC.getPrecio());
	

	}

}
