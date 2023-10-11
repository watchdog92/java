package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef=new Telefono("movi","02993833",99);
		Contacto c=new Contacto("Pareja",telef,234.4);
		System.out.println(c);
	}

}
