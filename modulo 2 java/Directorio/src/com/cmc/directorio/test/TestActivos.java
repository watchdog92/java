package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telef1=new Telefono("movi","098783232",38,true);
		Contacto c1 = new Contacto("Morales",false,telef1,35.5);
		System.out.println(c1);
		AdminContactos adm=new AdminContactos();
		adm.activarUsuario(c1);
		System.out.println(c1);
		
	}

}
