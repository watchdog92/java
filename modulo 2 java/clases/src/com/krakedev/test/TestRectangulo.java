package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo();
		
		int areaR1;
		int areaR2;
		double perimetroR1;
		double perimetroR2;
		
		r1.setBase(4);
		r1.setAltura(2);
		r2.setBase(8);
		r2.setAltura(3);
		
		areaR1=r1.calcularArea();
		System.out.println("area del rectangulo r1 es:"+areaR1);
		areaR2=r2.calcularArea();
		System.out.println("area del rectangulo r2 es:"+areaR2);
		
		perimetroR1=r1.calcularPerimetro();
		System.out.println("perimetro del rectangulo r1 es:"+perimetroR1);
		perimetroR2=r2.calcularPerimetro();
		System.out.println("perimetro del rectangulo r2 es:"+perimetroR2);
		
	}

}
