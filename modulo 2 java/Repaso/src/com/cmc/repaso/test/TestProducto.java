package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p=new Producto("Doritos",20);
		p.setPrecio(30);
		p.calcularPrecioPromo(50);
		}

	}


