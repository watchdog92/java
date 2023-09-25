package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item i=new Item();
		Item i2=new Item();
		i.setProductosActuales(20);
		i2.setProductosActuales(100);
		System.out.println("PRODUCTO 1");
		i.imprimir();
		i.vender(12);
		i.imprimir();
		i.devolver(2);
		i.imprimir();
		System.out.println("PRODUCTO 2");
		i2.imprimir();
		i2.vender(80);
		i2.imprimir();
		i2.devolver(10);
		i2.imprimir();
	}

}
