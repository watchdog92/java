package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto produc=new Producto(233,"Fideos");
		produc.setDescripcion("producto comestible");
		produc.setPeso(35.4);
		produc.imprimir();
	}

}
