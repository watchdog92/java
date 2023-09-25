package com.krakedev.controlflujo;

public class Validador{
	public void validarEdad(int edad) {
		// TODO Auto-generated method stub
		if(edad>=18) {
			System.out.println("Es mayor de edad");
		} else if(edad>=12 && edad<18) {
			System.out.println("Es adolescente");
		}else if(edad>0 && edad<12) {
			System.out.println("Es nino");
			
		}else {
			System.out.println("Edad incorrecta");
		}
		
		
	}

}