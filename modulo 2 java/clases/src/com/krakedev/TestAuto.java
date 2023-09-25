package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		auto1 = new Auto();
		Auto auto2;
		auto2 = new Auto();
		
		auto1.setMarca("Mercedes Benz");
		auto1.setAnio(2023);
		auto1.setPrecio(135000.99);
		auto2.setMarca("Suzuky");
		auto2.setAnio(2022);
		auto2.setPrecio(30000.00);
		System.out.println("--------------");
		// 5. Acceder a los atributos
		System.out.println("AUTO 1");
		System.out.println("marca:" + auto1.getMarca());
		System.out.println("anio:" + auto1.getAnio());
		System.out.println("precio:" + auto1.getPrecio());
		System.out.println("AUTO 2");
		System.out.println("marca:" + auto2.getMarca());
		System.out.println("anio:" + auto2.getAnio());
		System.out.println("precio:" + auto2.getPrecio());
	}

}
