package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		Telefono telef1=new Telefono("claro","098783232",38);
		Contacto c1 = new Contacto("Conlago",false,telef1,45.5);
		Telefono telef2=new Telefono("claro","092783832",22);
		Contacto c2 = new Contacto("Gonzales",false,telef2,90.5);
		AdminContactos adm=new AdminContactos();
		System.out.println(adm.buscarMasPesado(c1, c2));
		System.out.println(adm.compararOperadoras(c1, c2));
	}

}
