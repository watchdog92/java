package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado c1=new Cuadrado();
		Cuadrado c2=new Cuadrado();
		Cuadrado c3=new Cuadrado();
		
		double areaC1;
		double areaC2;
		double areaC3;
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;
		
		c1.lado=3;
		c2.lado=4;
		c3.lado=5.5;
		
		areaC1=c1.calcularArea();
		System.out.println("area del cuadrado c1 es:"+areaC1);
		areaC2=c2.calcularArea();
		System.out.println("area del cuadrado c2 es:"+areaC2);
		areaC3=c3.calcularArea();
		System.out.println("area del cuadrado c3 es:"+areaC3);
		
		perimetroC1=c1.calcularPerimetro();
		System.out.println("perimetro del cuadrado c1 es:"+perimetroC1);
		perimetroC2=c2.calcularPerimetro();
		System.out.println("perimetro del cuadrado c2 es:"+perimetroC2);
		perimetroC3=c3.calcularPerimetro();
		System.out.println("perimetro del cuadrado c3 es:"+perimetroC3);
	}

}
