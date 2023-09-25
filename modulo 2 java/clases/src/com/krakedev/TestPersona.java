package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1. Declaro una variable llamada p de tipo persona
		p = new Persona();// 2. Instanciar o crea un objeto persona y referenciarlo con p
		Persona p2;
		p2 = new Persona();
		// 3. Accedo a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());
		// 4. modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);
		System.out.println("--------------");
		// 5. Acceder a los atributos
		System.out.println("nombre:" + p.getNombre());
		System.out.println("edad:" + p.getEdad());
		System.out.println("estatura:" + p.getEstatura());

		p2.setNombre("Angelina");

		System.out.println("********");
		System.out.println("nombre:" + p.getNombre());
		System.out.println("nombre:" + p2.getNombre());

	}

}
