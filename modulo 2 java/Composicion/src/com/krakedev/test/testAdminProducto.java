package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class testAdminProducto {

	public static void main(String[] args) {
		Producto mc;
		AdminProducto admin=new AdminProducto();
		Producto productoA=new Producto("Doritos",0.50);
		Producto productoB=new Producto("Papitas",0.50);
		
		mc=admin.buscarMasCaro(productoA, productoB);
		if (mc==null) {
			System.out.println("son iguales");
		}else {
		System.out.println("el mas caro es: "+mc.getNombre());
		}
	}
}
