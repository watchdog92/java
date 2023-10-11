package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telef1=new Telefono("movi","098783832",98);
		Contacto c1 = new Contacto("Paredes",false,telef1,245.5);
		Telefono telef2=new Telefono("claro","092783832",92);
		Contacto c2 = new Contacto("Martinez",false,telef2,100.5);
		AdminContactos adm=new AdminContactos();
		System.out.println(adm.buscarMasPesado(c1, c2));
		System.out.println(adm.compararOperadoras(c1, c2));
	}

}
