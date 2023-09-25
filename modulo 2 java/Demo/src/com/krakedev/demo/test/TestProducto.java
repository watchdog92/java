package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto produc=new Producto(233,"fideos");
		produc.setDescripcion("para cocinar");
		produc.setPeso(34.5);
		produc.imprimir();
		

	}

}
