package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		int numerosClaro=0;
		Telefono telf1 = new Telefono("movi","098214234",30);
		Telefono telf2 = new Telefono("claro","092234234",40);
		Telefono telf3 = new Telefono("claro","098564234",50);
		Telefono telf4 = new Telefono("claro","098564114",60);
		
		AdminTelefono admin = new AdminTelefono();
		numerosClaro=admin.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println(numerosClaro);

	}
	

}
