package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		calcu=new Calculadora ();
		
		resultadoSuma=calcu.sumar(5, 3);
		System.out.println("resultado:"+resultadoSuma);
		
		resultadoResta=calcu.restar(5, 3);
		System.out.println("resultado:"+resultadoResta);
		
		resultadoMultiplicacion=calcu.multiplicar(10, 5);
		System.out.println("resultadoMultiplicacion:"+resultadoMultiplicacion);
		
		resultadoDivision=calcu.dividir(10, 2);
		System.out.println("resultadoDivision:"+resultadoDivision);
		
		resultadoPromedio=calcu.promediar(10,8,9);
		System.out.println("resultadoPromedio:"+resultadoPromedio);
		
		calcu.mostrarResultado();
		

	}

}
