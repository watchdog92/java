package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		int numerosMovi=0;
		Telefono telf1 = new Telefono("movi","098214234",30);
		Telefono telf2 = new Telefono("claro","092234234",40);
		Telefono telf3 = new Telefono("movi","098564234",50);
		
		AdminTelefono admin = new AdminTelefono();
		numerosMovi=admin.contarMovi(telf1, telf2, telf3);
		System.out.println(numerosMovi);

	}
	

}
